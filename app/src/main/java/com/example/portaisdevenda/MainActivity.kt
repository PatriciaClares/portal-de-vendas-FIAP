package com.example.portaisdevenda

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dadosPersistidos = getSharedPreferences("dados", Context.MODE_PRIVATE )

        var dadosMercadoLivre = dadosPersistidos.getInt("mercadoLivre",0)
        var dadosAmazon = dadosPersistidos.getInt("amazon",0)
        var dadosEbay = dadosPersistidos.getInt("ebay",0)
        var dadosKabum = dadosPersistidos.getInt("kabum",0)
        var dadosSubmarino = dadosPersistidos.getInt("submarino",0)
        var dadosAliexpress = dadosPersistidos.getInt("aliexpress",0)

        mercadolivre.setOnClickListener {

            dadosPersistidos.edit().putInt("mercadoLivre", dadosMercadoLivre+1).apply()
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.mercadolivre.com.br/")
            startActivity(intent)

        }

        amazon.setOnClickListener {

            dadosPersistidos.edit().putInt("amazon", dadosAmazon+1).apply()
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.amazon.com.br/")
            startActivity(intent)

        }

        ebay.setOnClickListener {

            dadosPersistidos.edit().putInt("ebay", dadosEbay+1).apply()
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.ebay.com/")
            startActivity(intent)

        }

        kabum.setOnClickListener {

            dadosPersistidos.edit().putInt("kabum", dadosKabum+1).apply()
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.kabum.com.br/")
            startActivity(intent)

        }

        submarino.setOnClickListener {

            dadosPersistidos.edit().putInt("submarino", dadosSubmarino+1).apply()
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.submarino.com.br/")
            startActivity(intent)

        }

        aliexpress.setOnClickListener {

            dadosPersistidos.edit().putInt("aliexpress", dadosAliexpress+1).apply()
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://pt.aliexpress.com/")
            startActivity(intent)

        }

        btSobre.setOnClickListener{
            var intent = Intent(this, Sobre::class.java)
            intent.putExtra("dados",
                "Mercado Livre: " + dadosMercadoLivre + "\n\n"
                        + "Ebay: " + dadosEbay + "\n\n"
                        + "Kabum: " + dadosKabum + "\n\n"
                        + "Aliexpress: " + dadosAliexpress + "\n\n"
                        + "Amazon: " + dadosAmazon + "\n\n"
                        + "Submarino: " + dadosSubmarino)
            startActivity(intent)

        }
    }
}
