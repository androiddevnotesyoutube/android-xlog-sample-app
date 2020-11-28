package com.awesomedevnotes.xlogapp

import android.app.Application
import android.util.Log
import com.elvishew.xlog.LogConfiguration
import com.elvishew.xlog.LogLevel
import com.elvishew.xlog.XLog

class App : Application(){
    override fun onCreate() {
        super.onCreate()
        XLog.init(LogConfiguration.Builder().logLevel(LogLevel.ALL).enableBorder().disableThreadInfo().enableStackTrace(2).tag("ADN").build())

        Log.d(TAG, "onCreate: ")
    }
}

private const val TAG = "App"