using System;
using MonoMac.AppKit;
using MonoMac.Foundation;

//namespace Tocument
//{
//
//	public class MethodListDataSourceDelegate : NSTableViewDelegate
//	{
//		public event EventHandler<MyItemChangedEventArgs> ItemChanged;
//			
//		public override void SelectionDidChange(NSNotification notification)
//		{
//			var table = notification.Object as NSTableView;
//			
//			var ds = (MethodListDataSource)table.DataSource;
//			
//			var rowNum = table.SelectedRow;
//		
//			if (rowNum >= 0 && rowNum < ds.Elements.Count)
//			{
//					OnMyItemChanged(new MyItemChangedEventArgs(ds.Elements[rowNum]));
//			}
//		}
//			
//		protected void OnMyItemChanged(MyItemChangedEventArgs e)
//		{
//			if (ItemChanged != null)
//			{
//				ItemChanged(this, e);
//			}
//		}
//	}
//		
//	public class MyItemChangedEventArgs : EventArgs
//	{
//		public DocumentEntry MyItem { get; set; }
//		
//		public MyItemChangedEventArgs(DocumentEntry i)
//		{
//			MyItem = i;
//		}
//	}
//}
