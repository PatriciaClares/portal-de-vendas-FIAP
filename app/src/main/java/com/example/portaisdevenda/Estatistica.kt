package com.example.portaisdevenda

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sobre.*


class Estatistica : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre)

        var dadosPersistidos = getSharedPreferences("dados", Context.MODE_PRIVATE )
        txt.text = "Mercado livre: ${dadosPersistidos.getInt("mercadoLivre", 0)}\n\n" +
                "Amazon: ${dadosPersistidos.getInt("amazon", 0)}\n\n" +
                "Ebay: ${dadosPersistidos.getInt("ebay", 0)}\n\n" +
                "Kabum: ${dadosPersistidos.getInt("kabum", 0)}\n\n" +
                "Submarino: ${dadosPersistidos.getInt("submarino", 0)}\n\n" +
                "Aliexpress: ${dadosPersistidos.getInt("aliexpress",0)}"

        btEstatistica.setOnClickListener {
            dadosPersistidos.edit().clear().apply()
            recreate()
        }
    }
}
