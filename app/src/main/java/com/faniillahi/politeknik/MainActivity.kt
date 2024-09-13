package com.faniillahi.politeknik

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnManajemenInformatika: Button = findViewById(R.id.btn_manajemen_informatika)
        btnManajemenInformatika.setOnClickListener {
            // Navigasi ke halaman kedua
            val intent = Intent(this, MiActivity::class.java)
            intent.putExtra("page", "Manajemen Informatika")
            startActivity(intent)
        }

        // Tombol Teknik Komputer
        val btnTeknikKomputer: Button = findViewById(R.id.btn_teknik_komputer)
        btnTeknikKomputer.setOnClickListener {
            // Navigasi ke halaman kedua
            val intent = Intent(this, TeknikKomputerActivity::class.java)
            intent.putExtra("page", "Teknik Komputer")
            startActivity(intent)
        }

        // Tombol Galeri Photo
        val btnGaleriPhoto: Button = findViewById(R.id.btn_galeri_photo)
        btnGaleriPhoto.setOnClickListener {
            // Navigasi ke halaman kedua
            val intent = Intent(this, GaleriActivity::class.java)
            intent.putExtra("page", "Galeri Photo")
            startActivity(intent)
        }
    }
}