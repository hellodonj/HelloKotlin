package com.djj.android.hellokotlin.ui.login

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.djj.android.hellokotlin.*
import com.djj.android.hellokotlin.bean.UserBean
import com.djj.android.hellokotlin.http.Api
import com.djj.android.hellokotlin.http.ApiService
import com.djj.android.hellokotlin.temp.Runoob
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * desc: 111
 * author:djj
 * date:2021/3/6 16:37
 */
class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val login = findViewById<Button>(R.id.login)

        //登录
        login.setOnClickListener {
            login(username, password);
        }

        val site = Runoob("DongJunZe")
        site.siteName
        site.url
        site.country
        site.foo()

    }

    private fun login(username: EditText, password: EditText) {
        //TODO("Not yet implemented")
        var userNames = username.text.toString()
        var passwords = password.text.toString()

        if (TextUtils.isEmpty(userNames)) {
            this.showShortToast("用户名不能为空")
            return
        }

        if (TextUtils.isEmpty(passwords)) {
            this.showShortToast("密码不能为空")
            return
        }

        //日志拦截器
        var httpLoggingInterceptor =
            HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        //Okhttp对象
        var okHttpClient = OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()

        //创建Retrofit对象
        var retrofit = Retrofit.Builder().baseUrl(Api.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create()).build()

        //创建请求接口类
        var userApiService = retrofit.create(ApiService::class.java)
        userApiService.login(userNames, passwords)
            .enqueue(object : retrofit2.Callback<UserBean> {
                override fun onFailure(call: retrofit2.Call<UserBean>, t: Throwable) {
                    //TODO("Not yet implemented")
                }

                override fun onResponse(
                    call: retrofit2.Call<UserBean>,
                    response: Response<UserBean>
                ) {
                    //TODO("Not yet implemented")

                    var result = response.body()
                    if (result?.code == 200) {
                        var intent:Intent = Intent()
                        intent.setClass(this@LoginActivity, EmptyActivity::class.java)
                        startActivity(intent)
                        Toast.makeText(this@LoginActivity, "登录成功", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this@LoginActivity, "登录失败", Toast.LENGTH_SHORT).show()
                    }

                }
            })

    }
}
