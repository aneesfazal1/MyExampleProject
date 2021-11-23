package com.lib.examplelibrary.utils

import android.app.Dialog
import android.app.ProgressDialog
import android.content.Context


class SpinnerDialog{

   // var progress: ProgressDialog ?= null

//    fun showLoadingDialog(context: Context) {
//        if (progress == null) {
//            progress = ProgressDialog(context)
//            progress.setTitle("Please wait.")
//            progress.setMessage("Loading....")
//        }
//        progress.show()
//    }

//    fun dismissLoadingDialog() {
//        if (progress != null && progress.isShowing()) {
//            progress.dismiss()
//        }
//    }

    fun progressBar(context: Context, show:Boolean) {
        val progressBar = ProgressDialog(context)
        if (show) {
            progressBar.setCancelable(true) //you can cancel it by pressing back button
            progressBar.setMessage("File downloading ...")
            progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL)
            progressBar.progress = 0 //initially progress is 0
            progressBar.max = 100 //sets the maximum value 100
            progressBar.show() //displays the progress bar
        }else{
            progressBar.dismiss()
        }
    }

}