package com.example.bmsproject.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.bmsproject.remote.LoveModel
import com.example.bmsproject.repository.Repository

class LoveViewModel : ViewModel() {

    private val repository = Repository()

    fun getLiveLove(firstName: String, secondName: String): LiveData<LoveModel> {
        return repository.getLove(firstName, secondName)
    }
}