package com.example.xjplus.myapplication

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class AService : Service() {

    override fun onBind(intent: Intent?): IBinder? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        Log.i("a", "hello")

    }
}