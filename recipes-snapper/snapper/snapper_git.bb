LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/ardazishvili/snapper;protocol=https"

PV = "1.0+git${SRCPV}"
SRCREV = "8f8b1f2039bfd1faac7dfaf9faf6aec2322901af"

DEPENDS += " protobuf-native grpc-native grpc"
S = "${WORKDIR}/git/server"

inherit cmake
