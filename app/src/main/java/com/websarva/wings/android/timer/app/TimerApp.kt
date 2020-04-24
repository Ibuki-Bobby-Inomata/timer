package com.websarva.wings.android.timer.app

import android.content.Context
import com.websarva.wings.android.timer.counter.TimerCounter

class TimerApp(applicationContext: Context, private val giver: Giver): TimerCounter.SendTimerText{
    override fun throwText(timerText: String) {
        giver.throwtimer(timerText)
    }

    private val timerCounter = TimerCounter(this)

    fun start() {
        timerCounter.startTimer()
    }

    fun reset() {
    }

    interface Giver {
        fun throwtimer(timerText: String)
    }
}