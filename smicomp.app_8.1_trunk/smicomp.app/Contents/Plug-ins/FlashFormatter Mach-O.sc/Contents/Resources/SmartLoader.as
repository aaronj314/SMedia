////////////////////////////////////////////////////////////////////////////////
//
//  ** Copyright (C) 2002, Sorenson Media, Inc., All rights reserved. **
//  PROPRIETARY INFORMATION OF SORENSON MEDIA, INC. -- DO NOT DISTRIBUTE
//
//  File Name:	SmartLoader.fla
//
//  Abstract:	Contains the Action Code definition for the smartLoader 
//				object.  This object preloads video slices and accomplishes
//				other "smart" loading techniquest to properly play back
//				video within the Flash architecture.
//
////////////////////////////////////////////////////////////////////////////////

// Input paramters to the Smart Loader.  These need to be changed to
// for each sliced set depending on the correct values.
this.baseName="ClocksMed_Prog_";
this.numSlices = 4;
this.numFPS = 15;
this.smUseLinkedFlv = 1; // Default value to Debug linked FLV file
//this.smLinkedFlvFile="ZoolanderSm_Prog.flv";
this.smLinkedFlvFile="c:\\media files\\bday.flv"
//this.smLinkedFlvFile="http://www.helpexamples.com/flash/video/lights_long.flv";
this.smVideoWidth = 240;
this.smVideoHeight = 180;
this.smKeyFrameRate = 15;
this.smStartPauseTime = 0;
this.smLoopNumber = 1;
// Actions 
var SM_ACTION_NONE:Number 			= 1;
var SM_ACTION_GET_URL:Number 		= 2;
var SM_ACTION_LOAD_MOVIE:Number		= 3;
var SM_ACTION_UNLOAD_MOVIE:Number	= 4;
this.smClickAction = 1;
this.smEndMovieAction = 1;
this.smClickActionURL = "http://www.sorensonmedia.com";
this.smClickActionURLMethod = "_self";
this.smEndMovieActionURL = "http://www.sorensonmedia.com";
this.smEndMovieActionURLMethod = "_self";

// --------------------------------------------------------------------------------

// Define the smartLoader_c class  
smartLoader_c = function () { };
smartLoader_c.prototype = new Object();

// Register the class
Object.registerClass("smartLoader_c", smartLoader_c);

// BUGBUG JR: Now that we have the number of slices in each slice we could
// 		probably clean up the code that fast forwards and so forth.  The reason
// 		is that we can now tell before we try and load a slice if that slice
// 		contains the target frame.  This would impact the fastForward, rewind,
//		and playNextMovie functions at least.

////////////////////////////////////////////////////////////////////////////////
//; smartLoader_c.prototype.playNextMovie()
//
// Abstract:
//	This function plays the next slice in the movie.
//  
// Returns:
//	None.
//
smartLoader_c.prototype.playNextMovie = function()
{
	// Verify that we are using stitched video
	// Verify that there are more slices to play.
	if(!this.useLinkedFlv && this.playBuff.length > 0)
	{
		this.waitingToPlay = false;

		this.lastPlayObj = this.playObj;
		
		// Play the next movie available
		this.playObj = this.playBuff.shift(); 
		
		if(this.playObj.sliceNum == this.numSlices - 1)
		{
			if(this.playObj.movieClip._totalframes <= this.targetPlayFrame)
			{
				this.targetPlayFrame = this.playObj.movieClip._totalframes - 1;
			}
		}
		
		if(this.playObj.movieClip._framesloaded >= this.targetPlayFrame)
		{
			// Okay we are going to play the new one so push the old one
			if(this.lastPlayObj != undefined)
			{
				this.loadBuff.push(this.lastPlayObj);
			}
			
			// The way these clips have been put together you couldn't
			// readjust the height until you get to the first frame of 
			// video.  Since the first frame only has the stop() action
			// you must go the frame 2 and then set the _x and _y
			// values to 0.  This code and this general method should
			// be reviewed.

			this.lastplayObj.movieClip._visible = false;
			this.playObj.movieClip._visible = true;
			this.parentThis.smMovieClip._alpha = 100;
			if(this.hasSetPosition == false)
			{
				// this.parentThis.smMovieClip._width, and this.parentThis.smMovieClip._height 
				// will be changed to be same as video frame size as soon as the first video frame 
				// is loaded into this.playObj.movieClip. 
				// We want to save the initial value of width and height of the smMovieClip 
				// for positioning purpose.
				this.xPos = 0 - this.parentThis.smMovieClip._width / 2;
				this.yPos = 0 - this.parentThis.smMovieClip._height / 2;
				this.hasSetPosition = true;
			}
			this.playObj.movieClip.gotoAndStop(this.targetPlayFrame);
			this.playObj.movieClip._x = this.xPos;
			this.playObj.movieClip._y = this.yPos;

			if(this.playing)
			{

				// Okay go ahead and play the clip.
				this.playObj.movieClip.play();
			}
			
			this.targetPlayFrame = 2;
		}
		else
		{
			if(this.playObj.movieClip._totalframes > this.targetPlayFrame)
			{
				// This movie has enough frames they just aren't loaded yet
				// so push the movie back on the stack and wait to play the
				// next slice.
				this.playBuff.push(this.playObj);
				this.playObj = this.lastPlayObj;
				
				// Ask the loader to call the play function again to see if these frames are
				// loaded.
				this.waitingToPlay = true;				
			}
			else
			{
				// Reset the target frame and wait for the next one to be loaded.
				this.targetPlayFrame = this.targetPlayFrame - this.playObj.movieClip._totalframes + 2;

				// We aren't going to play this slice so push it back on the loadBuff					
				this.loadBuff.push(this.playObj);
				
				// Since we aren't going to play the new slice restore the last slice
				// as the one that is still playing.
				this.playObj = this.lastPlayObj;
				
				// Ask the loader to call the play function again to see if it is ready
				this.waitingToPlay = true;
			}
		}

	}
	else
	{		
		if(this.playObj.sliceNum == this.numSlices - 1)
		{
			if(this.playObj.movieClip._currentframe == 2)
			{
				this.waitingToPlay = true;
			}
			else
			{
				this.playObj.movieClip.gotoAndStop(this.playObj.movieClip._totalframes - 1);	
				this.waitingToPlay = false;
			}
		}
		else
		{
			this.waitingToPlay = true;
		}
	}
};

