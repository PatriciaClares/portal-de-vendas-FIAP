package com.example.portaisdevenda

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sobre.*


class Sobre : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre)

        var dadosPersistidos = getSharedPreferences("dados", Context.MODE_PRIVATE )
        var dados = intent.getStringExtra("dados")
        txt.setText(dados)
        btEstatistica.setOnClickListener {
            dadosPersistidos.edit().clear().apply()
            txt.setText(dadosPersistidos.getString("dados", dados))
        }
    }
}
