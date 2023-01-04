# Auto-Generated by cargo-bitbake 0.3.16
#
inherit cargo

# how to get android-sparse could be as easy as but default to a git checkout:
SRC_URI += "crate://crates.io/android-sparse/0.6.0"
S= "${CARGO_VENDORING_DIRECTORY}/android-sparse-${PV}"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/aho-corasick/0.7.18 \
    crate://crates.io/assert_cmd/0.9.1 \
    crate://crates.io/autocfg/1.0.1 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/build_const/0.2.2 \
    crate://crates.io/byteorder/1.4.3 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/clap/2.34.0 \
    crate://crates.io/crc/1.8.1 \
    crate://crates.io/difference/2.0.0 \
    crate://crates.io/escargot/0.3.1 \
    crate://crates.io/float-cmp/0.4.0 \
    crate://crates.io/getrandom/0.2.3 \
    crate://crates.io/itoa/0.4.8 \
    crate://crates.io/libc/0.2.109 \
    crate://crates.io/memchr/2.4.1 \
    crate://crates.io/normalize-line-endings/0.2.2 \
    crate://crates.io/num-traits/0.2.14 \
    crate://crates.io/ppv-lite86/0.2.15 \
    crate://crates.io/predicates-core/0.9.0 \
    crate://crates.io/predicates-tree/0.9.0 \
    crate://crates.io/predicates/0.9.1 \
    crate://crates.io/proc-macro2/1.0.33 \
    crate://crates.io/quote/1.0.10 \
    crate://crates.io/rand/0.8.4 \
    crate://crates.io/rand_core/0.6.3 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_hc/0.3.1 \
    crate://crates.io/redox_syscall/0.2.10 \
    crate://crates.io/regex-syntax/0.6.25 \
    crate://crates.io/regex/1.5.4 \
    crate://crates.io/remove_dir_all/0.5.3 \
    crate://crates.io/ryu/1.0.6 \
    crate://crates.io/serde/1.0.130 \
    crate://crates.io/serde_derive/1.0.130 \
    crate://crates.io/serde_json/1.0.72 \
    crate://crates.io/syn/1.0.82 \
    crate://crates.io/tempfile/3.2.0 \
    crate://crates.io/textwrap/0.11.0 \
    crate://crates.io/treeline/0.1.0 \
    crate://crates.io/unicode-width/0.1.9 \
    crate://crates.io/unicode-xid/0.2.2 \
    crate://crates.io/wasi/0.10.2+wasi-snapshot-preview1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
"

LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=0ffe68749328daf57dd85d5ca6ee981f \
"

SUMMARY = "An implementation of Android's sparse file format."
HOMEPAGE = "https://gitlab.com/ra_kete/android-sparse-rs"
LICENSE = "MIT"

BBCLASSEXTEND += "native"