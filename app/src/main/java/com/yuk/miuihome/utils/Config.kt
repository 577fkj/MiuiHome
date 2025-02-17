package com.yuk.miuihome.utils

import android.os.Build
import com.yuk.miuihome.BuildConfig

object Config {
    const val modulePackage = BuildConfig.APPLICATION_ID
    const val hostPackage = "com.miui.home"
    const val hostActivityProxy = "com.miui.home.settings.DefaultHomeSettings"
    const val SP_NAME = "MiuiHomePerf"
    const val TAG = "MiuiHome"
    val AndroidSDK: Int = Build.VERSION.SDK_INT
}
