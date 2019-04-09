package com.mira.qrcodereader.Home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mira.qrcodereader.R

interface HomeListener {
    fun redirectToScanQR()
}

class HomeActivity : AppCompatActivity(),HomeListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun redirectToScanQR() {

    }
}
