package com.example.demo.examples;

public class Example2JavaUtilities {

    //utility class for ids
    public static class IdUtil {

        public static int getNumber(String idString){
            return Integer.parseInt(idString.split("\\.")[1]);
        }

        public static String getName(String idString){
            return idString.split("\\.")[0];
        }
    }
}
