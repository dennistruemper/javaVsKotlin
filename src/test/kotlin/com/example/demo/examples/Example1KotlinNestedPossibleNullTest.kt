package com.example.demo.examples

import com.example.demo.examples.Example1JavaNestedPossibleNull.*
import org.junit.Assert.*
import org.junit.Test

class Example1KotlinNestedPossibleNullTest {
    @Test
    fun personIsGrandfather() {
        val personJavaGrandchild = PersonJava("Maxi", null)
        val personJavaChild = PersonJava("Maxchen", personJavaGrandchild)
        val personJava = PersonJava("Max", personJavaChild)
        //Grandchild is Maxi, child could be null
        assertTrue(personJava?.firstBorn?.firstBorn?.name == "Maxi")
    }

    @Test
    fun personIsNoGrandfather() {
        val personJavaChild = PersonJava("Maxchen", null)
        val personJava = PersonJava("Max", personJavaChild)
        //Grandchild is null, no NPE
        assertFalse(personJava?.firstBorn?.firstBorn?.name == "Maxi")
    }
}