////////////////////////////////////////////////////////////////////////////////
//; smartLoader_c.prototype.preloadMovie()
//
// Abstract:
//	This function tries to keep several movie buffers loaded with movies.
//  The thought is that one is playing, on is loaded and ready to play
// 	and the final one is in the process of loading.  This also gives 
//	a buffer in case a slice takes longer than is expected.
//
// Returns:
//
smartLoader_c.prototype.preloadMovie = function() {

	// Verify that we are stitched
	// Don't do anything if the load parameters are being set in the other code
	if(!this.useLinkedFlv && !this.settingLoadParameters)
	{
		// We don't want to load more than one at a time so see
		// if the last one is loaded yet or not.
		if(!this.loading)
		{			
			// Don't load a movie if we have already filled the available
			// movie slots.
			if(this.loadBuff.length > 0 && 
				this.sliceToLoad < this.numSlices)
			{				
				// Start loading the next slice
				this.loading = true;
				
				// Load the movie
				this.parentThis.smMovieClip.loadMovieActive = false;
				this.lastLoadReady = false;
								
				// Assume that the baseName is as defined
				this.loadedName = this.baseName + this.sliceToLoad + ".swf";
				
				this.loadObj = this.loadBuff.pop();
				this.movieName = this.loadObj.movieClip._name;
				this.movieDepth = this.loadObj.movieClip.getDepth();
				this.loadObj.movieClip.removeMovieClip();
				this.parentThis.smMovieClip.createEmptyMovieClip(this.movieName, this.movieDepth);
				delete this.loadObj.movieClip;
				this.loadObj.movieClip = this.parentThis.smMovieClip[this.movieName];
				this.loadObj.movieClip.loadMovie(this.loadedName);
				this.loadObj.sliceNum = this.sliceToLoad;
				
				// Use this to determine the data rate of the movie.
				this.startloadtime = getTimer();	
				
				// Set the slice to load for next time
				this.sliceToLoad = (this.sliceToLoad + 1);
				if (this.loopCount < smLoopNumber && this.sliceToLoad == this.numSlices)
				{
					// handle preLoading first slice since we are still looping
					this.loopCount++;
					this.sliceToLoad = 0;
				}
			}
			// else Don't want to start loading the next one yet.
		}
		
		// Because of timing issues we had to add this code
		// to make certain that clip loaded by loadMovie 
		// is the last one requested and not a previous one.
		// BUGBUG JR: Could this be done better some other way?
		if(this.loadObj.movieClip._framesloaded > 1 && this.parentThis.smMovieClip.loadMovieActive) 
		{
			// Verify that at least some data is loaded
			if (this.loadObj.movieClip.getBytesLoaded() != 0) 
			{
				// See if all of the movie has yet been loaded
				if (this.loadObj.movieClip.getBytesLoaded() < this.loadObj.movieClip.getBytesTotal()) 
				{
					// BUGBUG JR: Not certain yet what this is for
					if (this.loadObj.movieClip._currentframe > 0)
					{
						// BUGBUG JR: I don't know why we are comparing this to 32768?
						if (this.loadObj.movieClip.getBytesLoaded() > 32768)
						{
							var timeTotal = (this.loadObj.movieClip._totalframes/this.fps);
							var bytesPerSec = ((this.loadObj.movieClip.getBytesLoaded()*1000)/(getTimer()-this.startloadtime));
							var timeToFinish = ((this.loadObj.movieClip.getBytesTotal()-this.loadObj.movieClip.getBytesLoaded())/bytesPerSec)+5.;
							
							// Push this movie into the available play movies if it is expected
							// to finish loading the file before the file finishes playing.
							if (timeTotal>=timeToFinish)
							{
								if(this.lastLoadReady == false)
								{
									if(this.skipFrames < 0)
									{
										this.targetPlayFrame = this.loadObj.movieClip._totalframes + this.skipFrames - 1;
										if(this.targetPlayFrame > 1)
										{
											// Everything is okay proceed to play
											this.skipFrames = 0;
											this.loadObj.movieClip._visible = false;
											this.playBuff.push(this.loadObj);
											this.lastLoadReady = true;
										}
										// Otherwise do nothing and allow the frame to complete loading.
										// The logic for a loaded frame will then deal with this properly.
										// we want to delay this because we want this slice to complete
										// loading before loading the next one.
									}
									else
									{
										this.playBuff.push(this.loadObj);
										this.lastLoadReady = true;
									}
								}
							}
						}
					}
				} else {
					// The file is loaded so make it available to play
					if(this.lastLoadReady == false)
					{
						if(this.skipFrames < 0)
						{
							this.targetPlayFrame = this.loadObj.movieClip._totalframes + this.skipFrames;
							if(this.targetPlayFrame > 1)
							{
								// The target frame was found in this slice so everything is okay
								this.skipFrames = 0;
								this.playBuff.push(this.loadObj);
							}
							else
							{								
								// Have to load the previous slice
								this.sliceToLoad = this.loadObj.sliceNum - 1;
								if(this.sliceToLoad < 0)
								{
									// Oops the slice was 0 and can't load a previous slice
									// so use the current slice and play at the beginning.
									this.sliceToLoad = 0;
									this.skipFrames = 0;
									this.targetPlayFrame = 2;
									this.playBuff.push(this.loadObj);
								}
								else
								{
									this.skipFrames = this.targetPlayFrame - 2;
									
									// Push this buff back on the stack
									this.loadBuff.push(this.loadObj);
								}
							}
						}
						else
						{						
							this.loadObj.movieClip._visible = false;
							this.playBuff.push(this.loadObj);
						}
						
						this.lastLoadReady = true;
					}
					this.loading = false;
				}
			}
			
		}
		
		// If the player is waiting for the loader to load before playing and
		// there is a movie to play then start playing the movie.
		if(this.waitingToPlay && this.playBuff.length > 0)
		{
			this.playNextMovie();
		}
	}
};

