package tv.hernet.androidapp.hernettv

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val url = "http://hernettv.infinitehorizonbd.com/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the web view settings instance
        val settings = webView.settings

        // Enable java script in web view
        settings.javaScriptEnabled = true

        webView.loadUrl(url)
    }
}
