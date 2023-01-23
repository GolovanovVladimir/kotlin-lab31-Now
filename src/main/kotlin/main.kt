package ru.netology

import kotlin.concurrent.timer

fun main() {
    var timeInNetwork =201
    println(agoToText(timeInNetwork))

}

    fun agoToText(timeForAnalizing: Int = 0):String {
        return  when (timeForAnalizing) {
            in 0..60
            -> secondsCalculate(timeForAnalizing)
            in 61..3600
            -> minutsCalculate(timeForAnalizing/60)
            else
            -> twentyFourHours(timeForAnalizing/3600)
        }
    }

    fun secondsCalculate(timeSeconds :Int =0): String {
        var seconds = when ((timeSeconds).toString().last()) {
            '1' -> timeSeconds.toString() + " секунду"
            '2', '3', '4' -> timeSeconds.toString() + " секунды"
            '5', '6', '7', '8', '9', '0' -> timeSeconds.toString() + " секунд"
            else -> "XX"
        }
        return seconds+" назад"
    }

    fun minutsCalculate(timeSeconds :Int =0): String {
        var minutes = when (timeSeconds.toString().last()) {
            '1'-> timeSeconds.toString()+" минуту"
            '2','3','4'-> timeSeconds.toString()+" минуты"
            '5','6','7','8','9','0'-> timeSeconds.toString()+" минут"
            else ->"XX"
        }
        return minutes+" назад"

    }

    fun twentyFourHours(timeSeconds :Int =0): String {
        return when (timeSeconds.toString().last()) {
            '1'-> " вчера"
            '2'-> " позавчера"
            else-> " давно"
                    }
    }
