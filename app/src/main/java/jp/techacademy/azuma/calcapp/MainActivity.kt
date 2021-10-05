package jp.techacademy.azuma.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View
import android.util.Log
//import com.google.android.material.floatingactionbutton.FloatingActionButton
//import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /*
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        */

        button1.setOnClickListener{
            //Log.d("UI_PARTS","ボタン1をタップ")
            if(editText1.text.toString()!="" && editText2.text.toString()!=""){

            val intent = Intent(this, SecondActivity::class.java)
            val text1 = editText1.text.toString()
            Log.d("UI_PARTS",text1)
            intent.putExtra("VALUE1",text1.toDouble())
            val text2 = editText2.text.toString()
            Log.d("UI_PARTS",text2)
            intent.putExtra("VALUE2",text2.toDouble())
            intent.putExtra("Calc",1)
            startActivity(intent)

            }else{
                Log.d("UI_PARTS","+数値を入力して下さい。")
                /*
                findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
                    Snackbar.make(view,"Replace with your own action",Snackbar.LENGTH_INDEFINITE)
                        .setAction("Action"){
                            Log.d("UI_PARTS","Snackをタップした")
                        }.show()

                }*/
            }
        }
        button2.setOnClickListener{
            if(editText1.text.toString()!="" && editText2.text.toString()!=""){
                val intent = Intent(this, SecondActivity::class.java)
                val text1 = editText1.text.toString()
                Log.d("UI_PARTS",text1)
                intent.putExtra("VALUE1",text1.toDouble())
                val text2 = editText2.text.toString()
                Log.d("UI_PARTS",text2)
                intent.putExtra("VALUE2",text2.toDouble())
                intent.putExtra("Calc",2)
                startActivity(intent)
            }else{
                Log.d("UI_PARTS","-数値を入力して下さい。")
            }
        }
        button3.setOnClickListener{
            if(editText1.text.toString()!="" && editText2.text.toString()!=""){
                val intent = Intent(this, SecondActivity::class.java)
                val text1 = editText1.text.toString()
                Log.d("UI_PARTS",text1)
                intent.putExtra("VALUE1",text1.toDouble())
                val text2 = editText2.text.toString()
                Log.d("UI_PARTS",text2)
                intent.putExtra("VALUE2",text2.toDouble())
                intent.putExtra("Calc",3)
                startActivity(intent)
            }else{
                Log.d("UI_PARTS","*数値を入力して下さい。")
            }
        }
        button4.setOnClickListener{
            if(editText1.text.toString()!="" && editText2.text.toString()!=""){
                val intent = Intent(this, SecondActivity::class.java)
                val text1 = editText1.text.toString()
                Log.d("UI_PARTS",text1)
                intent.putExtra("VALUE1",text1.toDouble())
                val text2 = editText2.text.toString()
                Log.d("UI_PARTS",text2)
                intent.putExtra("VALUE2",text2.toDouble())
                intent.putExtra("Calc",4)
                startActivity(intent)
            }else{
                Log.d("UI_PARTS","/数値を入力して下さい。")
            }
        }


    }

    /*
    override fun onClick(v:View){
        Log.d("UI_PARTS","tap!!")
    }
     */








}