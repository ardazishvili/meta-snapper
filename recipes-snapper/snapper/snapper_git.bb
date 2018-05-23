# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/ardazishvili/snapper;protocol=https"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "6837a59d6dd009b875f43436d1cf91fe55d2b5df"

DEPENDS += " protobuf-native grpc-native grpc"
S = "${WORKDIR}/git"

inherit cmake

do_configure () {
    cd server
    mkdir cbuild && cd cbuild
    cmake ../
}

do_compile () {
    cd server/cbuild
    make
}

do_install () {
    install -d ${D}${bindir}/
    install -m 0755 ${S}/server/cbuild/snapper ${D}${bindir}/ 
}

