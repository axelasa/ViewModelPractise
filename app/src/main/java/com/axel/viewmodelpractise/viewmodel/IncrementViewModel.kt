package com.axel.viewmodelpractise.viewmodel

import androidx.lifecycle.ViewModel

class IncrementViewModel :ViewModel() {

    var counter = 0

    fun add(){
        counter++
    }
    fun subtract(){
        counter --
    }

}