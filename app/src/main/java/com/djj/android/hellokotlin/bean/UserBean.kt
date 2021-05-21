package com.djj.android.hellokotlin.bean

/**
 * desc:
 * author:djj
 * date:2021/3/6 17:44
 *
 */
data class UserBean(
    val account: Account,
    val code: Int,
    val message: String,
    val role: List<String>,
    val token: String
)

data class Account(
    val career: String,
    val courseIds: String,
    val email: String,
    val experience: Int,
    val fullName: String,
    val groupId: Int,
    val id: Int,
    val loginDate: String,
    val mobile: String,
    val money: Double,
    val nickName: String,
    val orgId: Int,
    val password: String,
    val relationUserId: Int,
    val status: String,
    val tGolds: Double,
    val tPoints: Double,
    val title: String
)