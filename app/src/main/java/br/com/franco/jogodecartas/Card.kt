package br.com.franco.jogodecartas

data class Card(
    val code: String,
    val image: String,
    val images: Images,
    val suit: String,
    val value: String
)