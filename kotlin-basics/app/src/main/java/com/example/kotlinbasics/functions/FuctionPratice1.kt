package com.example.kotlinbasics.functions

import kotlin.math.PI
// Write a fuction called circleArea that takes the radius of a circle in integer format as a parameter
// and outputs the area of that circle


fun circleArea(radius: Int): Double {
    return PI * radius * radius
}

fun main () {
    println(circleArea(2))
    // 12.566370614359172
}
