SUMMARY = "RP3 Solar Manager Client image"
HOMEPAGE = "http://www.jumpnowtek.com"
LICENSE = "MIT"

require qt5-embed-no-gui-image.bb

IMAGE_FEATURES += "dev-pkgs"

MQTT = " \
    libmosquitto1 \
    libmosquittopp1 \
    mosquitto \
    mosquitto-dev \
    mosquitto-clients \
    python-paho-mqtt \
"

SM_PKGS = " \
    openssl \
    mbedtls \
    redis \
    hiredis \
"

IMAGE_INSTALL += " \
    lsb \
    connman \
    ${SM_PKGS} \
    ${MQTT} \
"

update_sudoers(){
    sed -i 's/# %sudo/%sudo/' ${IMAGE_ROOTFS}/etc/sudoers
}
ROOTFS_POSTPROCESS_COMMAND += "update_sudoers;"

export IMAGE_BASENAME = "rp3-target-image"
