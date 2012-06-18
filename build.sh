#!/bin/sh

INSTALL_DIR="`pwd`/jni/monkey"
SRC_DIR="/home/f13/gsoc/android/monkey"

cd $SRC_DIR

export CC="arm-linux-androideabi-gcc --sysroot=$SYSROOT"
export LD="arm-linux-androideabi-ld"
export AR="arm-linux-androideabi-ar"
export RANLIB="arm-linux-androideabi-ranlib"
export STRIP="arm-linux-androideabi-strip"

mkdir -p $INSTALL_DIR
./configure --platform=android --trace --prefix=/data/monkey --enable-plugins=duda

make

exit 0
