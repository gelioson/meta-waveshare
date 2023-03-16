#Add device tree file overlay
do_deploy:append(){
	echo "dtoverlay=waveshare35b-v2" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
}
