package com.djj.android.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class EmptyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empty)

        val button = findViewById<Button>(R.id.button1)

        button.setOnClickListener {
            this.showShortToast("点击了按钮")
        }
    }

//    override fun onClick(p0: View?) {
//        TODO("Not yet implemented")
//        when (p0?.id) {
//            R.id.button1 ->
//
//        }
//    }
}
