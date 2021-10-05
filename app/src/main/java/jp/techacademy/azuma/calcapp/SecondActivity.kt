package jp.techacademy.azuma.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value1 = intent.getDoubleExtra("VALUE1",0.0)
        val value2 = intent.getDoubleExtra("VALUE2",0.0)
        val calc = intent.getIntExtra("Calc",0)
        Log.d("UI_PARTS2","${value1}")

        if(calc == 1) {
            textView.text = "${value1 + value2}"
            //Log.d("UI_PARTS2","${value1}")
        }else if(calc == 2){
            textView.text = "${value1 - value2}"
        }else if(calc == 3){
            textView.text = "${value1 * value2}"
        }else if(calc == 4){
            textView.text = "${value1 / value2}"
        }

    }
}