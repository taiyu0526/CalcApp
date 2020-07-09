package jp.techacademy.taiyu.calcapp


import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.view.View
import android.widget.EditText



class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)



    }


    override fun onClick(v: View) {

        val intent = Intent(this, SecondActivity::class.java)

        var str1: String = editText.text.toString()//エディットテキストの値をstring型
        var str2: String = editText2.text.toString()

        var num1: Double = str1.toDouble()//string型をdouble型へ
        var num2: Double = str2.toDouble()

        var result = 0.0



        if (str1.length == 0 || str2.length == 0) {

            val error = Snackbar.make(view, "数値を入力してください",snackbar.LENGTH_LONG ).show()



        } else {


            if (v.id == R.id.button1) {
                result = num1 + num2
            } else if (v.id == R.id.button2) {
                result = num1 - num2
            } else if (v.id == R.id.button3) {
                result = num1 * num2
            } else if (v.id == R.id.button4) {
                result = num1 / num2
            }
        }

        intent.putExtra("result", result)
        startActivity(intent)
    }
}




