package com.mc.androidtools

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mc.commonlib.PinyinTools
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of a call to a native method
//        sample_text.text = stringFromJNI()
        val text = PinyinTools.getPingYin("我要用微信支付")
        var contains = text.contains("weixin")
        sample_text.text = contains.toString()
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}
