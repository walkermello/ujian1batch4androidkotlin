package com.juaracoding.ujian1batch4androidkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        findViewById<TextView>(R.id.txtNama).text="Nama : ......."
        findViewById<TextView>(R.id.txtEmail).text="Email : ........."
    }
}