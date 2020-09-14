package com.example.queenb

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.webkit.WebView
import android.widget.EditText

class FinalHTML : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_h_t_m_l)
    }

    fun finish(view: View) {
        //loud web view
        var webView = findViewById<WebView>(R.id.webView)
        var HTMLtest =  findViewById<EditText>(R.id.code).text.toString()
        webView.loadDataWithBaseURL(null,HTMLtest,"text/html","utf-8",null)
        //close the keyboard
        val inputManager:InputMethodManager =getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputManager.hideSoftInputFromWindow(currentFocus?.windowToken, InputMethodManager.SHOW_FORCED)
    }
    fun nextPage(view: View) {
        val intent = Intent(this, Ex4::class.java)
        startActivity(intent)
    }
}