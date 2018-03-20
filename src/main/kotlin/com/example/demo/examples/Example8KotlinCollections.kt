package com.example.demo.examples

//some collection stuff
fun main(args: Array<String>) {
    val numbers = listOf(1,2,3)
    //default list is immutable, so this won't compile
    //numbers.add(4)
    println(numbers)

    val numbersMutable = numbers.toMutableList()
    numbersMutable.add(4)
    println(numbersMutable)

    val items = listOf(1, 2, 3, 4)
    println("list operations:")
    println("first == 1 ${items.first() == 1}")
    println("last == 4 ${items.last() == 4}")
    // lambda with single argument can reduce arg -> arg.legth to it.length
    println("filter for even ${items.filter { it % 2 == 0 }}")
    println("double each ${items.map { it * 2 }}")
    println("zip lists ${listOf(1,2,3).zip(items.map { it + 3 + it * 4 })}")
    println("reversed ${items.reversed()}")
    println("drop wile <= 2 ${items.dropWhile { it <= 2 }}")
    println("take while <= 2 ${items.takeWhile { it <= 2 }}")
    println("group by even and odd ${items.groupBy { if(it % 2 == 0) "even" else "odd" }}")
    println("partition by modulo 2 ${items.partition { it % 2 == 0 }}")
    println("list + list ${numbers + items}")
}


