using System;
using MonoMac.AppKit;
using MonoMac.Foundation;
using System.Collections.Generic;

namespace Tocument
{

	public class MethodListDataSource : NSOutlineViewDataSource
	{
		public List<DocumentEntry> Elements
		{ get; set; }

		int c = 0;

		public MethodListDataSource()
		{
			Elements = new List<DocumentEntry>();
		}

		[Export ("numberOfChildrenOfItem:")]
		public override int GetChildrenCount(NSOutlineView outlineView, NSObject item)
		{
			if(c < 4)
			{
				return c++;
			}
			return 0;
		}

		[Export ("child:ofItem:")]
		public override NSObject GetChild(NSOutlineView outlineView, int childIndex, MonoMac.Foundation.NSObject ofItem)
		{
			return new NSString("sfdgsd");
		}

		[Export ("objectValueForTableColumn:byItem:")]
		public override NSObject GetObjectValue (NSOutlineView outlineView, NSTableColumn forTableColumn, NSObject byItem)
		{
			return new NSString("heloooo");
		}

		public override bool ItemExpandable (NSOutlineView outlineView, MonoMac.Foundation.NSObject item)
		{
			return true;
		}

		[Export ("tableView:objectValueForTableColumn:row:")]
		public NSObject ObjectValueForTableColumn(NSTableView table, NSTableColumn col, int row)
		{
			if(row >= Elements.Count)
			{
				return null;
			}

			DocumentEntry currentElement = Elements[row];
			return new NSString(currentElement.Type + ": " + currentElement.Name);
		}
	
	}
}

