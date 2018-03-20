package com.example.demo.examples;

import com.example.demo.examples.Example1JavaNestedPossibleNull.PersonJava;
import org.junit.Test;

import static org.junit.Assert.*;

public class Example1JavaNestedPossibleNullTest {

    @Test
    public void personWithoutChild() {
        PersonJava personJava = new PersonJava("Max", null);
        assertNull(personJava.getFirstBorn());
    }

    @Test
    public void personIsFather() {
        PersonJava personJavaChild = new PersonJava("Maxchen", null);
        PersonJava personJava = new PersonJava("Max", personJavaChild);
        assertNotNull(personJava.getFirstBorn());
        assertNull(personJava.getFirstBorn().getFirstBorn());
    }

    @Test
    public void personIsGrandfather() {
        PersonJava personJavaGrandchild = new PersonJava("Maxi", null);
        PersonJava personJavaChild = new PersonJava("Maxchen", personJavaGrandchild);
        PersonJava personJava = new PersonJava("Max", personJavaChild);
        //Grandchild is Maxi, child could be null
        assertNotNull(personJava.getFirstBorn());
        assertNotNull(personJava.getFirstBorn().getFirstBorn());
        assertEquals("Maxi", personJava.getFirstBorn().getFirstBorn().getName());

        //other example with logic instead of multiple assertions
        assertTrue(personJava.getFirstBorn() != null &&
                personJava.getFirstBorn().getFirstBorn() != null &&
                personJava.getFirstBorn().getFirstBorn().getName().equals("Maxi"));

    }

}