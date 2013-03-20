using System;
using System.Collections.Generic;

namespace Tocument
{
	public class DocumentNode
	{
		public List<DocumentNode> Children;
		public DocumentEntry Entry;

		public DocumentNode(DocumentEntry Entry)
		{
			this.Entry = Entry;
		}

		public override String ToString()
		{
			String s = Entry.ToString();
			if(Children != null)
			{
				foreach(var Child in Children)
				{
					s += Child.ToString();
				}
			}
			return s;
		}
	}
}

