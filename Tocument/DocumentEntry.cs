using System;
using System.Data.Linq.Mapping;

namespace Tocument
{

	[Table(Name = "searchIndex")]
	public class DocumentEntry
	{
		[Column(Name = "id", IsPrimaryKey = true)]
		public int ID;
		
		[Column(Name = "name")]
		public string Name;
		
		[Column(Name = "type")]
		public string Type;

		[Column(Name = "path")]
		public string Path;
	}
}



