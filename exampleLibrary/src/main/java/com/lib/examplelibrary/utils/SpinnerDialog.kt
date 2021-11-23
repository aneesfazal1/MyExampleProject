package com.lib.examplelibrary.utils

import android.app.Dialog
import android.app.ProgressDialog
import android.content.Context


class SpinnerDialog{

    lateinit var progress: ProgressDialog

    fun showLoadingDialog(context: Context) {
        if (progress == null) {
            progress = ProgressDialog(context)
            progress.setTitle("Please wait.")
            progress.setMessage("Loading....")
        }
        progress.show()
    }

    fun dismissLoadingDialog() {
        if (progress != null && progress.isShowing()) {
            progress.dismiss()
        }
    }

}