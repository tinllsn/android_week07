package com.example.week07.quotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.week07.Data.Quote
import com.example.week07.R
import com.example.week07.utilities.InjectorUtils

class QuoteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quotes)
        initializeUI()
    }

    private fun initializeUI(){
        val factory = InjectorUtils.provideQuotesViewModelFactory()
        val viewModel = ViewModelProvider(this, factory).get(QuoteViewModel:: class.java)
        viewModel.getQuotes().observe(this,  { quotes ->
            val stringBuilder = StringBuilder()
            quotes.forEach{quote ->
                stringBuilder.append("$quote\n\n")}
            val textView_quotes= findViewById<TextView>(R.id.textView2)
            textView_quotes.text = stringBuilder.toString()
        })
        val buttonaddQuote = findViewById<Button>(R.id.buttonaddQuote)
        val editText =  findViewById<EditText>(R.id.editTextText)
        val editTextauthor =  findViewById<EditText>(R.id.editTextText2)

        buttonaddQuote.setOnClickListener{
            val quote = Quote(editText.text.toString(),editTextauthor.text.toString())
            viewModel.addQuote(quote)
            editText.setText("")
            editTextauthor.setText("")

        }
    }
}