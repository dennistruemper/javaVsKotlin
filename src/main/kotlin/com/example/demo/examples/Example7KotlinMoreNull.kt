package com.example.demo.examples

//some null checks, have a look at the comments in the end
class moreNullStuff {
    fun checkLikeJava(b: String?) {
        if (b != null && b.isNotEmpty()) {
            println("String of length ${b.length}")
        } else {
            println("Empty string")
        }
    }

    fun checkSavaCallAndElvis(b: String?) {
        //Elvis Operator (?:)
        //a ?= b is like if (a != null) a else be
        //if returns result of executed body
        val result = if (b?.length ?: 0 > 0) {
            "String of length ${b?.length}"
        } else {
            "Empty string"
        }
        println(result)
    }

    fun checkNoNullAllowed(b: String) {
        println("String of length ${b.length}")
    }

    fun forceNpe(b: String?) {
        //if you want to keep default java behaviour you can use double bang (!!)
        println("String of length ${b!!.length}")
    }
    
    fun main(args: Array<String>) {
        checkLikeJava("123")
        checkLikeJava("")
        checkLikeJava(null)
        checkSavaCallAndElvis("123")
        checkSavaCallAndElvis("")
        checkSavaCallAndElvis(null)
        checkNoNullAllowed("123")
        checkNoNullAllowed("")
        //compile time error
        //checkNoNullAllowed(null)

        //run time error
        //forceNpe(null)
    }
}


