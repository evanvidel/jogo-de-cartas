package br.com.franco.jogodecartas

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiCard {
    @GET("new/")
    fun list(): Call<List<DeckId>>
}

