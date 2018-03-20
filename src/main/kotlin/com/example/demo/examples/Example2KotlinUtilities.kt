package com.example.demo.examples

//these functions extend the functionality of class String
//they are on top level, so the extension can be used everywhere
//if they where in a scope, if would only be available within this scope
fun String.getNameOfId(): String {
    return this.split(".")[0]
}

fun String.getNumberOfId(): Int{
    return this.split(".")[1].toInt()
}