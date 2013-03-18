
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

			var documents = Environment.GetFolderPath(Environment.SpecialFolder.Personal);
			String docPath = Path.Combine (documents, "Documents", "Tocuments", "Mono.docset", "Contents", "Resources", "Documents");
			Console.WriteLine(docPath);
			NSUrl url = new NSUrl(Path.Combine(docPath, "index.html"));
			NSUrlRequest request = new NSUrlRequest(url);
			resultView.MainFrame.LoadRequest(request);


			startSearchButton.Activated +=  (object sender, EventArgs e) =>
			{
				String searchQuery = searchField.StringValue;
				
				List<SearchIndex> searchResultsSQL = docSearcher.SearchSQL(searchQuery);
				Console.WriteLine(searchResultsSQL);
				
//				Console.WriteLine("begin searching with LINQ");
//				var searchResults = docSearcher.Search(searchQuery);
				

				Console.WriteLine(Path.Combine(docPath, searchResultsSQL.First().Path));
				NSUrl docUrl = new NSUrl(Path.Combine(docPath, searchResultsSQL.First().Path));
				NSUrlRequest docRequest = new NSUrlRequest(docUrl);
				resultView.MainFrame.LoadRequest(docRequest);
//
//				foreach(var result in searchResults)
//				{
//					Console.WriteLine(result.Name + ": " + result.Path);
//				}
//				Console.WriteLine("end searching with LINQ");
				methodList.

			};
		}
		
		//strongly typed window accessor
		public new MainWindow Window {
			get {
				return (MainWindow)base.Window;
			}
		}
	}
}
