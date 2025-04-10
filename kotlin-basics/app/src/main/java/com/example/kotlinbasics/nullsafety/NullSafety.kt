package com.example.kotlinbasics.nullsafety

// Nullable types

fun describleString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

fun lengthString(maybeString: String?): Int? = maybeString?.length

fun main() {

    // neverNull has String type
    var neverNull: String = "This can't be null"

    // Throws a compiler error
//    neverNull = null


    // nullable has nullable String type
    var nullable: String? = "You can keep a null here"

    // This is OK
    nullable = null

    // By default, null values aren't accepted
    var inferredNonNull = "This compiler assumes non-nullable"

    // Throws a compiler error
//    inferredNonNull = null

    // notNull doesn't accept null values
    fun strLength(notNull: String): Int {
        return notNull.length

    }
    println(strLength(neverNull)) // 18
//        println(strLength(nullable))  // Throws a compiler error

    // A function describeString was declaration
    // Check for null values

    val nullString: String? = null
    println(describleString(nullString))
    // Empty or null string


    // Use safe calls
    val nullString1: String? = null
    println(lengthString(nullString))
    // null

    // In the following example, nullString is null so the invocation of .uppercase()
    // is skipped and null is returned:

    val nullString2: String? = null
    println(nullString2?.uppercase())

    val nullString3 : String ? = null
    println(nullString3?.length?: 0)






}