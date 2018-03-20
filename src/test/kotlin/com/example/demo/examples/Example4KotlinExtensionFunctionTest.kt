package com.example.demo.examples

import com.example.demo.examples.Example4JavaExtensionFunction.createPoint
import com.example.demo.examples.Example4JavaExtensionFunction.PointJava
import org.junit.Assert.*
import org.junit.Test

class Example4KotlinExtensionFunctionTest {

    //define overloaded operators just for tests to keep them better readable
    //no need to access class PointKotlin
    operator fun PointKotlin.plus(increment: PointKotlin) = PointKotlin(x + increment.x, y + increment.y)
    operator fun PointKotlin.minus(increment: PointKotlin) = PointKotlin(x - increment.x, y - increment.y)

    @Test
    fun plusPointKotlin() {
        val point = PointKotlin(1, 2) + PointKotlin(4, 9);
        assertEquals(5, point.x)
        assertEquals(11, point.y)
    }

    @Test
    fun minusPointKotlin() {
        val point1 = PointKotlin(4, 9)
        val point2 = PointKotlin(1, 2)
        val point = point1 - point2;
        assertEquals(3, point.x)
        assertEquals(7, point.y)
    }

    //works for java classes too
    operator fun PointJava.plus(increment: PointJava) = createPoint(getX() + increment.getX(), getY() + increment.getY())
    operator fun PointJava.minus(increment: PointJava) = createPoint(getX() - increment.getX(), getY() - increment.getY())

    @Test
    fun plusPointJava() {
        val point1 = createPoint(1, 2)
        val point2 = createPoint(4, 9)
        val point = point1 + point2
        assertEquals(5, point.getX())
        assertEquals(11, point.getY())
    }

    @Test
    fun minusPointJava() {
        val point1 = createPoint(4, 9)
        val point2 = createPoint(1, 2)
        val point = point1 - point2
        assertEquals(3, point.getX())
        assertEquals(7, point.getY())
    }


}
