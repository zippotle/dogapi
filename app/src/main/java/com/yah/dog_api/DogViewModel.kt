package com.yah.dog_api

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yah.dog_api.api.ApiData
import com.yah.dog_api.api.DogApi
import kotlinx.coroutines.launch

class DogViewModel: ViewModel (){
    private val _response = MutableLiveData<ApiData>()
    val response: LiveData<ApiData> = _response

    init {
        getRandomDog()
    }

    fun getRandomDog() {
        //Make network call
        viewModelScope.launch {
            //Save response as live data

            try {
                _response.value = DogApi.retrofitService.getRandomDog()
            } catch (e:Exception) {
                Log.e("DogViewModel", "${e.message}")
            }
        }

    }

}