////////////////////////////////////////////////////////////////////////////////
//; smartLoader_c.prototype.gotoStart()
//
// Abstract:
//	This function resets the playhead at the start of first slice of the movie.
//
//  Returns:
//
smartLoader_c.prototype.gotoStart = function() 
{
	// Do we have linked video
	if (this.useLinkedFlv)
	{
		// Yes - linked flv
		this.smLinkedFlv_ns.seek (0);
	}
	else
	{
		// no - stitched video
		this.settingLoadParameters = true;
	
		if(this.playObj.sliceNum == 0)
		{
			this.playObj.movieClip.stop();
			
			if(this.playing)
			{
				this.targetPlayFrame = 2;
				this.playObj.movieClip.gotoAndPlay(2);
			}
			else
			{
				this.targetPlayFrame = 2;
				this.playObj.movieClip.gotoAndStop(2);
			}
		}
		else
		{
			if(this.playObj != undefined)
			{
				this.playObj.movieClip.stop();
				this.loadBuff.push(this.playObj);
				
				// Unload the buffer			
				while(this.playBuff.length > 0)
				{
					this.playObj = this.playBuff.shift(); 
					this.loadBuff.push(this.playObj);
				}
				
				this.playObj = undefined;
			}
	
			this.waitingToPlay = true;
			this.sliceToLoad = 0;
			
			if(this.loading)
			{
				this.loadBuff.push(this.loadObj);
				this.loading = false;
			}
	
			this.targetPlayFrame = 2;
		}
	
		this.settingLoadParameters = false;
	}
}

