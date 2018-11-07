SUMMARY = "RP3 Solar Manager Client image"
HOMEPAGE = "http://www.jumpnowtek.com"
LICENSE = "MIT"

require qt5-embed-no-gui-image.bb

MQTT = " \
    libmosquitto1 \
    libmosquittopp1 \
    mosquitto \
    mosquitto-dev \
    mosquitto-clients \
    python-paho-mqtt \
"

SM_PKGS = " \
    mbedtls \
    redis \
    hiredis \
    mosquitto \
"

IMAGE_INSTALL += " \
    ${SM_PKGS} \
    ${MQTT} \
"

export IMAGE_BASENAME = "rp3-target-image"
