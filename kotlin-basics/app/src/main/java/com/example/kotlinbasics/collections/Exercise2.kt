package com.example.kotlinbasics.collections

fun main (){

    // You have set of protocols supported by your server. A user a particular protocol.
    // Complete the program to check whether the requested protocol is supported or not
    // (is Supported must be a Boolean value).

    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED


    println("Support for $requested: $isSupported")
}