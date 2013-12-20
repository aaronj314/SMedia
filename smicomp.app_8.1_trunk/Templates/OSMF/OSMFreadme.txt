The OSMFPlayer sample defines an application that can be embedded on a web page in order to play back media. It contains a control bar that manages the various supported aspects of the media.

Features:

* SWF preloading progress bar,
* Loading (url parameter can be passed to the SWF, and an Eject button supports manual url entry),
* Play state (play, pause, stop),
* Seeking,
* Volume (increase, decrease)
* Elapsed and remaining play time,
* Multiple Bitrate (toggling between automatic and manual mode),
* Control bar hiding (toggleable, autoHideControlBar parameter can be passed to the SWF),
* Full screen (toggleable),
* Background fill (backgroundColor parameter can be passed to the SWF),
* Debug support (see WebPlayerDebugConsole project for more info),

By leveraging the DefaultMediaFactory class, the player can distill the following media element types from the provided input URL:

* VideoElement, using either:
	- NetLoader (streaming or progressive)
	- RTMPDynamicStreamingNetLoader (MBR streaming)
	- HTTPStreamingNetLoader (HTTP streaming)
	- F4MLoader (Flash Media Manifest files)
* AudioElement, using either:
	- SoundLoader (progressive)
	- NetLoader (streaming)
* ImageElement
* SWFElement

Usage:

1. Deploy the following files/folders to your web server:
* OSMFPlayer.html
* OSMFPlayer.swf
* assets
* images
* scripts
2. Load the OSMFPlayer.html page in your web browser.
3. To load media from a specific URL, click the Eject button (in the middle of the control panel) and enter your URL.

Notes:

The included OSMFPlayer.swf requires Flash Player 10.1.

OSMFPlayer uses the Standard 07_55 font by Craig Kroeger. Please note that this is *not* a free font. Please visit http://www.miniml.com for more licensing information. 