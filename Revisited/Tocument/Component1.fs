
// NOTE: If warnings appear, you may need to retarget this project to .NET 4.0. Show the Solution
// Pad, right-click on the project node, choose 'Options --> Build --> General' and change the target
// framework to .NET 4.0 or .NET 4.5.

module Sqlite

module Reader =
    open Mono.Data.Sqlite
    open System.Data
    let createConnection (path:string) = new SqliteConnection ("Data Source=" + path + ",version=3")
    let connection = createConnection "/home/jorismorger/Projects/Tocument/BackboneJS.docset/Contents/Resources/docSet.dsidx"
    connection.Open()
    let query txt args extractor =
        let cmd = connection.CreateCommand()
        cmd.CommandText <- txt
        for a,v in args do
            cmd.Parameters.AddWithValue(a,v) |> ignore
        seq {
            use r = cmd.ExecuteReader()
            while(r.Read()) do
                yield (extractor r)
        }
  

