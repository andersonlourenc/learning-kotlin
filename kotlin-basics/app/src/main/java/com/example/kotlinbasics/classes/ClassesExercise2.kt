package com.example.kotlinbasics.classes

// Declare the additional data classes that are needed for this code to compile.

data class Person(val name: Name, val adress: Address, val ownsPet: Boolean)
data class Name(val first: String, val last: String)
data class Address(val avenue: String, val city: City)
data class City(val name: String, val countryCode: String)


fun main() {
    val person = Person(
        Name("John", "Smith"),
        Address("123 Fake Street", City("Springfield", "US")),
        ownsPet = false
    )
    println(person.name)
}
