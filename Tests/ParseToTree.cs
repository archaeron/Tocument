using System;
using NUnit.Framework;
using System.Collections.Generic;
using Tocument;

namespace Tests
{
	[TestFixture()]
	public class ParseToTree
	{
		public Queue<DocumentEntry> prepareQueueForSimpleTree()
		{
			DocumentEntry entry1 = new DocumentEntry();
			entry1.Name = "Mono";
			DocumentEntry entry2 = new DocumentEntry();
			entry2.Name = "Mono.String";
			DocumentEntry entry3 = new DocumentEntry();
			entry3.Name = "Mono.String.concat";
			DocumentEntry entry4 = new DocumentEntry();
			entry4.Name = "Mono.String.compare";
			DocumentEntry entry5 = new DocumentEntry();
			entry5.Name = "Mono.Integer";
			DocumentEntry entry6 = new DocumentEntry();
			entry6.Name = "Mono.Integer.add";
			
			Queue<DocumentEntry> queue = new Queue<DocumentEntry>();
			queue.Enqueue(entry1);
			queue.Enqueue(entry2);
			queue.Enqueue(entry3);
			queue.Enqueue(entry4);
			queue.Enqueue(entry5);
			queue.Enqueue(entry6);

			return queue;
		}

		public List<DocumentNode> prepareShouldBeSimpleTree()
		{
			DocumentEntry entry1 = new DocumentEntry();
			entry1.Name = "Mono";
			DocumentEntry entry2 = new DocumentEntry();
			entry2.Name = "Mono.String";
			DocumentEntry entry3 = new DocumentEntry();
			entry3.Name = "Mono.String.concat";
			DocumentEntry entry4 = new DocumentEntry();
			entry4.Name = "Mono.String.compare";
			DocumentEntry entry5 = new DocumentEntry();
			entry5.Name = "Mono.Integer";
			DocumentEntry entry6 = new DocumentEntry();
			entry6.Name = "Mono.Integer.add";

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


		[Test()]
		public void ParseSimpleTree()
		{
			Queue<DocumentEntry> preparedQueue = prepareQueueForSimpleTree();

			List<DocumentNode> tree = DocumentSearcher.readSearchQuery(preparedQueue);

			List<DocumentNode> shouldBeTree = prepareShouldBeSimpleTree();

			Assert.AreEqual(shouldBeTree, tree, "Is the parsed tree correct");
		}
	}
}

