package com.djj.android.hellokotlin

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.Toast

fun Activity.showShortToast(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}

// ViewExtensions.kt
fun View.isVisible(): Boolean {
    return visibility == View.VISIBLE
}

fun View.setVisible(visible: Boolean) {
    visibility = if (visible) View.VISIBLE else View.GONE
}

fun Activity.activityIntent(context:Context,clazz: Class<Any>){
    var intent = Intent()
    intent.setClass(context,clazz)
    context.startActivity(intent)
}
