package com.example.sozluk
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sozluk.Kelimeler
import com.example.sozluk.R
import kotlinx.android.synthetic.main.activity_detay_.*
import kotlinx.android.synthetic.main.card_tasarim.*

class detay_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detay_)

        val kelime = intent.getSerializableExtra("nesne") as Kelimeler

        textviewingilizce.text = kelime.ingilizce
        textViewturkce.text = kelime.turkce
    }
}

