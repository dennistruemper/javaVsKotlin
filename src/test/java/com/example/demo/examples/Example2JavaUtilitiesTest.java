package com.example.demo.examples;

import org.junit.Test;

import static org.junit.Assert.*;

//example how to use utilityclass
public class Example2JavaUtilitiesTest {

    @Test
    public void getNumberFromId(){
        String s = "abc.123";
        assertEquals(123, Example2JavaUtilities.IdUtil.getNumber(s));
    }

    @Test
    public void getNameFromId(){
        String s = "abc.123";
        assertEquals("abc", Example2JavaUtilities.IdUtil.getName(s));
    }

}