package com.example.xjplus.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)

        var button = findViewById<View>(R.id.button_2)
        button.setOnClickListener {
            Toast.makeText(this, "哈哈哈, 点击了, 要关闭", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
