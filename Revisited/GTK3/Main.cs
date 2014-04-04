using Glade;
using Gtk;
using System;
using Tocument;

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

		// Create an Entry used to filter the tree
		filterEntry = new Gtk.Entry ();

		// Fire off an event when the text in the Entry changes
		filterEntry.Changed += OnFilterEntryTextChanged;
		// Create a nice label describing the Entry
		Gtk.Label filterLabel = new Gtk.Label ("Index Search:");
		// Put them both into a little box so they show up side by side
		Gtk.HBox filterBox = new Gtk.HBox ();
		filterBox.PackStart (filterLabel, false, false, 5);
		filterBox.PackStart (filterEntry, true, true, 5);

		// Create a Window
		Gtk.Window window = new Gtk.Window ("Tocument");
		window.SetSizeRequest (700,500);

		// Create our TreeView
		tree = new Gtk.TreeView ();

		// Create a box to hold the Entry and Tree
		Gtk.VBox box = new Gtk.VBox ();

		// Add the widgets to the box
		box.PackStart (filterBox, false, false, 5);
		box.PackStart (tree, true, true, 5);

		window.Add (box);

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

	public void createFilter()
	{
		filter = new Gtk.TreeModelFilter (indexListStore, null);
		filter.VisibleFunc = new Gtk.TreeModelFilterVisibleFunc (FilterTree);
		tree.Model = filter;

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