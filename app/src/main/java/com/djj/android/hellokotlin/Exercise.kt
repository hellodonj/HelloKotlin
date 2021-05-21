package com.djj.android.hellokotlin

/**
 * desc:主构造函数
 * author:djj
 * date:2021/3/6 13:51
 * Object:取消，在Java里Object是所有类的基类，但在Kotlin里，基类改成了Any

Any:新增，Kotlin里所有类的基类

object:新增，Kotlin是区分大小写的，object是Kotlin中的单例类

new:取消，Kotlin不需要new关键字

private: 仍然表示私有

protected: 类似private，在子类中也可见

internal: 模块内可见

inner:内部类

public: 仍然表示共有，但是Kotlin的内部类和参数默认为public

abstract:仍然表示抽象类

interface:仍然表示接口

final:取消，Kotlin的继承和Java不同，Java的类默认可继承，只有final修饰的类不能继承；Kotlin的类默认不能继承，只有为open修饰的类能继承

open:新增，作用见上一条

static:取消！Java用static去共享同一块内存空间，这是一个非常实用的设计，不过Kotlin移除了static，用伴随对象（前面提到过的compaion object）的概念替换了static，伴随对象其实是个单例的实体，所以伴随对象比static更加灵活一些，能去继承和扩展。

继承:在Kotlin里，继承关系统一用“:”，不需要向java那样区分implement和extend，在继承多个类/接口时，中间用“,”区分即可，另外，在继承类时，类后面要跟()。所以在Kotlin里，继承类和接口的代码一般是这样的：
 */
class Exercise constructor(val id: Int, val exerciseId: Long, val exerciseName: String) {//主构造函数


    //二级构造函数必须代理主构造函数
    constructor(status: Int, id: Int, exerciseId: Long, exerciseName: String) : this(
        id,
        exerciseId,
        exerciseName
    ) {

    }

    init {
        //初始化模块
    }
}