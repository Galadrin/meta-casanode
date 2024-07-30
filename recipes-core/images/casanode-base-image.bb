SUMMARY = "Casanode minimal image"
DESCRIPTION = "Linux-only image"
LICENSE = "MIT"

require recipes-core/images/core-image-minimal.bb

IMAGE_FSTYPES = "tar.xz ext3 rpi-sdimg"

IMAGE_FEATURES += "debug-tweaks"

IMAGE_INSTALL += " \
    nodejs \
    docker-moby \
"
