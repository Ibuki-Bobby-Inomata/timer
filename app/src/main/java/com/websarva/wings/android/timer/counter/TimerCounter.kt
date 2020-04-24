package com.websarva.wings.android.timer.counter

import android.os.Handler

class TimerCounter(private val sendTimerText: SendTimerText) {
    var cnter=0
    val timer= Handler()

    val starter=object : Runnable{
        override fun run() {
            cnter++
            var timerText: String=cnter.toString()

            sendTimerText.throwText(timerText)

            if(cnter<50){
                timer.postDelayed(this,100)
            }
        }
    }

    fun startTimer(){
        timer.post(starter)
    }

    fun resetTimer(){

    }

    fun updateCountText(){
    }

    interface SendTimerText{
        fun throwText(timerText: String)
    }
}