////////////////////////////////////////////////////////////////////////////////
//; smartLoader_c.prototype.gotoEnd()
//
// Abstract:
//	This function goes to the end of the movie.
//
//  Returns:
//
smartLoader_c.prototype.gotoEnd = function() 
{
	// Do we have linked video
	if (this.useLinkedFlv)
	{
		// Yes - linked flv
		endValue = this.roundOnKeyFrame (this.smLinkedFlv_ns.smVideoDuration, false);
		
		this.smLinkedFlv_ns.seek (endValue);
	}
	else
	{
		this.settingLoadParameters = true;
	
		if(this.playObj.sliceNum == this.numSlices - 1)
		{
			this.targetPlayFrame = 2;
			this.playObj.movieClip.gotoAndStop(this.playObj.movieClip._totalframes - 1);
		}
		else
		{
			if(this.playObj != undefined)
			{
				this.playObj.movieClip.stop();
				
				// Unload the buffer			
				while(this.playBuff.length > 0)
				{
					nextObj = this.playBuff.shift();
					if(nextObj.sliceNum == this.numSlices - 1)
					{
						this.playBuff.push(nextObj);
						this.targetPlayFrame = nextObj.movieClip._totalframes - 1;
						this.sliceToLoad = this.numSlices;
						break;
					}
					else
					{
						this.loadBuff.push(nextObj);
					}
				}
			}
	
			this.waitingToPlay = true;
			if(this.playBuff.length == 0)
			{
				this.sliceToLoad = this.numSlices - 1;
			
				if(this.loading)
				{
					if(this.loadObj.sliceNum != this.numSlices - 1)
					{
						this.loadBuff.push(this.loadObj);
						this.loading = false;
					}
				}
	
				// Too large so the last frame will be played
				this.targetPlayFrame = 99999;
			}
		}
	
		this.settingLoadParameters = false;
	}
}

////////////////////////////////////////////////////////////////////////////////
//; smartLoader_c.prototype.roundOnKeyFrame()
//
// Abstract:
//	This function rounds the videoTime to the nearest key frame.  It rounds up or 
//	down based on the bRoundUp parameter
//
//  Returns:
//		video time rounded on key frame
smartLoader_c.prototype.roundOnKeyFrame = function(videoTime, bRoundUp) 
{
	roundedTime = 0;
	
	// Do we have linked video
	if (this.useLinkedFlv)
	{
		// Yes - linked flv
		// Do an integer devide by the key frame frequency
		roundedTime = videoTime - (videoTime % (this.smKeyFrameRate / this.numFPS));

		if (bRoundUp && (roundedTime < videoTime))
		{
			// Round Up
			roundedTime += (this.smKeyFrameRate / this.numFPS);

			// Check that we don't go past the end of the video
			if (roundedTime > this.smLinkedFlv_ns.smVideoDuration)
			{
				// set to last key frame
				roundedTime = this.smLinkedFlv_ns.smVideoDuration % (this.smKeyFrameRate / this.numFPS);
			}
			
		}
		else if (!bRoundUp && roundedTime > videoTime)
		{
			// Round down
			roundedTime -= (this.smKeyFrameRate / this.numFPS);

			// Check that we don't go past the start of the video
			if (roundedTime < 0)
			{
				roundedTime = 0;
			}
		}
	}
		
	return (roundedTime);
}

////////////////////////////////////////////////////////////////////////////////
//; smartLoader_c.prototype.fastForward()
//
// Abstract:
//	This function fast forwards the movie by the input number of frames.
//
//  Returns:
//		Nothing
smartLoader_c.prototype.fastForward = function(numFrames) 
{
	// Do we have linked video
	if (this.useLinkedFlv)
	{
		// Yes - linked flv
		forwardPos = this.smLinkedFlv_ns.time + (numFrames / this.numFPS);
		
		forwardPos = this.roundOnKeyFrame (forwardPos, true);

		this.smLinkedFlv_ns.seek (forwardPos);
	}
	else
	{	
		this.settingLoadParameters = true;
		
		if(this.playObj != undefined)
		{
			this.playObj.movieClip.stop();
			if((this.playObj.movieClip._totalframes - numFrames) > this.playObj.movieClip._currentframe)
			{
				frameNumber = this.playObj.movieClip._currentframe + numFrames;
				this.targetPlayFrame = 2;
				if(this.playing)
				{
					this.playObj.movieClip.gotoAndPlay(this.playObj.movieClip._currentframe + numFrames);
				}
				else
				{
					this.playObj.movieClip.gotoAndStop(this.playObj.movieClip._currentframe + numFrames);
				}
			}
			else
			{
				// If it is the last slice then just stop on the last frame
				if(this.playObj.sliceNum == this.numSlices - 1)
				{
					frameNumber = this.playObj.movieClip._totalframes - 1;
					this.targetPlayFrame = 2;
					this.playObj.movieClip.gotoAndStop(this.playObj.movieClip._totalframes - 1);
				}
				else
				{
					// Need to skip into the next slice
					this.targetPlayFrame = this.playObj.movieClip._currentframe + 
						numFrames - this.playObj.movieClip._totalframes + 2;
						
					this.playNextMovie();
				}
			}		
		}
		else
		{
			// Must be at the first of the clip so just set the target frame and leave it as is.
			this.targetPlayFrame = numFrames + 1;
		}
		
		this.settingLoadParameters = false;
	}
}

////////////////////////////////////////////////////////////////////////////////
//; smartLoader_c.prototype.moviePlay()
//
// Abstract:
//	Starts the movie playing again after it was stopped.
//
//  Returns:
//
smartLoader_c.prototype.moviePlay = function() 
{
	this.playing = true;

	// Is there a timer to kill
	if (this.pauseIntervalID != NULL)
	{
		clearInterval (this.pauseIntervalID);
		this.pauseIntervalID = NULL;
	}
	
	// Do we have linked video
	if (this.useLinkedFlv)
	{
		// Yes - linked flv
		this.smLinkedFlv_ns.pause (false);
	}
	else
	{
		this.playObj.movieClip.play();
	}
	
	if (false == this.notifyIsPlaying)
	{
		// Notify template that playing has started
		this.notifyIsPlaying = true;
		this.onPlaying (true);
	}
}

