LOCAL_PATH:= $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE_TAGS := optional

LOCAL_SRC_FILES := \
        $(call all-java-files-under, src)

LOCAL_PACKAGE_NAME := Tetheringhack

LOCAL_STATIC_JAVA_LIBRARIES := android-support-v13

include $(BUILD_PACKAGE)

include $(call all-makefiles-under,$(LOCAL_PATH))
