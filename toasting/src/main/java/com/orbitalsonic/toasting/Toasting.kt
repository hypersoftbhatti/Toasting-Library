package com.orbitalsonic.toasting

import android.app.Activity
import android.widget.Toast

object Toasting {
    fun Activity.showToast(message:String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}