using System;
using System.Collections.Generic;

namespace Tocument
{
	public class DocumentNode
	{
		public List<DocumentNode> Children;
		public DocumentEntry Entry;

		public DocumentNode(DocumentEntry entry)
		{
			this.Entry = entry;
		}

		public override String ToString()
		{
			String s = Entry.ToString();
			return s;
		}
	}
}

