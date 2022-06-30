package com.labstyle.darioinlineimagetextviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.labstyle.darioinlineimagetextview.DarioInlineImageTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inlineImgTextView = findViewById<DarioInlineImageTextView>(R.id.text0)
        inlineImgTextView.setImageClickHandler {
            Log.d("dbg", "click")
        }

        inlineImgTextView.setInlineImage(
            imgResId = R.drawable.ic_baseline_account_circle_24,
            atIndex = 1)
    }
}
