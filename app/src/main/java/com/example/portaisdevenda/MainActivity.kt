package com.example.portaisdevenda

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mercadolivre.setOnClickListener {

            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.mercadolivre.com.br/")
            startActivity(intent)
        }

        amazon.setOnClickListener {

            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.amazon.com.br/")
            startActivity(intent)
        }

        ebay.setOnClickListener {

            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.ebay.com/")
            startActivity(intent)
        }

        kabum.setOnClickListener {

            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.kabum.com.br/")
            startActivity(intent)
        }

        wish.setOnClickListener {

            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://www.wish.com/search/trending?from_ad=goog_kw_search&campaign_id=1709509819&gclid=Cj0KCQiAwP3yBRCkARIsAABGiPrmtVjz4psR9kzIhBhMVCYjaxessbEyPnGJhvtLaTJz3zXWBVe_4GsaAi6WEALw_wcB&hide_login_modal=true")
            startActivity(intent)
        }

        aliexpress.setOnClickListener {

            var intent = Intent(this, WebView::class.java)
            intent.putExtra("url", "https://pt.aliexpress.com/?src=google&albch=fbrnd&acnt=304-410-9721&isdl=y&aff_short_key=UneMJZVf&albcp=2038891400&albag=72803962300&slnk=&trgt=kwd-14802285088&plac=&crea=367675400387&netw=g&device=c&mtctp=e&memo1=&albbt=Google_7_fbrnd&aff_platform=google&albagn=888888&gclid=Cj0KCQiAwP3yBRCkARIsAABGiPpPD9krtTWMCqZTaY0KHZMY3aUo26XP3oAFbE3N5U1vimb4LaBRxN8aAh7OEALw_wcB")
            startActivity(intent)
        }
    }
}
