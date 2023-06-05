package com.ankur.viewmodel

import androidx.lifecycle.ViewModel

class mainActivityViewModel:ViewModel() {

    var count=0
    fun updateCount()
    {
        count++

    }

}