FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_rpi = " \
    file://xorg.conf.d/99-calibration.conf \
"
do_install_append () {
	install -d ${D}/${sysconfdir}/X10/xorg.conf.d/
	install -m 0644 ${WORKDIR}/xorg.conf.d/99-calibration.conf ${D}/${sysconfdir}/X11/xorg.conf.d/
}

FILES_${PN} += "/etc/X11/"
