FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

# Enable freedreno driver
PACKAGECONFIG_FREEDRENO = "\
    gallium \
    freedreno \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'xa', '', d)} \
"

PACKAGECONFIG_append_apq8016 = "${PACKAGECONFIG_FREEDRENO}"
PACKAGECONFIG_append_apq8064 = "${PACKAGECONFIG_FREEDRENO}"
PACKAGECONFIG_append_apq8096 = "${PACKAGECONFIG_FREEDRENO}"
PACKAGECONFIG_append_sdm845 = "${PACKAGECONFIG_FREEDRENO}"
