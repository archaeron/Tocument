
// NOTE: If warnings appear, you may need to retarget this project to .NET 4.0. Show the Solution
// Pad, right-click on the project node, choose 'Options --> Build --> General' and change the target
// framework to .NET 4.0 or .NET 4.5.

module Sqlite

module Reader =
    module Query = 
        open Mono.Data.Sqlite
        open System.Data
        let createConnection (path:string) = new SqliteConnection ("Data Source=" + path + ",version=3")
        let connection = createConnection "/home/jorismorger/Projects/Tocument2/Revisited/BackboneJS.docset/Contents/Resources/docSet.dsidx"
        connection.Open()
        let search txt args extractor =
            let cmd = connection.CreateCommand()
            cmd.CommandText <- txt
            for a,v in args do
                cmd.Parameters.AddWithValue(a,v) |> ignore
            seq {
                use r = cmd.ExecuteReader()
                while(r.Read()) do
                    yield (extractor r)
            }
      

    let indexAll = 
        Query.search "SELECT name, path, type FROM searchIndex ORDER BY name" [] (fun r -> (r.GetString 0,r.GetString 1,r.GetString 2))
    
    let getIndexByName where = 
        Query.search ("SELECT name, path, type FROM searchIndex WHERE name = '" + where + "' ORDER BY name") [] (fun r -> (r.GetString 0,r.GetString 1,r.GetString 2))

