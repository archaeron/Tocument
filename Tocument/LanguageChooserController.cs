
using System;
using System.Collections.Generic;
using System.Linq;
using MonoMac.Foundation;
using MonoMac.AppKit;

namespace Tocument
{
	public partial class LanguageChooserController : MonoMac.AppKit.NSWindowController
	{
		#region Constructors
		
		// Called when created from unmanaged code
		public LanguageChooserController (IntPtr handle) : base (handle)
		{
			Initialize ();
		}
		
		// Called when created directly from a XIB file
		[Export ("initWithCoder:")]
		public LanguageChooserController (NSCoder coder) : base (coder)
		{
			Initialize ();
		}
		
		// Call to load from the XIB/NIB file
		public LanguageChooserController () : base ("LanguageChooser")
		{
			Initialize ();
		}
		
		// Shared initialization code
		void Initialize ()
		{

		}

		public override void AwakeFromNib ()
		{
			base.AwakeFromNib ();
		}

		[MonoMac.Foundation.Export("keyDown:")]
		public override void KeyDown (NSEvent theEvent)
		{
			if((int)theEvent.ModifierFlags == 1048840 && theEvent.Characters == "d")
			{
				this.Close();
			}
		}
		
		#endregion
		
		//strongly typed window accessor
		public new LanguageChooser Window {
			get {
				return (LanguageChooser)base.Window;
			}
		}
	}
}

