package com.example.plus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Math

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Double.isWhole(): Boolean {
        return this % 1 == 0.0
    }

    fun onClick(v: View) {
        val etA = findViewById<EditText>(R.id.numA)
        val etB = findViewById<EditText>(R.id.numB)
        val tvSum = findViewById<TextView>(R.id.sum)

        val strA = etA.text.toString()
        val strB = etB.text.toString()

        if (strA.isEmpty() || strB.isEmpty()) {
            Toast.makeText(this, "Поля не должны быть пустыми", Toast.LENGTH_SHORT).show()
            return
        }

        val sum = Math.round((strA.toDouble() + strB.toDouble()) * 10000.0) / 10000.0
        val strSum = if (sum.isWhole()) sum.toInt().toString() else sum.toString()
        tvSum.text = strSum
    }

}