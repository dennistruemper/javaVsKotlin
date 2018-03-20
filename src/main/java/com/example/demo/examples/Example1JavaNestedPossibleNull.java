package com.example.demo.examples;

//get nested possible null
public class Example1JavaNestedPossibleNull {

    //This class is recursive structure for simple nested example
    public static class PersonJava {

        private String name;
        private PersonJava firstBorn = null;

        PersonJava(String name, PersonJava firstBorn){
            this.name = name;
            this.firstBorn = firstBorn;
        }

        public String getName() {
            return name;
        }

        public PersonJava getFirstBorn() {
            return firstBorn;
        }
    }
}
