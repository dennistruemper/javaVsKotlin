package com.example.demo.examples

//within the path of if(x is String) x is treated as a String.
//As you can see here, Any has no length method, but this compiles without cast
class smartCastDemo{
    fun smartCastString(x: Any){
        if(x is String)
            println(x.length)
    }
}