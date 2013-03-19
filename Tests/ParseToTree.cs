using System;
using NUnit.Framework;
using System.Collections.Generic;
using Tocument;

namespace Tests
{
	[TestFixture()]
	public class ParseToTree
	{
		public Queue<DocumentNode> prepareQueueForSimpleTree()
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

			List<DocumentNode> child2_1 = new List<DocumentNode>();
			child2_1.Add(new DocumentNode(entry2));
			child2_1.Add(new DocumentNode(entry3));

			List<DocumentNode> child2_2 = new List<DocumentNode>();

			List<DocumentNode> child1_1 = new List<DocumentNode>();

			List<DocumentNode> shouldBeTree = new List<DocumentNode>();

			return shouldBeTree;
		}


		[Test()]
		public void ParseSimpleTree()
		{
			Queue<DocumentNode> preparedQueue = prepareQueueForSimpleTree();

			List<DocumentNode> tree = DocumentSearcher.readSearchQuery(preparedQueue);

			List<DocumentNode> shouldBeTree = prepareShouldBeSimpleTree();

			Assert.AreEqual(shouldBeTree, tree, "Is the parsed tree correct");
		}
	}
}

