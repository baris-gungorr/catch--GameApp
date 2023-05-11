package com.barisgungorr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageView
import com.barisgungorr.polatcatch.R
import com.barisgungorr.polatcatch.databinding.ActivityMain2Binding
import com.barisgungorr.polatcatch.databinding.ActivityMainBinding
import java.util.Random

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    var score = 0 // bu skora başka fonksiyonlardan da ulaşmak isteyebilirim
    var imageArray = ArrayList<ImageView>() // ImageViewlerimi eklemek için bir arrayList oluşturduk
    var runnable = Runnable {}
    var handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        imageArray.add(binding.imageView)
        imageArray.add(binding.imageView2)
        imageArray.add(binding.imageView3)
        imageArray.add(binding.imageView4)
        imageArray.add(binding.imageView5)
        imageArray.add(binding.imageView6)
        imageArray.add(binding.imageView7)
        imageArray.add(binding.imageView8)
        imageArray.add(binding.imageView9)
        hideImages()

    }
    fun increaseScore(view: View) {  // we added our func that will increase the every time we click on the photo
    score = score + 1
        binding.textViewScore.text = "Score: ${score}"
    }
    fun hideImages(){
        runnable = object : Runnable {  // bu objenin içinde yazdıklarımızı devamlı çalıştırabiliyoruz
            override fun run() {
                for(image in imageArray) {
                    image.visibility = View.INVISIBLE  // görselleri kaybettik
                }
                val random = Random()
                val randomIndex = random.nextInt(9) // 0'dan 9 a kadar random bir ımageVıew açılacak uygulamayı her açtığımızda
                imageArray[randomIndex].visibility = View.VISIBLE
                handler.postDelayed(runnable,500)


            }


        }
            handler.post(runnable)



    }

}