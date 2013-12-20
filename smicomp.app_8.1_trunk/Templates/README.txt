These three 360 player skins for squeeze all require a single parameter to be passed into them via the flashvars parameter in the embed tag. The variable that is expected is "flvUrl" and is of type string.

Example HTML code is as follows:

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<title>TEST VIDEO PLAYER</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	
	<script src="js/swfobject.js" type="text/javascript"></script>
	<script type="text/javascript">
		var flashvars = {};
		flashvars.flvUrl = "http://www.mediacollege.com/video-gallery/testclips/20051210-w50s.flv";
		flashvars.autoplay = "true";
		var params = {
			menu: "false"
		};
		swfobject.embedSWF("squeeze_media_player_charcoal.swf", "altContent", "480", "360", "9.0.124", "expressInstall.swf", flashvars, params);
	</script>
	<style>
		html, body { height:100%; }
		body { margin:0; }
	</style>
</head>
<body>
	<div id="altContent">
		<h1>PROJECT NAME</h1>
		<p>Alternative content</p>
		<p><a href="http://www.adobe.com/go/getflashplayer"><img src="http://www.adobe.com/images/shared/download_buttons/get_flash_player.gif" alt="Get Adobe Flash player" /></a></p>
	</div>
</body>
</html>