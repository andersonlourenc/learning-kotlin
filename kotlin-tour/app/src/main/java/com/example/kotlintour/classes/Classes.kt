package com.example.kotlinbasics.classes

class Customer

/*
class Contact (val id: Int, var email: String) {
    val category: String = ""
}

class Contact(val id: Int, var email: String = "example@gmail.com") {
    val category: String = "Work"
}
 */


class Contact(val id: Int, var email: String)

class Contact1(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

fun main() {
    val contact = Contact(1, "mary@gmail.com")
    /*
  In the example
 "Contact" is a class.
 "contact" is an instance of the Contant class.
 "id" and "email" are properties.
 "id" and "email" are used with the default constructor to create "contact"
*/

//  Access properties

    // Prints the value of the property: email
    println(contact.email)   // mary@gmail.com

    // Updates the value of the property: email
    contact.email = "jane@gmail.com"

    println(contact.email)  //  jane@gmail.com

//  Member Fuction
//  In addition to declaring as part of an objet's characteristics, you can also define
//  an object's behavior with member functions.


    val contact1 = Contact1(1, "mary@gmail.com")
    // Calls member function printId()
    contact1.printId()  // 1

    // -- Data class

    data class User(val name: String, val id: Int)

    // Print as string
    val user = User("Alex", 1)
    // Automatically uses toString() function so that output is easy to read
    println(user)   // User(name=Alex, id=1)

    // Compare instances

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

        //Compares user to second user
    println("user == secondUser: ${user == secondUser}") //     user = secondUser: true

        // Compares user to third user
    println("user == thirdUser: ${user == thirdUser}")


//  Copy instance
    // Creates an exact copy of user
    println(user.copy()) //     User(name=Alex, id=1)
    // User(name=Alex, id=1)

    // Creates a copy of user with name: "Max"
    println(user.copy("Max"))
    // Creates a copy of user with id: 3
    println(user.copy(id= 3))






}




