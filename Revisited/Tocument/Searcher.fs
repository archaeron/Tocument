module Tocument.Search

(*
For the SQLite specific libraries used in this snippet, see the following links:
http://system.data.sqlite.org/index.html/doc/trunk/www/downloads.wiki
http://code.google.com/p/dblinq2007/downloads/list

For this example, an SQLite version of the Northwind Database was used; this file is included in the System.Data.SQLite download
*)

let pathToSQLiteDB = 
    @"C:\Users\Nicolas\Documents\GitHub\Tocument\Revisited\Docsets\BackboneJS.docset\Contents\Resources\docSet.dsidx"

open System.Data.Linq
open System.Data.Linq.Mapping
open System.Data.SQLite
open Microsoft.FSharp.Linq

//open Microsoft.FSharp.Linq.Query
[<Table(Name = "searchIndex")>]
type SearchIndex(name : string, path : string, docType : string) = 
    let mutable m_name = name
    let mutable m_path = path
    let mutable m_docType = docType
    new() = SearchIndex(null, null, null)
    
    [<Column(IsPrimaryKey = true)>]
    member this.Name 
        with get () = m_name
        and set (value) = m_name <- value
    
    [<Column>]
    member this.Path 
        with get () = m_path
        and set (value) = m_path <- value
    
    [<Column>]
    member this.Type 
        with get () = m_docType
        and set (value) = m_docType <- value
    
    override this.ToString() = sprintf "Name: '%s' Type: '%s' Path: '%s'" m_name m_docType m_path

let connString = System.String.Format("Data Source={0};UTF8Encoding=True;Version=3", pathToSQLiteDB)
let conn = new SQLiteConnection(connString)
let db = new DataContext(conn)
let index = db.GetTable<SearchIndex>()

//query for company names
let namesList = 
    seq { 
        for i in index do
            yield i.Name
    }
    |> Seq.toList

let private findDocsets path =
    let dirs = System.IO.Directory.GetDirectories(path) |> Array.toList
    let databases = List.map (fun path -> System.IO.Path.Combine(path, "Contents", "Resources", "docSet.dsidx")) dirs
    databases
    

type Searcher(path: string) =
    member private x.languagesWithPath =
        findDocsets path

    /// Finds all language docsets in the path
    member x.languages =
        findDocsets path

    /// <summary>searches in a language for a query</summary>
    /// <param name="language">one of the languages in <c>Searcher.languages</c></param>
    member x.search language query =
        4

//find company with id "ALFKI"
//let alfki =
//    query <@ seq { for c in customers do
//                        if c.CustomerId = "ALFKI" then
//                            yield c}  @>
//    |> Seq.head
//update name and save to DB
//alfki.CompanyName <- "Alfreds Futterkiste (test)"
//db.SubmitChanges()
//run the following code to restore the original name and save it to the DB
//alfki.CompanyName <- "Alfreds Futterkiste"
//db.SubmitChanges()
//release resources
//db.Dispose()
