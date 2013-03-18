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
			Console.WriteLine("loading database");
			return new SqliteConnection("Data Source=" + this.databasePath + ",version=3");
		}
		
		public List<SearchIndex> SearchSQL(String searchQuery)
		{
			Console.WriteLine("Searching for: " + searchQuery);
			var connection = CreateConnection(this.databasePath);
			
			List<SearchIndex> result = new List<SearchIndex>();
			
			using (var cmd = connection.CreateCommand ())
			{
				connection.Open ();
				String sqlQuery = "SELECT name FROM searchIndex WHERE name LIKE @searchQuery";
				Console.WriteLine(sqlQuery);
				cmd.CommandText = sqlQuery;
				cmd.Parameters.AddWithValue("searchQuery", "%" + searchQuery + "%");
				var l = cmd.Parameters;
				using (var reader = cmd.ExecuteReader ())
				{
					while (reader.Read ())
					{
						Console.Error.Write ("(Row ");
						Write (reader, 0);
						for (int i = 1; i < reader.FieldCount; ++i)
						{
							Console.Error.Write(" ");
							Write (reader, i);
						}
						Console.Error.WriteLine(")");
					}
				}
				connection.Close ();
			}
			
			return result;
		}
		
		public IQueryable<SearchIndex> Search(String searchQuery)
		{
			Console.WriteLine("Searching for: " + searchQuery);
			var connection = CreateConnection(this.databasePath);
			
			var linq = new DataContext (connection);
			linq.Log = Console.Out;
			
			
			
			Table<SearchIndex> table = linq.GetTable<SearchIndex>();
			
			var query = from doc in table
				where doc.Name.Contains("Mono")
				select doc;
			
			var l = linq.GetCommand(query).Parameters;
			
			
			//			foreach (var p in query) {
			//				Console.WriteLine(p.Name);
			//			}
			
			return query;
		}
		
		static void Write(SqliteDataReader reader, int index)
		{
			Console.Error.Write("({0} '{1}')", 
			                    reader.GetName(index), 
			                    reader [index]);
		}
		
	}
	
}
