SUMMARY = "A base image that fully supports the target device hardware and waveshare LCD screen"

IMAGE_FEATURES += "splash"

LICENSE = "MIT"

inherit core-image

HDMI_FORCE_HOTPLUG = "1"
HDMI_GROUP = "2"
ENABLE_UART = "1"
ENABLE_SPI_BUS = "1"

IMAGE_FEATURES_append = " x11-base ssh-server-dropbear"

IMAGE_INSTALL_append = " kernel-modules xserver-xorg xserver-xf86-config xterm xf86-input-evdev raspi2fb xf86-video-fbdev xinput-calibrator gpsd python3"
