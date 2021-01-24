FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = " file://waveshare35a-overlay.dts"

do_configure_append(){
	cp ${WORKDIR}/waveshare35a-overlay.dts ${S}/arch/${ARCH}/boot/dts/overlays/
}

KERNEL_DEVICETREE_append = " overlays/waveshare35a.dtbo"
