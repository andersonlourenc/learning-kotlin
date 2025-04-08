package com.example.kotlinbasics.functions

// --- Fuction
fun hello() {
    return println("Hello, world!")
}

fun sum(x: Int, y: Int): Int{
    return x + y
}
// or
// Single-expression functions
fun sum1(x: Int, y: Int) = x + y
// Default parameter values
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}
// Function without return
fun printMessage(message: String) {
    println(message)
    // `return Unit` or `return`is optional
}

// Early returns in functions
// A list of registered usernames
val registerUsernames = mutableListOf("john_doe", "jane_smith")
// A list of registered emails
val registeredEmails = mutableListOf("john@example.com", "jane@example.com")

fun registerUser(username: String, email: String): String {
    // Early return if the username is already taken
    if (username in registerUsernames) {
        return "Username already taken. Please choose a different username"
    }
    // Early return if the email is already registered
    if (email in registeredEmails) {
        return "Email already registered. Please use a different email."
    }
    // Proceed with the registration if the username and email are not taken
    registerUsernames.add(username)
    registeredEmails.add(email)

    return "User registered successfully: $username"
}

// -- Lambda expressions

// For example, the following uppercaseString() fuction:
fun uppercaseString(text: String): String {
    return text.uppercase()
}

fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> { value -> value * 60 * 60 }
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value }
}

fun main() {
    hello()
    // Hello, world!

    println(sum(1,2))
    // 3

    printMessageWithPrefix("Hello", "Log")
    // [Log] Hello

    // Function called only with message parameter
    printMessageWithPrefix("Hello")
    // [Info] Hello
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    // [Log] Hello

    printMessage("Hello")

    println(sum1(1,2))


    println(registerUser("john_doe", "newjohn@example.com"))
    // Username already taken. Please a choose a different username.
    println(registerUser("new_user", "newuser@example.com"))
    // User registered successfully: new_user

    // --- Lambda expressions
    println(uppercaseString("Hello"))

    // Can also written as a lambda expression
    val upperCaseString = {text: String -> text.uppercase() }
    println(upperCaseString("Hello"))

    // Pass to another fuction
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter ({ x -> x > 0 })
    val isNegative = { x: Int -> x < 0 }
    val negatives = numbers.filter(isNegative)

    println(positives)
    // [1, 3, 5]
    println(negatives)
    // [-2, -4, -6]

    // .filter()    function accepts a lambda expression as a predicate:
    // { x -> x > 0 }   takes each element of the list and returns only those that are positive.
    //{ x -> x < 0 }    takes each element of the list and returns only those that are negative.


    // Another example, is using the .map()
    val doubled = numbers.map { x -> x * 2 }

    val isTripled = { x: Int -> x * 3}
    val tripled = numbers.map(isTripled)

    println(doubled)
    // [2, -4, 6, -8, 10, -12]
    println(tripled)
    // [3, -6, 9, -12, 15, -18]

    // Fuction types
    // The syntax for a function type has:
    // Each parameter's type written within parentheses () and separated by commas ,
    // The return type written after ->
    // Example:
    // (String) -> (String) or (Int, Int) -> Int

    val upperCaseString1: (String) -> String = { text -> text.uppercase() }
    println(upperCaseString1("Hello"))


    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2sec = toSeconds("minute")
    val totalTimesInSeconds = timesInMinutes.map(min2sec).sum()
    println("Total time is $totalTimesInSeconds secs")
    // Total time is 1680 secs


    // Invoke separately
    println({ text: String -> text.uppercase() } ("Hello"))

    // Trailing lambdas
    // For example, the .fold() fuction accepts an initial value and an operation

    //The initial is zero.
    // The operation sums the initial value with every item in the list cumulatively
    println(listOf(1, 2, 3).fold(0, { x, item -> x + item })) //   6
    // Alternatively, in the form of a trailing lambda
    println(listOf(1,2,3).fold(0) { x, item -> x + item}) //    6

}