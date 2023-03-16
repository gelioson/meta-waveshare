#Add device tree file overlay
do_deploy:append(){
	echo "dtoverlay=waveshare35b-v2:rotate=90" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
	echo "display_rotate=1" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
}
