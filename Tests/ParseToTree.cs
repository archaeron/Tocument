using System;
using NUnit.Framework;
using System.Collections.Generic;
using Tocument;

namespace Tests
{
	[TestFixture()]
	public class ParseToTree
	{
		[Test()]
		public void Parse()
		{
			DocumentEntry entry1 = new DocumentEntry();
			entry1.Name = "Mono";
			DocumentEntry entry2 = new DocumentEntry();
			entry2.Name = "Mono.String";

			Queue<DocumentEntry> queue = new Queue<DocumentEntry>();
			queue.Enqueue(entry1);
			queue.Enqueue(entry2);

			DocumentSearcher.readSearchQuery(queue);
		}
	}
}

