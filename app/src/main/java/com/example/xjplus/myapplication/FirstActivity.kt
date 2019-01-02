package com.example.xjplus.myapplication

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
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
            val intent: Intent = Intent("aabbccdd")
            sendBroadcast(intent)

            try {
                val intent1: Intent
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP_MR1) {
                    intent1 = Intent(Settings.ACTION_NOTIFICATION_LISTENER_SETTINGS)
                } else {
                    intent1 = Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS")
                }
                startActivity(intent)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (null != item && R.id.menu_01 == item.itemId) {
            Toast.makeText(this, "哈哈哈, 点击了菜单" + item.itemId, Toast.LENGTH_SHORT).show()
        }
        if (null != item && R.id.menu_02 == item.itemId) {
            Toast.makeText(this, "哈哈哈, 点击了菜单" + item.itemId, Toast.LENGTH_SHORT).show()
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}
