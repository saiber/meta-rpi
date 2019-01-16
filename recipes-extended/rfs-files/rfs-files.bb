SUMMARY = "Change USB dongle access (needed for a dongle we are using in the USB slot - access needs to be given that it can be used)"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

do_install() {
    
    install -d ${D}/etc/udev/rules.d
    install -m 0755 ${THISDIR}/files/50-myusb.rules   ${D}/etc/udev/rules.d
}

FILES_${PN} = "/etc/udev/rules.d/*"

