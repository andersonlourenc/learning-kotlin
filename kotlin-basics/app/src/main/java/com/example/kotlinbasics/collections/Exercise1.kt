package com.example.kotlinbasics.collections

fun main () {
    // You have a list of "green" numbers and a list of "red" number.
    // Complete the code to print how many numbers there are in total.

    val greenNumbers = listOf(1,4,23)
    val redNumbers = listOf(17,2)

    println(greenNumbers.count() + redNumbers.count()) // 5
        // or
    val totalCount = greenNumbers.count() + redNumbers.count()
    println(totalCount)

}