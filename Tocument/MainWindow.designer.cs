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
		MonoMac.AppKit.NSTextField searchField { get; set; }

		[Outlet]
		MonoMac.AppKit.NSButton startSearchButton { get; set; }

		[Outlet]
		MonoMac.WebKit.WebView resultView { get; set; }
		
		void ReleaseDesignerOutlets ()
		{
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
