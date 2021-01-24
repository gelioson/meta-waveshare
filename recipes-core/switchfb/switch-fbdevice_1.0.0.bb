SUMMARY = "Switching Framebuffer device between the LCD screen and the hdmi"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

S = "${WORKDIR}"

SRC_URI = "file://LCD-hdmi \
	file://LCD35-show \
	"

do_install(){
	install -d ${D}${bindir}
	install -m 0755 ${S}/LCD_hdmi ${D}${bindir}
	install -m 0755 ${S}/LCD35-show ${D}${bindir}
}

FILES_${PN} = "/usr/bin/"

RDEPENDS_${PN} += "bash"
