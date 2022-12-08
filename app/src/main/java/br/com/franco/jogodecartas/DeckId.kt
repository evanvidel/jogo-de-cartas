package br.com.franco.jogodecartas

data class DeckId(
   val success: Boolean,
   val deck_id: String?,
   val remaining: Int?,
   val shuffled: Boolean
)