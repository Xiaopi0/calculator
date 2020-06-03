# Calculator Project
This is the website for my calculator project in kotlin.
## Snapshot of source code(It's being almost totally rewritten).
```markdown
package com.Xiaopi0.Kotlin.calculators.one

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var loop = true
    while (loop == true) {
        println("Write two numbers to do things with and which operator you want to use. \n? to see list of commands")
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
            val operator_1 = scanner.next()
            if (operator_1 == "+") {
                println(output_1 + output_2)
                println()
            }else if (operator_1 == "-") {
                println(output_1 - output_2)
                println()
            }else if (operator_1 == "*" || operator_1 == "x") {
                println(output_1 * output_2)
                println()
            }else if (operator_1 == "/") {
                println(output_1 / output_2)
                println()
            }else if (operator_1 == "%") {
                println(output_1 % output_2)
                println()
            }else {
                println("Error: invalid operator.")
            }
        }

    }
}
```
