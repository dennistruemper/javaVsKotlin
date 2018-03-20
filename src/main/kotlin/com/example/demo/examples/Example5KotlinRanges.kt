package com.example.demo.examples

//whenever you need a sequence kotlin can be used to write a simple readable representation
fun main(args: Array<String>) {

    val iRef = 6
    if (iRef in 1..10) { // equivalent of 1 <= i && i <= 10
        println("${iRef} is in 1..10")
    }

    println("i in 1..4")
    for (i in 1..4) print(i) // prints "1234"
    println()

    println("i in 4..1")
    for (i in 4..1) print(i) // prints nothing
    println()

    println("i in 4 downTo 1")
    for (i in 4 downTo 1) print(i) // prints "4321"
    println()

    println("i in 1..4 step 2")
    for (i in 1..4 step 2) print(i) // prints "13"
    println()

    println("i in 4 downTo 1 step 2")
    for (i in 4 downTo 1 step 2) print(i) // prints "42"
    println()

    println("i in 1 until 10")
    for (i in 1 until 10) { // i in [1, 10), 10 is excluded
        print(i)
    }
    println()

    val x = 12
    println("i in 1..x step 3")
    for(i in 1..x step 3){
        print(i)
    }
}
