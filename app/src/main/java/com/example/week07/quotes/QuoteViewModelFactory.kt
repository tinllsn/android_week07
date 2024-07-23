package com.example.week07.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.week07.Data.QuoteRepository

class QuoteViewModelFactory(private val quoteRepository: QuoteRepository): ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return QuoteViewModel(quoteRepository) as T
    }

}