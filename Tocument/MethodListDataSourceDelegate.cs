using System;
using MonoMac.AppKit;
using MonoMac.Foundation;

namespace Tocument.Mac
{

	public class MethodListDelegate : NSOutlineViewDelegate
	{

		public event EventHandler<MyItemChangedEventArgs> ItemChanged;
			
		public override void SelectionDidChange(NSNotification notification)
		{
			Console.WriteLine("clicked");
			var table = notification.Object as NSTableView;

			var rowNum = table.SelectedRow;
			Console.WriteLine(rowNum);
//			
//			var ds = (MethodListDataSource)table.DataSource;
//			
//			var rowNum = table.SelectedRow;
//		
//			if (rowNum >= 0 && rowNum < ds.Elements.Count)
//			{
//					OnMyItemChanged(new MyItemChangedEventArgs(ds.Elements[rowNum]));
//			}
		}
			
		protected void OnMyItemChanged(MyItemChangedEventArgs e)
		{
			if (ItemChanged != null)
			{
				ItemChanged(this, e);
			}
		}
	}
		
	public class MyItemChangedEventArgs : EventArgs
	{
		public DocumentEntry MyItem { get; set; }
		
		public MyItemChangedEventArgs(DocumentEntry i)
		{
			MyItem = i;
		}
	}
}
