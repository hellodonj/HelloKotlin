package com.djj.android.hellokotlin.temp

class Runoob constructor(name: String){//可以有一个 主构造器，以及一个或多个次构造器，主构造器是类头部的一部分，位于类名称之后

    //Kotlin 类可以包含：构造函数和初始化代码块、函数、属性、内部类、对象声明。


    //次构造函数
//    constructor(name: String){
//      parent.children.add(this)
//    }

    constructor (name: String, age:Int) : this(name) {
        // 初始化...

    }

    //类的属性 关键字 var 声明为可变的，否则使用只读关键字 val 声明为不可变。
    var url:String = "http://www.cainiao.com"
    var country:String = "CV"
    var siteName = name

    // Kotlin 中没有 new 关键字
//    val site = Runoob()


    //初始化
    init {
        print("初始化网站：${name}")
    }

    //定义成员函数
    fun foo() {
        print("我是类的成员函数：Foo")
    }


    //属性类型可以从初始化语句或者类的成员函数中推断出来，那就可以省去类型，val不允许设置setter函数，因为它是只读的
    var num = 1
    val simple:Int?
        get() {
            TODO()
        }
    val simple1:Int = 1


    var lastName: String = "Dong"
        get() = field.toUpperCase()
        set


    var no: Int = 100
        get() = field
        set(value) {
            if (value < 10) {
                field = value
            } else {
                field = -1
            }
        }
}