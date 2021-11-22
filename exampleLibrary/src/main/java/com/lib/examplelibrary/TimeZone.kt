package com.lib.examplelibrary

import android.app.Activity
import android.content.Context
import android.widget.Toast
import android.app.Application
import androidx.lifecycle.LifecycleOwner

object TimeZone {

    private var context=Application()
    private var myViewModel = MyViewModel(context)
    private var currentTimeZone:String = ""

      fun getTimeZone(context: Context, owner:LifecycleOwner):String{
        myViewModel.loadData().observe(owner, {current ->
            if (current != null) {
                currentTimeZone = current.first().timezone.toString()
                Toast.makeText(context, currentTimeZone, Toast.LENGTH_SHORT).show()
            }
        })
        return currentTimeZone
    }
}