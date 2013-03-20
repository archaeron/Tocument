using System;
using MonoMac.AppKit;
using MonoMac.Foundation;
using System.Collections.Generic;

namespace Tocument.Mac
{

	public class MethodListDataSource : NSOutlineViewDataSource
	{
		public List<DocumentNode> Elements;

		public List<DocumentNode> prepareShouldBeSimpleTree()
		{
			DocumentEntry entry1 = new DocumentEntry();
			entry1.Name = "Mono";
			entry1.Path = "index.html";
			DocumentEntry entry2 = new DocumentEntry();
			entry2.Name = "Mono.String";
			entry2.Path = "index.html";
			DocumentEntry entry3 = new DocumentEntry();
			entry3.Name = "Mono.String.concat";
			entry3.Path = "index.html";
			DocumentEntry entry4 = new DocumentEntry();
			entry4.Name = "Mono.String.compare";
			entry4.Path = "index.html";
			DocumentEntry entry5 = new DocumentEntry();
			entry5.Name = "Mono.Integer";
			entry5.Path = "index.html";
			DocumentEntry entry6 = new DocumentEntry();
			entry6.Name = "Mono.Integer.add";
			entry6.Path = "index.html";
			
			List<DocumentNode> monoStringChildren = new List<DocumentNode>();
			monoStringChildren.Add(new DocumentNode(entry3));
			monoStringChildren.Add(new DocumentNode(entry4));
			
			List<DocumentNode> monoIntegerChildren = new List<DocumentNode>();
			monoIntegerChildren.Add(new DocumentNode(entry6));
			
			
			DocumentNode monoString = new DocumentNode(entry2);
			monoString.Children = monoStringChildren;
			
			DocumentNode monoInteger = new DocumentNode(entry5);
			monoInteger.Children = monoIntegerChildren;
			
			List<DocumentNode> monoChildren = new List<DocumentNode>();
			monoChildren.Add(monoString);
			monoChildren.Add(monoInteger);
			
			DocumentNode mono = new DocumentNode(entry1);
			mono.Children = monoChildren;
			
			List<DocumentNode> shouldBeTree = new List<DocumentNode>();
			shouldBeTree.Add(mono);
			
			return shouldBeTree;
		}

		public MethodListDataSource()
		{
			Elements = prepareShouldBeSimpleTree();
		}

		public NSDictionary makeNSDictionaryFromNode(DocumentNode node)
		{
			return new NSDictionary();
		}

		public override int GetChildrenCount(NSOutlineView outlineView, NSObject objectItem)
		{
			if(objectItem == null)
			{
				return Elements.Count;
			}
			DocumentNode item = (objectItem as NSNodeBox).Node;
			if(item.Children == null)
			{
				return 0;
			}

			return item.Children.Count;
		}

		public override NSObject GetChild(NSOutlineView outlineView, int childIndex, MonoMac.Foundation.NSObject ofItem)
		{
			if(ofItem == null)
			{
				return new NSNodeBox(Elements[childIndex]);
			}

			DocumentNode node = (ofItem as NSNodeBox).Node;

			return new NSNodeBox(node.Children[childIndex]);
		}

		public override NSObject GetObjectValue (NSOutlineView outlineView, NSTableColumn forTableColumn, NSObject byItem)
		{
			if(byItem == null)
			{
				return new NSString("Was null");
			}

			return (NSString)(byItem as NSNodeBox).Node.Entry.Name;
		}

		public override bool ItemExpandable (NSOutlineView outlineView, MonoMac.Foundation.NSObject item)
		{
			DocumentNode node = (item as NSNodeBox).Node;
			return node.Children != null && node.Children.Count > 0;
		}

		public NSObject ObjectValueForTableColumn(NSTableView table, NSTableColumn col, int row)
		{
			if(row >= Elements.Count)
			{
				return null;
			}

			DocumentNode currentElement = Elements[row];
			return new NSString(currentElement.Entry.Type + ": " + currentElement.Entry.Name);
		}
	
	}
	
	public class NSNodeBox : NSObject
	{
		public DocumentNode Node;
		
		public NSNodeBox(DocumentNode node)
		{
			this.Node = node;
		}
	}
}

