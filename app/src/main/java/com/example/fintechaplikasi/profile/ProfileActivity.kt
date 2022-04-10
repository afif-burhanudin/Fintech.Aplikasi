package com.example.fintechaplikasi.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.fintechaplikasi.R

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        title = "Menu Profile"
        val nama = findViewById<TextView>(R.id.tvnama)
        val nim = findViewById<TextView>(R.id.tvnim)
        val mail = findViewById<TextView>(R.id.tvemail)
        val nope = findViewById<TextView>(R.id.tvnohp)
        val jk = findViewById<TextView>(R.id.tvjenkel)
        val prodi = findViewById<TextView>(R.id.tvprodi)
        val org = findViewById<TextView>(R.id.tvorganisasi)
        val status = findViewById<TextView>(R.id.tvstatus)

        val bukaBundle = intent.extras
        if (bukaBundle != null){
            nama.setText(bukaBundle.getString("nama"))
            nim.setText(bukaBundle.getString("nim"))
            mail.setText(bukaBundle.getString("email"))
            nope.setText(bukaBundle.getString("nohp"))
            jk.setText(bukaBundle.getString("jenkel"))
            prodi.setText(bukaBundle.getString("prodi"))
            org.setText(bukaBundle.getString("organisasi"))
            status.setText(bukaBundle.getString("status"))
        }
    }
}