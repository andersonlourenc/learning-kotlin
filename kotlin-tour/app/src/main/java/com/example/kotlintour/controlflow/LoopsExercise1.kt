package com.example.kotlinbasics.controlflow

fun main () {

    // You have a program that counts pizza slices until there's a whole pizza with slices.
    // Reactor this program in two ways:
    // Use a while loop
    // Use a do-while loop

    var pizzaSlices = 0


    while (pizzaSlices < 7) {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    }
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")


var pizzasSlices = 0
    pizzasSlices++
    do {

        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzasSlices++
    } while (pizzasSlices < 8)

    println("There are $pizzasSlices slices of pizza. Hooray! We have a whole pizza! :D")



}