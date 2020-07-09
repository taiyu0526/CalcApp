package jp.techacademy.taiyu.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.view.View

class MainActivity : AppCompatActivity(),View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        additionbutton.setOnClickListener(this)

        button1.setOnClickListener{
            textView.text = editText.text.toString()
            textView2.text = editText2.text.toString()
        }

    }

        override fun onClick(v: View?) {
            val intent = Intent(this,
                    SecondActivity::class.java)
            intent.putExtra("keisan1", textView.text.toString())
            intent.putExtra("keisan2", textView2.text.toString())
            startActivity(intent)
        }


    }