////////////////////////////////////////////////////////////////////////////////
//; smartLoader_c.prototype.movieStop()
//
// Abstract:
//	Stops the movie.
//
//  Returns:
//
smartLoader_c.prototype.movieStop = function() 
{
	this.playing = false;

	// Do we have linked video
	if (this.useLinkedFlv)
	{
		// Yes - linked flv
		
		// check that we have displayed the first frame
		// before stopping.  if we haven't then just mark
		// playing to false which will stop the video
		// when the meta data is received.
		if (this.smLinkedFlv_ns.smVideoDuration != 0)
		{
			this.smLinkedFlv_ns.pause (true);
		}
	}
	else
	{
		this.playObj.movieClip.stop();
	}

	if (true == this.notifyIsPlaying)
	{
		// Notify template that playing has started
		this.notifyIsPlaying = false;
		this.onPlaying (false);
	}
}

////////////////////////////////////////////////////////////////////////////////
//; smartLoader_c.prototype.getTotalFrames()
//
// Abstract:
//	Returns the the total numbef of video frames in the sliced set.
//
smartLoader_c.prototype.getTotalFrames = function() 
{
	var rtnFrames;
	
	// Do we have linked video
	if (this.useLinkedFlv)
	{
		rtnFrames = this.smLinkedFlv_ns.smVideoDuration * this.numFPS; 
		// Round to an integer value
		rtnFrames = rtnFrames - (rtnFrames % 1);
	}
	else
	{	
		rtnFrames = this.totalFrames / this.fps;
	}
	
	return rtnFrames;
}
////////////////////////////////////////////////////////////////////////////////
//; smartLoader_c.prototype.getDurationTime()
//
// Abstract:
//	Return the duration time of the video. Time is in seconds
//
smartLoader_c.prototype.getDurationTime = function ()
{
	durationTime = 0;
	
	// Do we have linked video
	if (this.useLinkedFlv)
	{
		durationTime = this.smLinkedFlv_ns.smVideoDuration;
	}
	else
	{
		durationTime = this.totalFrames / this.numFPS;
	}
	
	return durationTime;
}

////////////////////////////////////////////////////////////////////////////////
//; smartLoader_c.prototype.currentTime()
//
// Abstract:
//	Return the time of the current video location
//
smartLoader_c.prototype.currentTime = function ()
{
	currTime = 0;
	
	// Do we have linked video
	if (this.useLinkedFlv)
	{
		currTime = this.smLinkedFlv_ns.time;
	}
	else
	{
		currTime = this.getCurrentFrame () / this.numFPS;
	}
	
	return currTime;
}

////////////////////////////////////////////////////////////////////////////////
//; smartLoader_c.prototype.seekTime()
//
// Abstract:
//	seek to the time passed as a parameter. Time is in Seconds
//
smartLoader_c.prototype.seekTime = function (movieTime)
{
	// Do we have linked video
	if (this.useLinkedFlv)
	{
		movieTime = this.roundOnKeyFrame (movieTime, (this.smLinkedFlv_ns < seekTime));

		this.smLinkedFlv_ns.seek (movieTime);
		
		trace ("seek time: " + seekTime);
	}
	else
	{	
		this.settingLoadParameters = true;
	
		// Find the frame and slice containing the seek time
		var seekFrame = movieTime * this.numFPS;
		var seekSlice = 0;
        for (i = 0; seekFrame > this.prevFrames [i] && i < this.numSlices; i++)
        {
			seekSlice = i;
        } // end of for
		// Set seek frame within the slice 
		if (seekSlice > 0)
		{
			seekFrame = seekFrame - this.prevFrames [seekSlice - 1];
		}

		if(this.playObj.sliceNum == seekSlice)
		{
			this.targetPlayFrame = seekFrame;
			this.playObj.movieClip.gotoAndStop(seekFrame);
		}
		else
		{
			if(this.playObj != undefined)
			{
				this.playObj.movieClip.stop();
				
				// Unload the buffer			
				while(this.playBuff.length > 0)
				{
					nextObj = this.playBuff.shift();
					if(nextObj.sliceNum == this.numSlices - 1)
					{
						this.playBuff.push(nextObj);
						this.targetPlayFrame = nextObj.movieClip._totalframes - 1;
						this.sliceToLoad = this.numSlices;
						break;
					}
					else
					{
						this.loadBuff.push(nextObj);
					}
				}
			}
	
			this.waitingToPlay = true;
			if(this.playBuff.length == 0)
			{
				this.sliceToLoad = seekSlice;
			
				if(this.loading)
				{
					if(this.loadObj.sliceNum != seekSlice)
					{
						this.loadBuff.push(this.loadObj);
						this.loading = false;
					}
				}
	
				// Too large so the last frame will be played
				this.targetPlayFrame = seekFrame;
			}
		}
	
		this.settingLoadParameters = false;
	}
}

