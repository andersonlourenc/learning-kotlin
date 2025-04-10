package com.example.kotlinbasics.basictypes

fun main () {

    var customers = 10

    // Some customers leave the queue
    customers = 8

    customers = customers + 3 // Example of addition: 8+3 = 11
    customers  += 7           // Example of addition: 11+7 = 18
    customers -= 3            // Example of subtraction: 18-3 = 15
    customers *= 2            // Example of multiplication: 30
    customers /= 3            // Example of division: 10

    println(customers)

    // Variable declared without initialization
    val d: Int
    // Variable inicialized
    d = 3

    // Variable explicitly typed and initialized
    val e: String = "hello"

    // Variable can be read because they have been initialized
    println(d) // 3
    println(e) // hello

}