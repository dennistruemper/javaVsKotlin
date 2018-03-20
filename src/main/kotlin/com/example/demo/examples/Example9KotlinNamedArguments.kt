package com.example.demo.examples

//named arguments with default values result in a lot of flexibility
fun main(args: Array<String>) {
    fun namedParametersExample(name: String = "default", number: Int = 0, list: List<Int> = listOf()){
        println("$name has a list $list and is $number years old ")
    }

    namedParametersExample()
    namedParametersExample("Hans")
    namedParametersExample("Dieter", 33)
    namedParametersExample("Josef", 44, listOf(4,5))

    namedParametersExample(number = 55)
    namedParametersExample(list = listOf(6,7,8))
    namedParametersExample(number = 66 , list = listOf(6,7,8))
    namedParametersExample(name = "Otto" , list = listOf(6,7,8))
}


