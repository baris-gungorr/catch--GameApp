package com.barisgungorr.polatcatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.barisgungorr.MainActivity2
import com.barisgungorr.polatcatch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
    fun change(view: View) {
    val intent = Intent(this@MainActivity,MainActivity2::class.java)

        startActivity(intent)
        finish()

    }
}