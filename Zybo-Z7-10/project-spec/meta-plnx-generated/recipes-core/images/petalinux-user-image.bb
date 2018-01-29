DESCRIPTION = "PETALINUX image definition for Xilinx boards"
LICENSE = "MIT"

require recipes-core/images/petalinux-image-common.inc 

inherit extrausers
IMAGE_LINGUAS = " "

IMAGE_INSTALL = "\
		kernel-modules \
		mtd-utils \
		canutils \
		openssh-sftp-server \
		pciutils \
		run-postinsts \
		packagegroup-core-boot \
		packagegroup-core-ssh-dropbear \
		tcf-agent \
		bridge-utils \
		"
EXTRA_USERS_PARAMS = "usermod -P root root;"
