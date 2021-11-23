package com.lib.examplelibrary

import android.app.Activity
import androidx.appcompat.app.AlertDialog
import android.content.Context
import android.widget.Toast
import android.app.Application
import androidx.lifecycle.LifecycleOwner
import android.widget.ProgressBar
import android.widget.Spinner
import com.lib.examplelibrary.utils.SpinnerDialog


object TimeZone {

    private var context=Application()
    private var myViewModel = MyViewModel(context)
    private var currentTimeZone:String = ""
    private lateinit var spinnerDialog: AlertDialog


    fun getTimeZone(context: Context, owner:LifecycleOwner):String{
        spinnerDialog = SpinnerDialog.getProgressDialog(context)
        spinnerDialog.show()
        myViewModel.loadData().observe(owner, {current ->
            if (current != null) {
                currentTimeZone = current.first().timezone.toString()
                spinnerDialog.dismiss()
                Toast.makeText(context, currentTimeZone, Toast.LENGTH_SHORT).show()
                return currentTimeZone
            }
        })
        return currentTimeZone
    }
}