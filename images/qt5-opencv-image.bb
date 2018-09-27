SUMMARY = "A Qt5 + OpenCV development image"

require qt5-image.bb

PACKAGECONFIG_append_pn-opencv = " freetype gstreamer libv4l v4l"

IMAGE_INSTALL += " \
    opencv \
    gstreamer1.0-omx \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    gstreamer1.0-plugins-bad \
    gstreamer1.0-plugins-ugly \
    gstreamer1.0-libav \
    gstreamer1.0-rtsp-server \
"

export IMAGE_BASENAME = "qt5-opencv-image"
