package com.example.popularlibraries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.popularlibraries.databinding.ActivityMainBinding
import com.example.popularlibraries.model.CountersModel
import com.example.popularlibraries.presenter.MainPresenter
import com.example.popularlibraries.view.MainView

class MainActivity : AppCompatActivity(), MainView {

    private var vb: ActivityMainBinding? = null
    private val presenter = MainPresenter(this, model = CountersModel())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)

        vb?.btnCounter1?.setOnClickListener { presenter.counterClickFirst() }
        vb?.btnCounter2?.setOnClickListener { presenter.counterClickSecond() }
        vb?.btnCounter3?.setOnClickListener { presenter.counterClickThird() }
    }

    override fun setButtonTextFirst(text: Int) {
        vb?.btnCounter1?.text = text.toString()
    }

    override fun setButtonTextSecond(text: Int) {
        vb?.btnCounter2?.text = text.toString()
    }

    override fun setButtonTextThird(text: Int) {
        vb?.btnCounter3?.text = text.toString()
    }
}