package com.djj.android.hellokotlin.http

/**
 * desc:接口常量类
 * author:djj
 * date:2021/3/6 15:53
 */
object Api {
    //http://192.168.0.248:8091/api/v1/learnonly/user/login..{loginId=wy, loginPwd=666666}
    //const就是代表不可修改
    const val BASE_URL: String = "http://192.168.0.248:8091/api/v1/learnonly/"
    const val LOGIN_URL: String = "user/login"
}