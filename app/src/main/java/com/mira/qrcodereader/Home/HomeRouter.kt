package com.mira.qrcodereader.Home

import com.mira.qrcodereader.Base.BaseRouter
import com.mira.qrcodereader.Scan.QR.ScanActivity

interface HomeRouterListener {
    fun redirectToScan()
}



class HomeRouter : BaseRouter,HomeRouterListener {

    constructor(activity: HomeActivity) {
        this.setupActivity(activity)
    }

    override fun redirectToScan() {

        this.redirectTo(ScanActivity::class.java,HashMap())
    }

}