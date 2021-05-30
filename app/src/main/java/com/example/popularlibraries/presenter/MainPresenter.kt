package com.example.popularlibraries.presenter

import com.example.popularlibraries.model.CountersModel
import com.example.popularlibraries.view.MainView

class MainPresenter(private val view: MainView, private val model: CountersModel) {

    fun counterClickFirst() {
        val counter = model.getCurrentFirst()
        view.setButtonTextFirst(counter)
    }

    fun counterClickSecond() {
        val counter = model.getCurrentSecond()
        view.setButtonTextSecond(counter)
    }

    fun counterClickThird() {
        val counter = model.getCurrentThird()
        view.setButtonTextThird(counter)
    }
}