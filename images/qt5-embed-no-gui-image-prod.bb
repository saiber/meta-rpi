SUMMARY = "A Qt5 development image"
HOMEPAGE = "http://www.jumpnowtek.com"
LICENSE = "MIT"

require qt5-basic-image-prod.bb

QT5_PKGS = " \
    qtlocation-plugins \
    qtmultimedia \
    qtquickcontrols2 \
    qtsensors-plugins \
    qtserialbus \
    qtsvg \
    qtwebsockets-qmlplugins \
    qtxmlpatterns \
    qtknx \
    qtmqtt \
"

IMAGE_INSTALL += " \
    ${QT5_PKGS} \
"

export IMAGE_BASENAME = "qt5-embed-no-gui-image-prod"
