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

		[Export ("numberOfRowsInTableView:")]
		public int NumberOfRowsInTableView(NSTableView table)
		{
			return Elements.Count;
		}

		[Export ("tableView:objectValueForTableColumn:row:")]
		public NSObject ObjectValueForTableColumn(NSTableView table, NSTableColumn col, int row)
		{
			if(row >= Elements.Count)
			{
				return null;
			}

			SearchIndex currentElement = Elements[row];
			return new NSString(currentElement.Type + ": " + currentElement.Name);
		}
	
	}
}

