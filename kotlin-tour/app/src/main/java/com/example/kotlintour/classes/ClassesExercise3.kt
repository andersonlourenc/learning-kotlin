package com.example.kotlinbasics.classes

import kotlin.random.Random
/*
    To test your code, you need a generator that can create random employees. Define a
    "RandomEmployeeGenerator" class with a fixed list of potential names (inside the class body).
    Configure the class with a minimum and maximum salary (inside the class header).
    In the class body, define the generateEmployee() function. Once again, the main function
    demonstrates how you can use this class.
 */

data class Employee1(val name: String, var salary: Int)
 class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
     val names = listOf("Mary", "John", "Mark", "Julie", "Anna", "Jack", "Elizabeth")
     fun generateEmployee() =
         Employee1(names.random(),
         Random.nextInt(from = minSalary, until = maxSalary))
     }




fun main() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}
