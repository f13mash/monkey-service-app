LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE := libmonkey
LOCAL_SRC_FILES := libmonkey.so
include $(PREBUILT_SHARED_LIBRARY)