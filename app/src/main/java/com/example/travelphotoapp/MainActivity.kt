package com.example.travelphotoapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {


    private var currentImage = 0
    lateinit var image : ImageView //initialise later

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next = findViewById<ImageButton>(R.id.btnNext)
        val prev = findViewById<ImageButton>(R.id.btnPrev)

        next.setOnClickListener{
            // next image
            var idCurrentImageString = "imageView$currentImage" // string id of image

            // convert id in string format to integer format
            var idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString,"id",packageName)

            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentImage = (35+currentImage+1)%35  //after 34th pic, it returns to 0
            var idImageToShowString = "imageView$currentImage"    //image to show
            var idImageToShowInt = this.resources.getIdentifier(idImageToShowString,"id",packageName)

            image = findViewById(idImageToShowInt)
            image.alpha = 1f


        }

        prev.setOnClickListener {
                //prev image
                var idCurrentImageString = "imageView$currentImage" // string id of image

                var idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)

                image = findViewById(idCurrentImageInt)
                image.alpha = 0f

                currentImage = (35+currentImage-1) %35
                var idImageToShowString = "imageView$currentImage"
                var idImageToShowInt =
                    this.resources.getIdentifier(idImageToShowString, "id", packageName)

                image = findViewById(idImageToShowInt)
                image.alpha = 1f
            }
        }


    }
