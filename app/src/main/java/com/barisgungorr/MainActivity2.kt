package com.barisgungorr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.barisgungorr.polatcatch.R
import com.barisgungorr.polatcatch.databinding.ActivityMain2Binding
import com.barisgungorr.polatcatch.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    var score = 0 // bu skora başka fonksiyonlardan da ulaşmak isteyebilirim

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
    fun increaseScore(view: View) {
    score = score + 1
        binding.textViewScore.text = "Score: ${score}"
    }
}