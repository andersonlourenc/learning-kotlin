package com.example.kotlinbasics.collections

fun main (){

    // Define a map that relates integer number from 1 to 3 to their corresponding spelling.
    // Use this map to spell the given number.

    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}