////////////////////////////////////////////////////////////////////////////////
//; smartLoader_c.prototype.getCurrentFrame()
//
// Abstract:
//	Returns the frame number of the current frame in the sliced set.
//
smartLoader_c.prototype.getCurrentFrame = function() 
{
	var cFrame;
	
	// Do we have linked video
	if (this.useLinkedFlv)
	{
		currTime = this.smLinkedFlv_ns.time;
		cFrame = currTime * this.numFPS; 
		// Round to an integer value
		cFrame = cFrame - (cFrame % 1);
	}
	else
	{	
		// The way this is set up this.playObj.movieClip._currentframe should never
		// equal 1.  This is because of the way the movieClip is loaded and the way 
		// it signals that it is loaded.  playObj.movieClip._currentframe will never
		// be one because it by definition can't be defined as the playObj until it
		// can go to frame 2.  If that changed then this would be a bug.
		cFrame = this.playObj.movieClip._currentframe - 1;
			
		cFrame += this.prevFrames[this.playObj.sliceNum];
	}
	
	if(cFrame < 0)
	{
		cFrame = 0;
	}
	
	return cFrame;
}

////////////////////////////////////////////////////////////////////////////////
//; smartLoader_c.prototype.rewind()
//
// Abstract:
//	This function fast forwards the movie by the input number of frames.
//
//  Returns:
//		Nothing
smartLoader_c.prototype.rewind = function(numFrames) 
{
	// Do we have linked video
	if (this.useLinkedFlv)
	{
		// Yes - linked flv
		rewindPos = this.smLinkedFlv_ns.time - (numFrames / this.numFPS);
		
		rewindPos = this.roundOnKeyFrame (rewindPos, false);

		this.smLinkedFlv_ns.seek (rewindPos);
	}
	else
	{	
		this.settingLoadParameters = true;
		
		if(this.playObj != undefined)
		{
			this.playObj.movieClip.stop();
	
			if(this.playObj.movieClip._currentframe > numFrames + 1)
			{
				frameNumber = this.playObj.movieClip._currentframe - numFrames;
				if(this.playing)
				{
					this.playObj.movieClip. gotoAndPlay(this.playObj.movieClip._currentframe - numFrames);
				}
				else
				{
					this.playObj.movieClip. gotoAndStop(this.playObj.movieClip._currentframe - numFrames);
				}
			}
			else
			{
				// If it is the first slice then just stop on the first frame
				// BUGBUG JR: This won't work if numFrames is greater than the frames in one slice
				if(this.playObj.sliceNum == 0)
				{
					if(this.playing)
					{
						this.playObj.movieClip. gotoAndPlay(2);
					}
					else
					{
						this.playObj.movieClip. gotoAndStop(2);
					}
				}
				else
				{				
					// Setup the number of frames to backup in the previous frame
					this.targetPlayFrame = 2;
					this.skipFrames = this.playObj.movieClip._currentframe - numFrames - 2;
	
					this.sliceToLoad = this.playObj.sliceNum - 1;
					
					// Unload the buffer			
					while(this.playBuff.length > 0)
					{
						nextObj = this.playBuff.shift(); 
						this.loadBuff.push(nextObj);
					}
				
					this.waitingToPlay = true;
					
					if(this.loading)
					{
						this.loadBuff.push(this.loadObj);
						this.loading = false;
					}
				}
			}		
		}
		else
		{
			// Must be at the first of the clip so just set the target frame and leave it as is.
			this.targetPlayFrame = 2;
		}
		
		this.settingLoadParameters = false;
	}
}

//! \breif This method returns the Movie clide action
smartLoader_c.prototype.getMovieClickAction = function() 
{
	return (this.smClickAction);
}


//! \breif This method returns the Movie clide action
smartLoader_c.prototype.getMovieClickActionURL = function() 
{
	return (this.smClickActionURL);
}


//! \breif This method returns the Movie clide action
smartLoader_c.prototype.getMovieClickActionMethod = function() 
{
	return (this.smClickActionURLMethod);
}


//! \brief Handles the end movie actions
smartLoader_c.prototype.endMovieActions = function() 
{
	switch (this.smEndMovieAction)
	{
		case SM_ACTION_GET_URL:
			getURL (this.smEndMovieActionURL, this.smEndMovieActionURLMethod);
			break;

		case SM_ACTION_LOAD_MOVIE:
			loadMovieNum(this.smEndMovieActionURL, 0);
			break;
		
		case SM_ACTION_UNLOAD_MOVIE:
			unloadMovie (0);
			
		case SM_ACTION_NONE:
		default:
			break;
	};
};


