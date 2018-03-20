package com.example.demo.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Example9JavaNamedArguments {

    //all I want to do ist call the mehtod namedParametersExample with optional arguments
    public static void main(String[] args) {
        namedParametersExample();
        namedParametersExample("Hans");
        namedParametersExample("Dieter", 33);
        namedParametersExample("Josef", 44, Arrays.asList(4, 5));

        namedParametersExampleNumber(55);
        namedParametersExampleList(Arrays.asList(6,7,8));
    }

    private static void namedParametersExample(String name, int number, List<Integer> list) {
        System.out.println(name + " has a list "+ list.toString() + " and is "+ number +" years old");
    }

    private static void namedParametersExample() {
        namedParametersExample("default", 0, new ArrayList<>());
    }

    private static void namedParametersExample(String name) {
        namedParametersExample(name, 0, new ArrayList<>());
    }

    private static void namedParametersExample(String name, int number) {
        namedParametersExample(name, number, new ArrayList<>());
    }

    private static void namedParametersExampleNumber(int i) {
        namedParametersExample("default", i, new ArrayList<>());
    }

    private static void namedParametersExampleList(List<Integer> integers) {
        namedParametersExample("default", 0, integers);
    }
}
