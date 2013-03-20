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
			var table = notification.Object as NSOutlineView;

			var rowNum = table.SelectedRow;
			DocumentNode node = (table.ItemAtRow(rowNum) as NSNodeBox).Node;
			Console.WriteLine(node);

			OnMyItemChanged(new MyItemChangedEventArgs(node.Entry));
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
