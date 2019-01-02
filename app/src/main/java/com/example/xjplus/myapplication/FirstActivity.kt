package com.example.xjplus.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)

        var button = findViewById<View>(R.id.button_1)
        button.setOnClickListener {
            Toast.makeText(this, "哈哈哈, 点击了", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (null != item && R.id.menu_01 == item.itemId) {
            Toast.makeText(this, "哈哈哈, 点击了菜单" + item.itemId, Toast.LENGTH_SHORT).show()
            val intent: Intent = Intent(this, SecondActivity::class.java)
//            val intent = Intent("com.example.xjplus.myapplication.SecondActivity")
            startActivity(intent)
        }
        if (null != item && R.id.menu_02 == item.itemId) {
            Toast.makeText(this, "哈哈哈, 点击了菜单" + item.itemId, Toast.LENGTH_SHORT).show()
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}
