LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/ardazishvili/snapper;protocol=https"

PV = "1.0+git${SRCPV}"
SRCREV = "184b3b0a98ab417bd78aef232cb384b4de425217"

DEPENDS += " protobuf-native grpc-native grpc"
S = "${WORKDIR}/git/server"

inherit cmake
