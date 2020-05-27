package com.Xiaopi0.calculatorkotlinone

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var loop = true
    while (loop == true) {
        println("Write two numbers to be added. -0 to quit(it doesn't matter where)")
        //Create and initialize the variables for the numbers you put in
        val input_1 = scanner.nextInt()
        val input_2 = scanner.nextInt()
        if (input_1 == -0 || input_2 == -0) {
            loop = false
        }else {
            println(input_1 + input_2)
            println()
        }
    }
}