package com.example.muhammadrizwan.splash_screen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlin.concurrent.thread

class Splash_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_)

        var splash = object :Thread()
        {
            override fun run() {
                super.run()

                try {
                    Thread.sleep(5000)
                    var intent = Intent(this@Splash_Activity,MainActivity::class.java)
                    startActivity(intent)
                }catch(e:Exception){
                    e.printStackTrace()
                }

            }
        }
        splash.start()

    }
}
