﻿namespace TocumentGTK
    module Main =
        open Tocument
        open System
        open Gtk
        open Mono.Data.Sqlite
        open System.Data
    
        [<EntryPoint>]
        let Main(args) = 
            Application.Init()
            let win = new MainWindow.MyWindow()
            for j,v,t in Sqlite.Reader.query  "SELECT name, path, type FROM searchIndex ORDER BY name LIMIT 100" [] (fun r -> (r.GetValue 0,r.GetValue 1,r.GetValue 2)) do
                printfn "Method %A" j
                printfn "Path %A" v
                printfn "Type %A" t

            win.Show()
            Application.Run()
            0

