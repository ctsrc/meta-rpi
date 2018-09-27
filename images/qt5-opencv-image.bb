SUMMARY = "A Qt5 + OpenCV development image"

require qt5-image.bb

PACKAGECONFIG_append_pn-opencv = " freetype gstreamer libv4l v4l"

IMAGE_INSTALL += " \
    opencv \
"

export IMAGE_BASENAME = "qt5-opencv-image"
