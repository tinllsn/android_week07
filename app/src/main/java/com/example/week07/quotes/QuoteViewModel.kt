package com.example.week07.quotes

import androidx.lifecycle.ViewModel
import com.example.week07.Data.Quote
import com.example.week07.Data.QuoteRepository

class QuoteViewModel(private  val  quoteRepository: QuoteRepository): ViewModel() {
    fun getQuotes() = quoteRepository.getQuotes()
    fun addQuote(quote: Quote)= quoteRepository.addQuote(quote)
}