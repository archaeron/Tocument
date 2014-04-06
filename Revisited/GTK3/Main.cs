using Glade;
using Gtk;
using System;
using Tocument;
using WebKit;


class TestApplication
{
	static void Main(string[] args)
	{
		System.Console.Write("Hello, World!\n");
		new TestApplication(args);
	}
	Gtk.TreeViewColumn languageColumn;
	Gtk.TreeViewColumn indexColumn;
	Gtk.ListStore indexListStore;
	TreeModelFilter filter;
	Gtk.TreeView tree;
	Gtk.Entry filterEntry;


	public TestApplication(string[] args)
	{
		Gtk.Application.Init();

		// Create a nice label describing the Entry
		Gtk.Label filterLabel = this.initFilter ();
		// Put them both into a little box so they show up side by side
		Gtk.HBox filterBox = new Gtk.HBox ();
		filterBox.PackStart (filterLabel, false, false, 2);
		filterBox.PackStart (filterEntry, true, true, 5);



		// Create a Window
		Gtk.Window window = new Gtk.Window ("Tocument");
		window.SetSizeRequest (1200,900);
		WebView webView = new WebView ();
		webView.SetSizeRequest(240,500);
		//webView.Open ("/home/jorismorger/Projects/Tocument/Revisited//Docsets/BackboneJS.docset/Contents/Resources/Documents/index.html");
		webView.Open ("/home/jorismorger/Projects/Tocument/Revisited/Docsets/Clojure.docset/Contents/Resources/Documents/clojure/api-index.html");
		// Create our TreeView
		tree = new Gtk.TreeView ();

		// Create a box to hold the Entry and Tree
		Gtk.VBox box = new Gtk.VBox ();
		Gtk.HBox mainBox = new Gtk.HBox ();
		Gtk.VBox mainContainer = new Gtk.VBox ();

		MenuBar mb = this.addMenu ();

		// Add the widgets to the box
		box.PackStart (filterBox, false, false, 5);
		box.PackStart (tree, true, true, 5);
		mainBox.PackStart (box, false, true, 5);
		mainBox.PackStart (webView, true, true, 5);

		mainContainer.PackStart (mb, false, false, 5);
		mainContainer.PackStart (mainBox, false, false, 5);

		window.Add (mainContainer);

		// Create a column for the artist name
		languageColumn = new Gtk.TreeViewColumn ();
		languageColumn.Title = "Language";

		// Create a column for the song title
		indexColumn = new Gtk.TreeViewColumn ();
		indexColumn.Title = "Term";

		// Add the columns to the TreeView
		tree.AppendColumn (languageColumn);
		tree.AppendColumn (indexColumn);

		// Create a model that will hold two strings - Artist Name and Song Title
		indexListStore = new Gtk.ListStore (typeof (string), typeof (string));

		// Assign the model to the TreeView
		tree.Model = indexListStore;
		this.append ();
		this.createFilter ();
		// Show the window and everything on it
		window.ShowAll ();
		Gtk.Application.Run();
	}

	public MenuBar addMenu()
	{
		MenuBar mb = new MenuBar();

		Menu filemenu = new Menu();
		MenuItem file = new MenuItem("File");
		file.Submenu = filemenu;

		MenuItem exit = new MenuItem("Exit");
		exit.Activated += OnActivated;
		filemenu.Append(exit);

		mb.Append(file);
		return mb;
	}

	void OnActivated(object sender, EventArgs args)
	{
		Application.Quit();
	}


	public void createFilter()
	{
		filter = new Gtk.TreeModelFilter (indexListStore, null);
		filter.VisibleFunc = new Gtk.TreeModelFilterVisibleFunc (FilterTree);
		tree.Model = filter;

	}

	public Gtk.Label initFilter()
	{
		filterEntry = new Gtk.Entry ();
		// Fire off an event when the text in the Entry changes
		filterEntry.Changed += OnFilterEntryTextChanged;
		return new Gtk.Label ("");
	}

	private bool FilterTree (Gtk.TreeModel model, Gtk.TreeIter iter)
	{
		string indexName = model.GetValue (iter, 1).ToString ();
		if (filterEntry.Text == "")
			return true;
		if (indexName.IndexOf (filterEntry.Text) > -1)
			return true;
		else
			return false;
	}

	private void OnFilterEntryTextChanged (object o, System.EventArgs args)
	{
		// Since the filter text changed, tell the filter to re-determine which rows to display
		filter.Refilter ();
	}

	public void append()
	{
		foreach (Tuple<string,string,string> t in Reader.indexAll) {
			Console.WriteLine(t.Item2);
			indexListStore.AppendValues (t.Item3, t.Item1);
		}

		Gtk.CellRendererText languageCell = new Gtk.CellRendererText ();
		// Add the cell to the column
		languageColumn.PackStart (languageCell, true);

		Gtk.CellRendererText indexCell = new Gtk.CellRendererText ();
		indexColumn.PackStart (indexCell, true);

		//The TreeView doesn't automatically know which cells are sup
		// Tell the Cell Renderers which items in the model to display
		languageColumn.AddAttribute (languageCell, "text", 0);
		indexColumn.AddAttribute (indexCell, "text", 1);

	}
}