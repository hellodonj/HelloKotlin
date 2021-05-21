package com.djj.android.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val handle = object:Handler(){
        override fun handleMessage(msg: Message) {
            super.handleMessage(msg)

            msg.let {
                val message = msg.obj
            }

        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.text)
        text.setOnClickListener {
            this.activityIntent(this, EmptyActivity().javaClass)
            //this.activityIntent(this, EmptyActivity::class.java)
        }

//        if (text.isVisible()) {
//            text.setVisible(false)
//        }

//        this.showShortToast("短时间弹框")

        //message

        //kotlin 开启线程
        Thread(object : Runnable{
            override fun run() {
                TODO("Not yet implemented")
                val msg = Message.obtain();
                msg.obj = "message"
                msg.what = 1
                handle.sendMessage(msg)
            }
        }).start()

    }
}