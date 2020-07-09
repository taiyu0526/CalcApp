package jp.techacademy.taiyu.calcapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result.*
import kotlinx.android.synthetic.main.activity_main.textView as textView1

class SecondActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val keisan1 =intent.getFloatExtra("keisan1", 0f)
        val keisan2 =intent.getFloatExtra("keisan2", 0f)
        textView.text = "${  keisan1 + keisan2  }"

    }
}