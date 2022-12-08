package br.com.franco.jogodecartas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import br.com.franco.jogodecartas.databinding.ActivityMainBinding
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory
import javax.security.auth.login.LoginException

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val service = RetrofitClient.createService(ApiCard::class.java)
        val call: Call<List<DeckId>> = service.list()
        call.enqueue(object: Callback<List<DeckId>>{
            override fun onResponse(
                call: Call<List<DeckId>>, response: Response<List<DeckId>>) {

                val list = response.body()
            }

            override fun onFailure(call: Call<List<DeckId>>, t: Throwable) {
                Log.i("TAG", "onResponse: erro ao conectar")
            }

        })

    }
}

//https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1
/*{
    "success": true,
    "deck_id": "3p40paa87x90",
    "shuffled": true,
    "remaining": 52
}*/