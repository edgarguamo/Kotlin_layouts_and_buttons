package com.example.layoutsandbuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("pipo")
        clickbutton()
    }

    private fun clickbutton(){
        val btnsum = findViewById<Button>(R.id.btn_sum)
        val btnrest = findViewById<Button>(R.id.btn_rest)
        val btnmul = findViewById<Button>(R.id.btn_mul)
        val btndiv = findViewById<Button>(R.id.btn_div)
        val etnum1 = findViewById<EditText>(R.id.et_num1)
        val etnum2 = findViewById<EditText>(R.id.et_num2)
        val tvresult = findViewById<TextView>(R.id.tv_result)

        btnsum.setOnClickListener{tvresult.text = (etnum1.text.toString().toInt() + etnum2.text.toString().toInt()).toString()}
        btnrest.setOnClickListener{tvresult.text = (etnum1.text.toString().toInt() - etnum2.text.toString().toInt()).toString()}
        btnmul.setOnClickListener{tvresult.text = (etnum1.text.toString().toInt() * etnum2.text.toString().toInt()).toString()}
        btndiv.setOnClickListener{tvresult.text = (etnum1.text.toString().toInt() / etnum2.text.toString().toInt()).toString()}
        println("pipo")

    }

}