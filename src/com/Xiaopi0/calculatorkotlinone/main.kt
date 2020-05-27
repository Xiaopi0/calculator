package com.Xiaopi0.calculatorkotlinone

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var loop = true
    while (loop == true) {
        println("Write two numbers to be added.")
        //Create and initialize the variables for the numbers you put in
        val input_1 = scanner.nextInt()
        val input_2 = scanner.nextInt()

        println(input_1 + input_2)
        println()

        println("If you want to quit press: 0. If you want to continue press: 1")
        val checkIfQuitOrNot = scanner.nextInt()

        if (checkIfQuitOrNot == 1) {
            loop = true
        }else if (checkIfQuitOrNot == 0) {
            loop = false
        }
    }
}