package com.example.week07.utilities

import com.example.week07.Data.FakeData
import com.example.week07.Data.QuoteRepository
import com.example.week07.quotes.QuoteViewModelFactory

object InjectorUtils {
    fun provideQuotesViewModelFactory(): QuoteViewModelFactory {

        val quoteRepository = QuoteRepository.getInstance(FakeData.getInstance().quoteDao)
        return QuoteViewModelFactory(quoteRepository)
    }
}