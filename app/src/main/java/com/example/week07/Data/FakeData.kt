package com.example.week07.Data

class FakeData {

    var quoteDao = FakeQuoteDao()
        private set
    companion object {
        @Volatile private var instance: FakeData? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: FakeData().also { instance = it }
            }
    }
}