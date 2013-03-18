using System;
using MonoMac.AppKit;
using MonoMac.Foundation;
using System.Collections.Generic;

namespace Tocument
{
	[Register ("MethodListDataSource")]
	public class MethodListDataSource : NSTableViewDataSource
	{
		public List<SearchIndex> Elements
		{ get; set; }

		public MethodListDataSource()
		{
			Elements = new List<SearchIndex>();
		}

		// This method will be called by the NSTableView control to learn the number of rows to display.
		[Export ("numberOfRowsInTableView:")]
		public int NumberOfRowsInTableView(NSTableView table)
		{
			return Elements.Count;
		}
		
		// This method will be called by the control for each column and each row.
		[Export ("tableView:objectValueForTableColumn:row:")]
		public NSObject ObjectValueForTableColumn(NSTableView table, NSTableColumn col, int row)
		{
			Console.WriteLine(row);
			if(row >= Elements.Count)
				return null;

			return new NSString(Elements[row].Name);
		}
	}
}

