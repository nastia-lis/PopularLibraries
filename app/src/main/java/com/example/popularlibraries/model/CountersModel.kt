package com.example.popularlibraries.model

class CountersModel {

     var counterFirst = 0
     var counterSecond = 0
     var counterThird = 0

    fun getCurrentFirst() = ++counterFirst

    fun getCurrentSecond() = ++counterSecond

    fun getCurrentThird() = ++counterThird
}