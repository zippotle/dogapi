package com.yah.dog_api

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.net.toUri
import coil.load
import com.bumptech.glide.Glide
import com.yah.dog_api.api.ApiRequest
import com.yah.dog_api.api.BASE_URL
import com.yah.dog_api.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    private val viewModel: DogViewModel by viewModels()

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


//Keeps app in light mode
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        //anytime the response changes we will:
        viewModel.response.observe(this, {
            binding.ivRandomDog.load(
                it.url.toUri().buildUpon().scheme("https").build()

            )
        })

        binding.button.setOnClickListener{
            viewModel.getRandomDog()
        }
    }

}


//Coroutines
//