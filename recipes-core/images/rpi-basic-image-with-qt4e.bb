# Base this image on rpi-basic-image
include recipes-core/images/rpi-basic-image.bb

# Include modules in rootfs
IMAGE_INSTALL += " \
	packagegroup-core-qt4e \
	"
