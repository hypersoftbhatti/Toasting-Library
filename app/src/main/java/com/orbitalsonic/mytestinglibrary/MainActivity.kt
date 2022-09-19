package com.orbitalsonic.mytestinglibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.orbitalsonic.toasting.Toasting.showToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_show_toast).setOnClickListener {
            showToast("Hello World!")
        }
    }
}