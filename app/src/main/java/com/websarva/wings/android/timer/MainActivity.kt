package com.websarva.wings.android.timer

//import com.websarva.wings.android.timer.app.TimerApp

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.websarva.wings.android.timer.app.TimerApp
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), TimerApp.Giver {
    override fun throwtimer(timerText: String) {
        tvTimer.text = timerText
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val app = TimerApp(this.applicationContext, this)
        btStart.setOnClickListener {app.start()}
        btReset.setOnClickListener {app.reset()}
    }
}
