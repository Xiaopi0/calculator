package com.Xiaopi0.calculatorkotlinone

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var loop = true
    while (loop == true) {
        println("Write two numbers to be added. ? to see list of commands")
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
        } else {
            val input_2 = scanner.next()

            val output_1 = input_1.toInt()
            val output_2 = input_2.toInt()
            println(output_1 + output_2)
            println()
        }

    }
}