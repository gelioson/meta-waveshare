SUMMARY = "Library for simulating key press events under X11"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://git.yoctoproject.org/libfakekey;branch=master"

PV = "0.3+git${SRCPV}"
SRCREV = "7ad885912efb2131e80914e964d5e635b0d07b40"

S = "${WORKDIR}/git"

DEPENDS = "libxtst libx11"

inherit pkgconfig autotools

