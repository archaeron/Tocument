using System;
using MonoMac.AppKit;
using MonoMac.Foundation;

namespace Tocument
{

	public class MethodListDataSourceDelegate : NSTableViewDelegate
	{
		public event EventHandler<MyItemChangedEventArgs> MyItemChanged;

			
		public override void SelectionDidChange(NSNotification notification)
		{
			var table = notification.Object as NSTableView;
			
			var ds = table.DataSource as MethodListDataSource;
			
			var rowNum = table.SelectedRow;
		
			Console.WriteLine(rowNum);

//				if (rowNum >= 0 && rowNum < ds.MyItems.Count)
//					OnMyItemChanged(new MyItemChangedEventArgs(ds.MyItems[rowNum]));
			}
			
//			protected void OnMyItemChanged(MyItemChangedEventArgs e) {
//				if (MyItemChanged != null)
//					MyItemChanged(this, e);
//			}
		}
		
	public class MyItemChangedEventArgs : EventArgs
	{
		public SearchIndex MyItem { get; set; }
		
		public MyItemChangedEventArgs(SearchIndex i)
		{
			MyItem = i;
		}
	}
}

