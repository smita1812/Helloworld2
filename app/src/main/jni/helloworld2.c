//
// Created by smita on 18-05-2019.
//
#include <android/log.h>
#import <jni.h>
jstring Java_com_dsp_helloworld_MainActivity_getString ( JNIEnv* env, jobject thiz )
{
int classNum = 9001;
int secNum = 1;
__android_log_print(ANDROID_LOG_ERROR, "HelloWorld," "DSP %d.%03d," classNum, secNum);
return (*env)->NewStringUTF(env, "Hello UTD!");
}
