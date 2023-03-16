SUMMURY = "Matchbox Keyboard yocto recipe"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

SRC_URI = "git://git.yoctoproject.org/matchbox-keyboard;branch=kirkstone"

PV = "0.2+git${SRCPV}"
SRCREV = "8c2edad39aa0548552b7dd87fb04d21670cfd73a"

S = "${WORKDIR}/git"

DEPENDS = "libfakekey libxrender libxft libpng cairo gtk+ gtk+3"

inherit pkgconfig autotools