////////////////////////////////////////////////////////////////////////////////
//; smartLoader_c.prototype.playMovie()
//
// Abstract:
//	This function initializes variables and sets the system up to play the
//	movie.
//
// Returns:
//
smartLoader_c.prototype.playMovie = function(parentThis) 
{	
	this.useLinkedFlv = parentThis.smUseLinkedFlv;
	this.smKeyFrameRate = parentThis.smKeyFrameRate;
	this.numFPS = parentThis.numFPS;
	this.smStartPauseTime = parentThis.smStartPauseTime;
	this.pauseIntervalID = NULL;
	this.smLoopNumber = parentThis.smLoopNumber;
	this.loopCount = 1;
	this.notifyIsPlaying = false; // default value
	
	this.smEndMovieAction = parentThis.smEndMovieAction;
	this.smEndMovieActionURL = parentThis.smEndMovieActionURL;
	this.smEndMovieActionURLMethod = parentThis.smEndMovieActionURLMethod;
	this.smClickAction = parentThis.smClickAction;
	this.smClickActionURL = parentThis.smClickActionURL;
	this.smClickActionURLMethod = parentThis.smClickActionURLMethod;
	
	if (this.useLinkedFlv)
	{
		this.linkedFlvFile = parentThis.smLinkedFlvFile;
		
		// Create a NetConnection object: 
		var netConn:NetConnection = new NetConnection();
		this.smNetConn = netConn;
		//Create a local streaming connection 
		this.smNetConn.connect(null); 
		// Create a Net Stream object and define an onStatus Frunction: 
		var linkedFlv_ns:NetStream = new NetStream(this.smNetConn); 
		this.smLinkedFlv_ns = linkedFlv_ns;
		// Set the buffer time: 
		this.smLinkedFlv_ns.setBufferTime(5); 

		// Resize the FLV Window
		parentThis.smMovieClip.smLinkedFlv._x = 0 - parentThis.smVideoWidth / 2;
		parentThis.smMovieClip.smLinkedFlv._y = 0 - parentThis.smVideoHeight / 2;
		parentThis.smMovieClip.smLinkedFlv._width = parentThis.smVideoWidth;
		parentThis.smMovieClip.smLinkedFlv._height = parentThis.smVideoHeight;

		//Attach the NetStream video feed to the Video Object: 
		parentThis.smMovieClip.smLinkedFlv.attachVideo(this.smLinkedFlv_ns);	

		this.smLinkedFlv_ns.hSmartLoader = this;
		
		//begin playing flv 
		this.smLinkedFlv_ns.play(this.linkedFlvFile); 
		
		this.smLinkedFlv_ns.smVideoDuration = 0; // indidate not initialized

		// Should we pause the movie
		if (this.smStartPauseTime < 0)
		{
			// Pause forever
			this.playing = false;
		}
		else if (this.smStartPauseTime == 0)
		{
			// No pause
			this.playing = true;
			// Notify template that playing has started
			this.notifyIsPlaying = true;
			this.onPlaying (true);
		}
		else 
		{
			// Pause before playing
			this.playing = false;
		}
		
		// This function is a callback function when meta data is read
		this.smLinkedFlv_ns.onMetaData = function(obj) 
		{
			//for (var propName:String in obj) 
			//{
			//	trace(propName + " = " + obj[propName]);
			//}
			
			this.smVideoDuration = obj.duration;
			
			// if the template or user stops the video before
			// the first frame is displayed we let it play until
			// the meta data is recieved and then stop it
			if (!this.hSmartLoader.playing)
			{
				this.hSmartLoader.movieStop ();
				
				// Do we need to pause the video
				if (this.hSmartLoader.smStartPauseTime > 0)
				{
					// Yes - set pause time in milliseconds
					this.hSmartLoader.pauseIntervalID = setInterval(this.hSmartLoader, "moviePlay", 
																	this.hSmartLoader.smStartPauseTime * 1000);
				}
			}
			
			this.hSmartLoader.onMetaData (obj);
		};
		
		this.smLinkedFlv_ns.onStatus = function(infoObject:Object) 
		{
			//trace("NetStream.onStatus called: ("+getTimer()+" ms)");
			//for (var prop in infoObject) {
			//	trace("\t"+prop+":\t"+infoObject[prop]);
			//}
			//trace("");
			
			switch (infoObject.code)
			{
				case "NetStream.Play.Stop":
					this.hSmartLoader.endMovieActions ();
					
					if (0 == this.hSmartLoader.smLoopNumber || // Loop forever
						this.hSmartLoader.loopCount < this.hSmartLoader.smLoopNumber)
					{
						// continue by looping
						this.hSmartLoader.loopCount += 1;
						this.hSmartLoader.gotoStart ();
					}
					else
					{
						this.hSmartLoader.loopCount = 1;

						if (true == this.hSmartLoader.notifyIsPlaying)
						{
							// Stop player and Notify template that playing has stopped
							this.hSmartLoader.movieStop ();
						}
					}

					break;
				case "NetStream.Play.Start":
				case "NetStream.Buffer.Flush":
					// we don't notify of play here because we let the video play until
					// until we get the metadata and stop it after if needed
					break;
					
				case "NetStream.Buffer.Full":		
				case "NetStream.Buffer.Empty":	
				case "NetStream.Seek.Notify":
				case "NetStream.Seek.InvalidTime":// ?
					break;
			};
		};
		
		this.smLinkedFlv_ns.onCuePoint = function(infoObject:Object) 
		{
			this.hSmartLoader.onCurPoint (obj);
		};		
	}
	else
	{
		// Initialize some items
	
		// Make certain that the basename uses the URL from the loaded slice
		var lastIndex = parentThis.smMovieClip._url.lastIndexOf("/");
		var lastBSIndex = parentThis.smMovieClip._url.lastIndexOf("\\");
		
		if(lastIndex < lastBSIndex)
		{
			lastIndex = lastBSIndex;
		}
		
		lastIndex += 1;
	
		this.baseName = parentThis.smMovieClip._url.slice(0, lastIndex);
		this.baseName = this.baseName + parentThis.baseName;
	
		this.loading = false;
		this.fps = Number(parentThis.fps);
		this.numSlices = parentThis.numSlices;
		this.parentThis = parentThis;
		this.loadBuff = new Array();
		this.playBuff = new Array();
		this.waitingToPlay = true;
		this.playing = true;
		this.sliceToLoad = 0;
		this.targetPlayFrame = 2;
		this.skipFrames = 0;
		this.rewinding = false;
		this.hasSetPosition = false;
		
		// Create a pool of MovieClips with the first one already defined.
		for(i = 0; i < 3; i++) {
			parentThis.smMovieClip.createEmptyMovieClip("Movie_" + i, parentThis.smMovieClip.getDepth() + i + 1);
			tmpObject = new Object();
			tmpObject.movieClip = parentThis.smMovieClip["Movie_" + i];
			tmpObject.sliceNum = -1;
			tmpObject.depth = tmpObject.movieClip.getDepth();
			this.loadBuff.push(tmpObject);
		}
		
		this.prevFrames = new Array(this.numslices);
	
		this.prevFrames[0] = 0;
		
		for(i = 1; i < this.numSlices; i++)
		{
			this.prevFrames[i] = this.prevFrames[i-1] + parentThis.numFIS[i - 1] - 2;
		}
		
		this.totalFrames = this.prevFrames[this.numSlices - 1] + parentThis.numFIS[this.numSlices - 1] - 2;
		this.settingLoadParameters = false;
		
		this.preloadMovie();
		
		// Start the preloader
		this.intervalref = setInterval(this, "preloadMovie", 200);

		// Should we play the movie
		if (this.smStartPauseTime < 0)
		{
			// Pause forever
			this.movieStop ();
		}
		else if (this.smStartPauseTime == 0)
		{
			// No pause
			this.MoviePlay ();
		}
		else 
		{
			// Pause before playing
			this.movieStop ();
			// set pause time in milliseconds
			this.pauseIntervalID = setInterval(this, "moviePlay", 
												this.smStartPauseTime * 1000);
		}
	}
};

