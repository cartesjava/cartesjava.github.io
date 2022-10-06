function isFirefox(){return navigator.userAgent.search("Firefox")>0;}
function shouldReloadVideosAsWorkaroundForStalledConnection(){return true;}
function fetchAndReload(src,video){fetch(src).then(response=>video.load());}
function reloadSource(source,video){const src=source.getAttribute("src");fetchAndReload(src,video);}
function reloadSources(video){const sources=video.getElementsByTagName("source");for(var i=0;i<sources.length;i++){reloadSource(sources[i],video);}}
function reloadVideo(video){if(video.hasAttribute("src")){const sourceElement=video;reloadSource(sourceElement,video)}
reloadSources(video);}
function reloadVideos(){const videos=document.getElementsByTagName("video");for(var i=0;i<videos.length;i++){reloadVideo(videos[i]);}}
if(shouldReloadVideosAsWorkaroundForStalledConnection()){window.addEventListener('load',event=>reloadVideos());}