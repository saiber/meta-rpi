SUMMARY = "RP3 Solar Manager Client image"
HOMEPAGE = "http://www.jumpnowtek.com"
LICENSE = "MIT"

require qt5-embed-no-gui-image.bb

SM_PKGS = " \
    mbedtls \
    redis \
    hiredis \
    mosquitto \
"

IMAGE_INSTALL += " \
    ${SM_PKGS} \
"

export IMAGE_BASENAME = "rp-target-image"
