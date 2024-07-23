package com.example.week07.Data

data class Quote(val qouteTetx: String, val author : String) {
    override fun toString(): String {
        return "$qouteTetx - $author"
    }
}
