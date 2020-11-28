package com.awesomedevnotes.xlogapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.elvishew.xlog.XLog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val jsonString = "{\"name\": \"Elvis\", \"age\": 18}"
        textview.setOnClickListener {
            XLog.d("Simple message")
            XLog.json(jsonString)
        }
    }
}