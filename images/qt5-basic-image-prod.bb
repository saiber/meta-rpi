SUMMARY = "A basic Qt5 qwidgets dev image"
HOMEPAGE = "http://www.jumpnowtek.com"
LICENSE = "MIT"

require console-image-prod.bb

QT_TOOLS = " \
    qtbase \
    qt5-env \
    qtserialport \
"

TSLIB = " \
    tslib \
    tslib-conf \
    tslib-calibrate \
    tslib-tests \
"

IMAGE_INSTALL += " \
    ${QT_TOOLS} \
    qcolorcheck \
    ${TSLIB} \
    tspress \
"

export IMAGE_BASENAME = "qt5-basic-image-prod"
