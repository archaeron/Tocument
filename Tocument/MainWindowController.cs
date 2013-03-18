
using System;
using System.IO;
using System.Collections.Generic;
using System.Linq;
using MonoMac.Foundation;
using MonoMac.AppKit;

namespace Tocument
{
	public partial class MainWindowController : MonoMac.AppKit.NSWindowController
	{
		DocumentSearcher docSearcher;
		String docPath = Path.Combine (Environment.GetFolderPath(Environment.SpecialFolder.Personal), "Documents", "Tocuments", "Mono.docset", "Contents", "Resources", "Documents");
		
		#region Constructors
		
		// Called when created from unmanaged code
		public MainWindowController (IntPtr handle) : base (handle)
		{
			Initialize ();
		}
		
		// Called when created directly from a XIB file
		[Export ("initWithCoder:")]
		public MainWindowController (NSCoder coder) : base (coder)
		{
			Initialize ();
		}
		
		// Call to load from the XIB/NIB file
		public MainWindowController () : base ("MainWindow")
		{
			Initialize ();
		}
		
		// Shared initialization code
		void Initialize ()
		{
			var documents = Environment.GetFolderPath(Environment.SpecialFolder.Personal);
			
			String dbPath = Path.Combine (documents, "Documents", "Tocuments", "Mono.docset", "Contents", "Resources", "docSet.dsidx");
			Console.WriteLine(dbPath);
			
			docSearcher = new DocumentSearcher(dbPath);
		}
		
		#endregion
		
		public override void AwakeFromNib ()
		{
			base.AwakeFromNib ();

			LoadDocumentationFromPath("index.html");

			MethodListDataSourceDelegate methodListDataSourceDelegate = new MethodListDataSourceDelegate();
			methodListDataSourceDelegate.ItemChanged += HandleItemChanged;

			methodList.Delegate = methodListDataSourceDelegate;

			methodList.DataSource = new MethodListDataSource();

			base.AcceptsFirstResponder ();
			searchField.BecomeFirstResponder ();

			searchSubmit.Activated += PerformSearch;

			startSearchButton.Activated += PerformSearch;
		}

		void PerformSearch(object sender, EventArgs e)
		{
			String searchQuery = searchField.StringValue;
			List<DocumentEntry> searchResultsSQL = docSearcher.SearchSQL(searchQuery);
			List<DocumentEntry> SortedList = searchResultsSQL.OrderBy(o=>o.Type).ToList();

			((MethodListDataSource)methodList.DataSource).Elements = SortedList;
			methodList.ReloadData();
			
			if(SortedList.Count > 0)
			{
				LoadDocumentationFromPath(SortedList.First().Path);
			}
		}

		void HandleItemChanged(object sender, MyItemChangedEventArgs e)
		{
			LoadDocumentationFromPath(e.MyItem.Path);
		}

		void LoadDocumentationFromPath(String path)
		{
			NSUrl url = new NSUrl(Path.Combine(docPath, path));
			NSUrlRequest request = new NSUrlRequest(url);
			resultView.MainFrame.LoadRequest(request);
		}
		
		//strongly typed window accessor
		public new MainWindow Window {
			get
			{
				return (MainWindow)base.Window;
			}
		}
	}
}
