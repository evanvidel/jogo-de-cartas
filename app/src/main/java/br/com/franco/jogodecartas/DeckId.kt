package br.com.franco.jogodecartas

data class DeckId(
    val cards: List<Card>,
    val deck_id: String,
    val remaining: Int,
    val success: Boolean
)