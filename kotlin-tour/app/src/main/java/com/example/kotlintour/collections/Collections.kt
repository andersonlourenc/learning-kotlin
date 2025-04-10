package com.example.kotlinbasics.collections

fun main () {

    // --- List

    // Read only list
    val readOnlyShapes = listOf ("triangle", "square", "circle")
    println(readOnlyShapes)
    // [triangle, square, circle]

    // Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle",
        "square", "circle")
    println(shapes)
    // [triangle, square, circle]

    // To prevent unwanted modifications, i created a read-only view of a mutable list by assingning it to list
    val shapesLocked: List<String> = shapes

    // Lists are ordered so to access an item in a list, use the indexed access operator []
    println("The first item in the list is: ${readOnlyShapes[0]}")
    println("The first item in the list is: ${readOnlyShapes.first()}")
    println("The last item in the list is: ${readOnlyShapes.last()}")

    println("This list has ${readOnlyShapes.count()} items")

    // To check that an item is in a list, use the "in" operator
    println("circle" in readOnlyShapes)


    val shapesOpened: MutableList<String> = shapes
    // Add "pertagon" to the list
    shapes.add("pentagon")
    println(shapes)
    // [triangle, square, circle, pentagon]

    // Remove the first "pentagon" from the list
    shapes.remove("pentagon")
    println(shapes)


    // --- Set

    // Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")

    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    println(readOnlyFruit)
    // [apple, banana, cherry]
    // the duplicate "cherry" item is dropped

    val fruitLocked: Set<String> = fruit
    println("This set has ${readOnlyFruit.count()} items")

    println("banana" in readOnlyFruit)

    val fruitOpened: MutableSet<String> = fruit
    fruit.add("dragonfruit")    // Add "dragonfruit" to the set
    println(fruit)
    fruit.remove("dragonfruit")
    println(fruit)


    // --- Map

    // Read only list
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)  // {apple=100, kiwi=190, orange=100}

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)  // {apple=100, kiwi=190, orange=100}

    val juiceMenuLocked: Map<String, Int> = juiceMenu

    println("The value of apple juice is ${readOnlyJuiceMenu["apple"]}")
    println("The value of apple juice is ${readOnlyJuiceMenu["pineapple"]}")

    val juiceMenuOpened: MutableMap<String, Int> = juiceMenu

    // I can also use the indexed access operator [] to add items to a mutable map
    juiceMenu ["coconut"] = 150
    println(juiceMenu)  // {apple=100, kiwi=190, orange=100, coconut=150}

    juiceMenu.remove("orange")
    println(juiceMenu)  // {apple=100, kiwi=190, coconut=150}

    println("This map has ${juiceMenu.count()} key-value pairs")

    // To check if a specific key is already included in a map, use the .containsKey()
    println(juiceMenu.containsKey("kiwi"))  // true

    // To obtain a collection of the keys or values of a map, use the keys and values properties respectively
    println(juiceMenu.keys)
    println(juiceMenu.values)

    // To check that a key or values is in a map, use in operator
    println("orange" in juiceMenu.keys)         // true
    // Alternatively, you don't need to use the keys property
    println("orange" in readOnlyJuiceMenu)      // true

    println(200 in juiceMenu.values)            // false

}