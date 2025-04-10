package com.example.kotlinbasics.controlflow

fun main () {

    // Using a when expression, update the following program so that it prints the corresponding
    // actions when you input the names of game console buttons

    // How i did
    val button = "A"

    val action = when (button) {
        "A" -> "Yes"
        "B" -> "No"
        "X" -> "Menu"
        "Y" -> "Nothing"
        else -> "There is no such button"
    }
    println(action)

    // Course example

        val button1 = "A"

        println(
            when (button1) {
                "A" -> "Yes"
                "B" -> "No"
                "X" -> "Menu"
                "Y" -> "Nothing"
                else -> "There is no such button"
            }
        )

}