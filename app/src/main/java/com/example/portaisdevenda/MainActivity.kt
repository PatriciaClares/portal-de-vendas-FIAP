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
        var dadosWish = dadosPersistidos.getInt("dadosWish",0)
        var dadosAliexpress = dadosPersistidos.getInt("aliexpress",0)

        mercadolivre.setOnClickListener {

            dadosPersistidos.edit().putInt("mercadoLivre", dadosMercadoLivre+1)
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.mercadolivre.com.br/")
            startActivity(intent)

        }

        amazon.setOnClickListener {

            dadosPersistidos.edit().putInt("amazon", dadosAmazon+1)
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.amazon.com.br/")
            startActivity(intent)

        }

        ebay.setOnClickListener {

            dadosPersistidos.edit().putInt("ebay", dadosEbay+1)
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.ebay.com/")
            startActivity(intent)

        }

        kabum.setOnClickListener {

            dadosPersistidos.edit().putInt("kabum", dadosKabum+1)
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.kabum.com.br/")
            startActivity(intent)

        }

        wish.setOnClickListener {

            dadosPersistidos.edit().putInt("wish", dadosWish+1)
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.wish.com/search/trending?from_ad=goog_kw_search&campaign_id=1709509819&gclid=Cj0KCQiAwP3yBRCkARIsAABGiPrmtVjz4psR9kzIhBhMVCYjaxessbEyPnGJhvtLaTJz3zXWBVe_4GsaAi6WEALw_wcB&hide_login_modal=true")
            startActivity(intent)

        }

        aliexpress.setOnClickListener {

            dadosPersistidos.edit().putInt("aliexpress", dadosAliexpress+1)
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://pt.aliexpress.com/?src=google&albch=fbrnd&acnt=304-410-9721&isdl=y&aff_short_key=UneMJZVf&albcp=2038891400&albag=72803962300&slnk=&trgt=kwd-14802285088&plac=&crea=367675400387&netw=g&device=c&mtctp=e&memo1=&albbt=Google_7_fbrnd&aff_platform=google&albagn=888888&gclid=Cj0KCQiAwP3yBRCkARIsAABGiPpPD9krtTWMCqZTaY0KHZMY3aUo26XP3oAFbE3N5U1vimb4LaBRxN8aAh7OEALw_wcB")
            startActivity(intent)

        }

        btSobre.setOnClickListener{
            var intent = Intent(this, Sobre::class.java)
            intent.putExtra("dadosMercadoLivre", dadosMercadoLivre)
            intent.putExtra("dadosEbay", dadosEbay)
            intent.putExtra("dadosKabum", dadosKabum)
            intent.putExtra("dadosAliexpress", dadosAliexpress)
            intent.putExtra("dadosAmazon", dadosAmazon)
            intent.putExtra("dadosWish", dadosWish)
            startActivity(intent)
        }
    }
}
