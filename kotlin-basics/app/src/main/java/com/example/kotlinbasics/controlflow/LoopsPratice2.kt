package com.example.kotlinbasics.controlflow

fun main () {

    // Write a program that simulates the Fizz buzz game. Your task is to print number from 1 to 100 incrementally,
    // replacing any number divisible by three with the word "fizz", and number divisible by five with the word "buzz".
    // Any number divisible by both 3 and 5 must be replaced with the word "fizzbuzz"


    for (numbers in 1..100) {
        val fizzbuzz = when {
            numbers % 15 == 0 -> "fizzbizz"
            numbers % 3 == 0 -> "fizz"
            numbers % 5 == 0 -> "buzz"

            else -> numbers
        }
        println(fizzbuzz)
    }
}