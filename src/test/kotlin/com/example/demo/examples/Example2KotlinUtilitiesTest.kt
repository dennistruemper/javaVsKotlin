package com.example.demo.examples

import org.junit.Assert.*
import org.junit.Test

class Example2KotlinUtilitiesTest {

    @Test
    fun getNumberFromId() {
        val s = "abc.123"
        assertEquals(123, s.getNumberOfId())
    }

    @Test
    fun getNameFromId() {
        //method used on string directly
        assertEquals("abc", "abc.123".getNameOfId())
    }
}

