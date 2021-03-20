package com.example.kotlinfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState!=null){
          val  tvUser= savedInstanceState.getString("textViewAnahtarı")
            textView.text=tvUser

        }



        bbutton.setOnClickListener {
            var degerAl = editTextTextPersonName.text.toString()
            textView.text = degerAl
        }



    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("textViewAnahtarı",textView.text.toString())
    }


}

