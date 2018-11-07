SUMMARY = "A Qt5 development image"
HOMEPAGE = "http://www.jumpnowtek.com"
LICENSE = "MIT"

require qt5-basic-image.bb

QT5_DEV_PKGS = " \
    qtconnectivity-dev \
    qtconnectivity-mkspecs \
    qtlocation-dev \
    qtlocation-mkspecs \
    qtmultimedia-dev \
    qtmultimedia-mkspecs \
    qtquickcontrols2-dev \
    qtquickcontrols2-mkspecs \
    qtsensors-dev \
    qtsensors-mkspecs \
    qtserialbus-dev \
    qtserialbus-mkspecs \
    qtsvg-dev \
    qtsvg-mkspecs \
    qtwebsockets-dev \
    qtwebsockets-mkspecs \
    qtxmlpatterns-dev \
    qtxmlpatterns-mkspecs \
"

QT5_PKGS = " \
    qtlocation-plugins \
    qtmultimedia \
    qtquickcontrols2 \
    qtsensors-plugins \
    qtserialbus \
    qtsvg \
    qtwebsockets-qmlplugins \
    qtxmlpatterns \
"

QML_APPS = " \
    qqtest \
"

IMAGE_INSTALL += " \
    ${QT5_PKGS} \
    ${QML_APPS} \
"

export IMAGE_BASENAME = "qt5-embed-no-gui-image"
