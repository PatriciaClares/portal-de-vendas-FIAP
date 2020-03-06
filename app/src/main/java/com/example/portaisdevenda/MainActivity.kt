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

        fun persistirDados(marketPlace : String){
            dadosPersistidos
                .edit()
                .putInt(marketPlace, dadosPersistidos.getInt(marketPlace,0) +1).apply()
        }

        mercadolivre.setOnClickListener {
            persistirDados("mercadoLivre")
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.mercadolivre.com.br/")
            startActivity(intent)

        }

        amazon.setOnClickListener {
            persistirDados("amazon")
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.amazon.com.br/")
            startActivity(intent)

        }

        ebay.setOnClickListener {
            persistirDados("ebay")
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.ebay.com/")
            startActivity(intent)

        }

        kabum.setOnClickListener {
            persistirDados("kabum")
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.kabum.com.br/")
            startActivity(intent)

        }

        submarino.setOnClickListener {
            persistirDados("submarino")
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.submarino.com.br/")
            startActivity(intent)

        }

        aliexpress.setOnClickListener {
            persistirDados("aliexpress")
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://pt.aliexpress.com/")
            startActivity(intent)

        }

        btSobre.setOnClickListener{
            var intent = Intent(this, Estatistica::class.java)
            startActivity(intent)

        }

    }

}
