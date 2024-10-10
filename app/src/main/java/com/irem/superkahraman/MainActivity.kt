package com.irem.superkahraman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.irem.superkahraman.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var superKahramanListesi : ArrayList<SuperKahraman>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val superman = SuperKahraman("Süperman","gazeteci",R.drawable.superman)
        val batman = SuperKahraman("Batman","patron",R.drawable.batman)
        val wonderWomen = SuperKahraman("Wonder Women","ordu hemşiresi",R.drawable.wonderwomen)
        val scarlettWitch = SuperKahraman("Scarlet Witch","cadı",R.drawable.scarlettwitch)
        val blackWidov = SuperKahraman("Black Widov","dövüş sanatları ustası",R.drawable.blackwidov)

        superKahramanListesi = arrayListOf(superman,batman,wonderWomen,scarlettWitch,blackWidov)
    }
}