#Add device tree file overlay
do_deploy:append(){
	echo "dtoverlay=waveshare35a" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
}
