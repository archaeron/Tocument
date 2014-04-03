namespace DBTests
open System
open NUnit.Framework
open Tocument

[<TestFixture>]
type SQLite() = 

    [<Test>]
    member x.IndexByName() =
        let r = Sqlite.Reader.getIndexByName "View.render"
        let t = [("View.render", "index.html#View-render", "func")]
        Assert.AreEqual(Seq.toList r,t)

    [<Test>]
    member x.IndexAll() =
        let r = Sqlite.Reader.indexAll
        let length = Seq.length r
        Assert.AreEqual(length,103)