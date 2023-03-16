FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append = " file://waveshare35b-v2-overlay.dts"

do_configure:append(){
	cp ${WORKDIR}/waveshare35b-v2-overlay.dts ${S}/arch/${ARCH}/boot/dts/overlays/
}

KERNEL_DEVICETREE:append = " overlays/waveshare35b-v2.dtbo"
