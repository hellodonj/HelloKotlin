package com.djj.android.hellokotlin.temp

class Runoobs constructor(name:String) {

    var url:String ="http://www.baidu.com"
    var country:String = "CN"
    var siteName = name

    init {
        print("初始化,${name}")
    }

    //次构造函数
    constructor(name: String, num: Int) : this(name) {
        print("Kotlin排名$num")
    }

    fun foo(){
        print("我是成员函数")
    }
}