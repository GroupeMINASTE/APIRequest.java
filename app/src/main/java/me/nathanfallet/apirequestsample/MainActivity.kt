package me.nathanfallet.apirequestsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import me.nathanfallet.apirequest.decoder.JSONAPIDecoder
import me.nathanfallet.apirequest.encoder.JSONAPIEncoder
import me.nathanfallet.apirequest.request.APIConfiguration
import me.nathanfallet.apirequest.request.APIRequest

class MainActivity : AppCompatActivity() {

    private lateinit var statusText: TextView
    private lateinit var mainText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        statusText = findViewById(R.id.statusText)
        mainText = findViewById(R.id.mainText)

        // Create configuration
        val config = APIConfiguration("jsonplaceholder.typicode.com").also {
            // Optional personalization
            it.headers = {
                // Add custom headers (eg: an access token)
                HashMap()
            }
            it.encoder = JSONAPIEncoder() // Set a custom APIEncoder
            it.decoder = JSONAPIDecoder() // Set a custom APIDecoder
        }

        // Create a request
        APIRequest("GET", "/comments", config)
            .with("postId", 1)
            .execute { result, status ->
                mainText.text = result.toString()
                statusText.text = status.toString()
            }
    }

}