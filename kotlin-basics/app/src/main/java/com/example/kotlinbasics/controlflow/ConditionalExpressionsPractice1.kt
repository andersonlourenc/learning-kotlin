package com.example.kotlinbasics.controlflow

import kotlin.random.Random

fun main () {
    // Create a simple game where you win is throwing two dice results in the same number.
    // Use "if" to print "You win :)" if the dice match or "You lose :(" otherwise

    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)

    if (firstResult == secondResult) {
        println("You win :)")
    } else {
        println("You lose :(")
    }
}