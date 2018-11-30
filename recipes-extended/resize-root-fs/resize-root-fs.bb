SUMMARY = "Resize root file system at first boot, this will expand the root file system to entire space of SD card"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

do_install() {
    
    install -d ${D}/usr/lib/raspi-config
    install -m 0755 ${THISDIR}/files/init_resize.sh   ${D}/usr/lib/raspi-config
}

FILES_${PN} = "/usr/lib/raspi-config/*"

