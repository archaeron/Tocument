module Tocument.Windows

open System
open System.Windows
open System.Windows.Controls
open FSharpx

type MainWindow = XAML<"MainWindow.xaml">

let loadWindow() =
   let window = MainWindow()
   let search = Tocument.Query.getIndexByName "Events"

   let searchBox = window.SearchBox
   let text = searchBox.GetLineText 0

   let names = Tocument.Search.namesList
   let searcher = Tocument.Search.Searcher @"C:\Users\Nicolas\Documents\GitHub\Tocument\Revisited\Docsets"
   let languages = searcher.languages

   printfn "%A" search
   
   // Your awesome code goes here and you have strongly typed access to the XAML via "window"
   
   window.Root

[<STAThread>]
(new Application()).Run(loadWindow()) |> ignore