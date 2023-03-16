SUMMARY = "Program to copy the Raspberry Pi display to a secondary framebuffer"
HOMEPAGE = "https://github.com/AndrewFromMelbourne/raspi2fb"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "libbsd userland"

SRCREV = "7e1bae71c5af88240f7eb89a924161c7ee0b00f5"
SRC_URI = "\
    git://github.com/AndrewFromMelbourne/raspi2fb;protocol=https;branch=master \
    file://0003-Fix-cmake-paths-for-yocto-build.patch \
    file://0002-Fix-init-script-for-yocto.patch \
    file://default \
"

SRC_URI[sha256sum] = "337b579a32ac7e1414b5122cb26b57d88ba6fc4b57c346ba55de47eccaae0cd3"

S = "${WORKDIR}/git"

inherit cmake

do_install:append () {
    install -d ${D}${sysconfdir}/init.d
    install -m 0755 ${S}/raspi2fb.init.d ${D}${sysconfdir}/init.d/raspi2fb

    install -d ${D}${sysconfdir}/default
    install -m 0664 ${WORKDIR}/default ${D}${sysconfdir}/default/raspi2fb
}

FILES_${PN} = "${bindir} ${sysconfdir}"
