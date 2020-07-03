package com.xqhy.collapselayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn1).setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, DemoActivity1::class.java))
        })

        findViewById<Button>(R.id.btn2).setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, DemoActivity2::class.java))
        })

        findViewById<Button>(R.id.btn3).setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, DemoActivity3::class.java))
        })

        findViewById<Button>(R.id.btn4).setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, DemoActivity4::class.java))
        })

        findViewById<Button>(R.id.btn5).setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, DemoActivity5::class.java))
        })

        findViewById<Button>(R.id.btn6).setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, DemoActivity6::class.java))
        })

        findViewById<Button>(R.id.btn7).setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, DemoActivity7::class.java))
        })

        findViewById<Button>(R.id.btn8).setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, DemoActivity8::class.java))
        })

        findViewById<Button>(R.id.btn9).setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, DemoActivity9::class.java))
        })

        findViewById<Button>(R.id.btn10).setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, DemoActivity10::class.java))
        })

        findViewById<Button>(R.id.btn11).setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, DemoActivity11::class.java))
        })

        findViewById<Button>(R.id.btn12).setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, DemoActivity12::class.java))
        })
    }
}