package com.mira.qrcodereader.Base

import android.app.Activity
import android.content.Intent

open class BaseRouter {
    var activity: Activity? = null


    constructor() {

    }

    fun setupActivity(activity: Activity) {
        this.activity = activity
    }

    fun redirectTo(target:Class<*>,extra:HashMap<String,String>?) {
        var intent = Intent(this.activity,target).apply {
            extra?.let {
                for ((key, value) in extra) {
                    putExtra(key, value)
                }
            }
        }
        this.activity?.startActivity(intent);
    }
}