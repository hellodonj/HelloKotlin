package com.djj.android.hellokotlin.http

import com.djj.android.hellokotlin.bean.UserBean
import retrofit2.Call
import retrofit2.http.*
import java.util.*
import kotlin.collections.HashMap

/**
 * desc:接口声明类
 * author:djj
 * date:2021/3/6 15:57
 */
interface ApiService {

    @POST(Api.LOGIN_URL)
    @FormUrlEncoded
    fun login(
        @Field("loginId") useId: String, @Field("loginPwd") password: String
    ): Call<UserBean>
}