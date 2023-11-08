package com.example.myappgif

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.bumptech.glide.Glide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {
//    private lateinit var imageView: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContent {
            GifImage()
        }
//        imageView = findViewById(R.id.imageview)
//        Glide.with(this).load(R.raw.icon_camera).into(imageView)
    }

    @Composable
    fun GifImage() {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        )
        {
            Image(
                painter = painterResource(id = R.drawable.icon_camera),
                contentDescription = "GIF Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(200.dp)
            )
            Text(
                text = "Hello, GIF!",
                fontSize = 24.sp,
                color = Color.Black
            )
        }
    }

//    @Preview
//    @Composable
//    fun GifImagePreview() {
//        GifImage()
//    }
}
