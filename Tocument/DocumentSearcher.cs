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
				String sqlQuery = "SELECT name, path FROM searchIndex WHERE name LIKE @searchQuery LIMIT 100";
				Console.WriteLine(sqlQuery);
				cmd.CommandText = sqlQuery;
				cmd.Parameters.AddWithValue("searchQuery", "%" + searchQuery + "%");

				using (var reader = cmd.ExecuteReader ())
				{
					while (reader.Read ())
					{
						SearchIndex entry = new SearchIndex();
						entry.Name = (String)reader[0];
						entry.Path = (String)reader[1];

						result.Add(entry);
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
