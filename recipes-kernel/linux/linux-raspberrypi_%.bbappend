FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append = " file://waveshare35a-overlay.dts"

do_configure:append(){
	cp ${WORKDIR}/waveshare35a-overlay.dts ${S}/arch/${ARCH}/boot/dts/overlays/
}

KERNEL_DEVICETREE:append = " overlays/waveshare35a.dtbo"
