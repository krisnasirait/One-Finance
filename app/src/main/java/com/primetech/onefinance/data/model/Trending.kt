package com.primetech.onefinance.data.model

data class Trending(
    val symbols : Int?,
    val coinName : String?,
    val acronym : String?,
    val price : String?,
    val change1Hour : String?,
    val change24Hour : String?,
    val change7Days : String?,
    val marketCap : String?,
    val volume : String?,
    val amountCoin: String?,
    val amountInUsd: String?
)
