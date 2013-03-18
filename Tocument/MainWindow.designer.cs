// WARNING
//
// This file has been generated automatically by Xamarin Studio to store outlets and
// actions made in the Xcode designer. If it is removed, they will be lost.
// Manual changes to this file may not be handled correctly.
//
using MonoMac.Foundation;

namespace Tocument
{
	[Register ("MainWindowController")]
	partial class MainWindowController
	{
		[Outlet]
		MonoMac.AppKit.NSTableView methodList { get; set; }

		[Outlet]
		MonoMac.AppKit.NSTextField searchField { get; set; }

		[Outlet]
		MonoMac.AppKit.NSButton startSearchButton { get; set; }

		[Outlet]
		MonoMac.WebKit.WebView resultView { get; set; }

		[Outlet]
		MonoMac.AppKit.NSTextField searchSubmit { get; set; }
		
		void ReleaseDesignerOutlets ()
		{
			if (methodList != null) {
				methodList.Dispose ();
				methodList = null;
			}

			if (searchField != null) {
				searchField.Dispose ();
				searchField = null;
			}

			if (startSearchButton != null) {
				startSearchButton.Dispose ();
				startSearchButton = null;
			}

			if (resultView != null) {
				resultView.Dispose ();
				resultView = null;
			}

			if (searchSubmit != null) {
				searchSubmit.Dispose ();
				searchSubmit = null;
			}
		}
	}

	[Register ("MainWindow")]
	partial class MainWindow
	{
		
		void ReleaseDesignerOutlets ()
		{
		}
	}
}
