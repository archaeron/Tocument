using System;
using System.Collections.Generic;
using System.IO;
using Mono.Data.Sqlite;
using System.Linq;
using System.Data.Linq;
using System.Text;

namespace Tocument
{
	public class DocumentSearcher
	{
		String databasePath;
		
		public DocumentSearcher (String databasePath)
		{
			this.databasePath = databasePath;
			if(! File.Exists (this.databasePath))
			{
				throw new Exception("your database does not exist: " + this.databasePath );
			}
		}
		
		public SqliteConnection CreateConnection(String databasePath)
		{
			return new SqliteConnection("Data Source=" + this.databasePath + ",version=3");
		}
		
		public List<DocumentNode> SearchSQL(String searchQuery)
		{
			Console.WriteLine("Searching for: " + searchQuery);
			var connection = CreateConnection(this.databasePath);
			
			List<DocumentEntry> result = new List<DocumentEntry>();
			
			using (var cmd = connection.CreateCommand ())
			{
				connection.Open ();
				String sqlQuery = "SELECT name, path, type FROM searchIndex WHERE name LIKE @searchQuery ORDER BY name LIMIT 100";
				cmd.CommandText = sqlQuery;
				cmd.Parameters.AddWithValue("searchQuery", "%" + searchQuery + "%");

				using (var reader = cmd.ExecuteReader ())
				{
					while (reader.Read ())
					{
						DocumentEntry entry = new DocumentEntry();
						entry.Name = (String)reader[0];
						entry.Path = (String)reader[1];
						entry.Type = (String)reader[2];

						result.Add(entry);
					}
				}
				connection.Close ();
			}

			Queue<DocumentEntry> queue = new Queue<DocumentEntry>(result);

			List<DocumentNode> dict = readSearchQuery(queue);
			Console.WriteLine("List: " + dict);
			return dict;
		}

		public static List<DocumentNode> readSearchQuery(Queue<DocumentEntry> input)
		{
			if(input.Count < 1)
			{
				return null;
			}

			List<DocumentNode> nodeList = new List<DocumentNode>();

			DocumentEntry entry = input.Dequeue();
			DocumentNode node = new DocumentNode(entry);

			nodeList.Add(node);

//			while(input.Count > 0)
//			{
//
//			}
			DocumentEntry nextEntry = input.Peek();

			Console.WriteLine(entry);
			Console.WriteLine(nextEntry);

			List<DocumentNode> childrenList = new List<DocumentNode>();;
			while(input.Count > 0 && nextEntry.Name.Contains(entry.Name))
			{
				nextEntry = input.Dequeue();
				DocumentNode nextNode = new DocumentNode(nextEntry);
				childrenList.Add(nextNode);
			}
			node.Children = childrenList;

			while(input.Count > 0 && !nextEntry.Name.Contains(entry.Name))
			{
				nextEntry = input.Dequeue();
				DocumentNode nextNode = new DocumentNode(nextEntry);
				nodeList.Add(nextNode);
			}

//
//			while(input.Count > 0)
//			{
//				Console.WriteLine(input.Dequeue());
//			}
//			
//
//			DocumentNode node = new DocumentNode(entry);
//			String name = entry.Name;
//
//
//			bool goOn = true;
//			position++;
//			while(position < input.Count && goOn)
//			{
//				DocumentEntry nextEntry = input[position];
//				bool isChild = nextEntry.Name.Contains(name);
//				if(isChild)
//				{
//					Console.WriteLine("child!");
//					Console.WriteLine(nextEntry);
//					readSearchQuery(input, position);
//					position++;
//				}
//				else
//				{
//					break;
//				}
//			}

//			readSearchQuery(input, position+1);
			return nodeList;
		}
		
//		public IQueryable<DocumentEntry> Search(String searchQuery)
//		{
//			Console.WriteLine("Searching for: " + searchQuery);
//			var connection = CreateConnection(this.databasePath);
//			
//			var linq = new DataContext (connection);
//			linq.Log = Console.Out;
//			
//			
//			
//			Table<DocumentEntry> table = linq.GetTable<DocumentEntry>();
//			
//			var query = from doc in table
//				where doc.Name.Contains("Mono")
//				select doc;
//			
//			return query;
//		}
//		
	}
	
}
