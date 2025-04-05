package com.example.kotlinbasics.helloworld

fun main () {
    println("Hello, world!")

    // Read-only variables with: val
    // Mutable variables with: var

    val popcorn = 5 // There are 5 boxes of popcorn
    val hotdog = 7 // There are 7 hotdogs
    var customers = 10 // There are 10 customers in the queue

    println("There are $popcorn boxes of popcorn, " +
            "$hotdog hotdog and $customers customers in the queue")

    // Some customers leave the queue
    customers = 8

    // String templates
    println(customers) // 8
    println("There are $customers customers") // There are 8 costumers
    println("There are ${customers + 1} customers") // There are 9 costumers






}