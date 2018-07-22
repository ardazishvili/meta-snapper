LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/ardazishvili/mqtt_clients.git;protocol=https"

PV = "1.0+git${SRCPV}"
SRCREV = "fbba288fa30d7e0c7e2a58d653a8816f8edbf03c"

DEPENDS += " mosquitto"
S = "${WORKDIR}/git"

inherit cmake
