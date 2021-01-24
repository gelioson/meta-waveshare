# Waveshare yocto layer

This README file contains information on the contents of the meta-waveshare layer.
Please see the corresponding sections below for details.


# 3.5inch RPi LCD (A)

## Dependencies

 - URI: [git://git.openembedded.org/openembedded-core](git://git.openembedded.org/openembedded-core)
	branch: dunfell
 - URI: [git://git.openembedded.org/meta-openembedded](git://git.openembedded.org/meta-openembedded)
	branch: dunfell
	meta-openembedded/meta-oe
	meta-openembedded/meta-xfce
	
 - URI: [git://git.yoctoproject.org/meta-raspberrypi](git://git.yoctoproject.org/meta-raspberrypi)
	branch: dunfell

## Patches

Please submit any patches against the meta-waveshare layer to the maintainer.
Maintainer: ZAKARIA ZH \<zazid@smile.fr\>

## Table of Contents

 1. Adding the meta-waveshare layer to your build
 2. Toggle between LCD and HDMI display
 3. Touch screen calibration
 4. Install Virtual Keyabord

## 1. Adding the meta-waveshare layer to your build
To add meta-waveshare to your build system, you can run:

    bitbake-layers add-layer meta-waveshare

## 2. Toggle between LCD and HDMI display
Once the LCD is enabled, you can switch the display to the HDMI monitor at any time by executing the command:

    LCD-hdmi

This script is provided by the switch-fbdevice recipe and included in the PATH variable.

To switch back to the LCD screen, run the command: 

    LCD35-show

## 3. Touch screen calibration

This LCD can be calibrated through the xinput-calibrator program. It is already integrated in the *waveshare-image-base* image, just run the command : 

    xinput-calibrator

The program is started by default on first boot, but you can calibrate the screen at any time.
## 4. Install Virtual Keyabord

To include the Virtual Keyabord in the image. You can add this line in your local.conf or your image recipe. All dependencies are provided in this layer

    IMAGE_INSTALL_append = " matchbox-keyboard"