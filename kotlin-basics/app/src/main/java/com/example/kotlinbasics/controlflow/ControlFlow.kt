package com.example.kotlinbasics.controlflow


fun main () {

    // Conditional expressions
    // if and when

    // --- if

    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)  // 1

    val a = 1
    val b = 2
    println(if (a > b) a else b)


    // --- When

    val obj = "Hello"

    when (obj) {
        // Checks whether obj equals to "1"
        "1" -> println("One")
        // Checks whether obj equals to "Hello"
        "Hello" -> println("Greeting")
        // Default statement
        else -> println("Unknown")
    }       // Greeting


    val obje = "Hello"

    val result = when (obje) {
        // If obje equals "1", sets result to "one"
        "1" -> "One"
        // If obje equals "Hello", sets result to "Greeting"
        "Hello" -> "Greeting"
        // Sets result to "Unknown" if no previous condition is satisfied
        else -> "Unknmown"
    }
    println(result)


    val trafficLightState = "Red" // This can be "Green", "Yellow", or "Red"

    val trafficAction = when {
        // Use the equality operator (==) to compare the dice results
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Yellow" -> "Slow down"
        trafficLightState == "Red" -> "Stop"
        else -> "Malfunction"
    }
    println(trafficAction)      // Stop

    // Or

    val trafficAction1 = when (trafficLightState) {
        "Green" -> "Go"
        "Yellow" -> "Slow down"
        "Red" -> "Stop"
        else -> "Malfunction"
    }
    println(trafficAction1)         // Stop


    // --- Ranges

    // Way to do
    // ".."         1..4 is equivalent to 1, 2, 3, 4
    // "..<"        1..<4 is equivalent to 1, 2, 3
    // "downTo"     4 downTo 1 is equivalent to 4, 3, 2, 1
    // "step"       1..5 step 2 is equivalent to 1, 3, 5

    // You can also do the same with Char ranges;
    // 'a'..'d' is equivalent 'a', 'b', 'c', 'd'
    // 'z' downTo 's' step 2 is equivalent 'z', 'x', 'v', 't'

  // --- Loops
  // For

    for (number in 1..5) {
        // number is the iterator and 1..5 is the range
        println(number)     // 12345
    }

    val cakes = listOf("carrot", "chesse", "chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }

    // While
    // To execute a code block while a conditional expression is true. (while)
    // To execute the code block first and then check the condional expression. (do-while)

    var cakesEaten = 0
//    while (cakesEaten < 3) {
//        println("Eat a cake")
//        cakesEaten++
//    }

    var cakesBaked = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)


}
