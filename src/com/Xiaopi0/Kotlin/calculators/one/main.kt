package com.Xiaopi0.Kotlin.calculators.one

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var loop = true
    while (loop == true) {
        println("Write how many numbers you want to use or ? to see list of commands")
        val input_1 = scanner.next()
        //Commands
        if (input_1 == "?") {
            println("List of commands:")
            println()
            println("1. ? = view this list.")
            println("2. quit = quits the application.")
            println()
        } else if (input_1 == "quit") {
            loop = false
        }else {
            val input_11 = input_1.toInt()
            val numbers = DoubleArray(input_11)
            var index = 0
            var num = 1
            for (i in 0..input_11 - 1) {
                println(if (num == 1) {"Write mumber $num(decimals with ',' not '.')"}else{"Write mumber $num"})
                numbers[index] = scanner.nextDouble()
                index += 1
                num +=1
            }
        }

    }
}