////////////////////////////////////////////////////////////////////////////////
//; smartLoader_c.prototype.GetNetStream()
//
// Abstract:
//	This function returns the NetStream for linked video.
//
// Returns:
//
smartLoader_c.prototype.GetNetStream = function() 
{	
	return (this.smLinkedFlv_ns);
}

////////////////////////////////////////////////////////////////////////////////
//; smartLoader_c.prototype.isPlaying ()
//
// Abstract:
//	This function returns whether the movie is playing or not
//
// Returns:
//
smartLoader_c.prototype.isPlaying = function() 
{	
	return (this.notifyIsPlaying);
}


// This is main level code that is executed as soon as this 
// script starts.  This is the actual code that runs everything.

// If this code is called again in a loop it should work becuase
// the old smartLoader gets removed.
delete this.smartLoader;

// Open a new smartLoader class.
this.smartLoader = new this.smartLoader_c();

// Play the movie. Pass in this so that the smartLoader class
// can access smMovieClip.
// BUGBUG JR: The documentation talks about using the _parent
// to access the parent object but I couldn't get it to work.
// Perhaps I don't truly understand what _parent points to.
// Although you don't normally want a child to have access to
// the parent instance this works well.

//this.numFIS = new Array(this.numslices);
//this.numFIS [0] = 80;
//this.numFIS [1] = 70;


this.smartLoader.playMovie(this);

stop();

//var totalDuration = this.smartLoader.getDurationTime ();
//trace ("total Duration: " + totalDuration);
//this.smartLoader.movieStop ();
//this.smartLoader.seekTime (totalDuration / 2);

//this.smartLoader.onMetaData = function(obj) 
//{
//	for (var propName:String in obj) 
//	{
//		trace(propName + " = " + obj[propName]);
//	}
//};
