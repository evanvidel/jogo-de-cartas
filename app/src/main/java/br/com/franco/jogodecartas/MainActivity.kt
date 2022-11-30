package br.com.franco.jogodecartas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.franco.jogodecartas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}

//https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1
/*{
    "success": true,
    "deck_id": "3p40paa87x90",
    "shuffled": true,
    "remaining": 52
}*/