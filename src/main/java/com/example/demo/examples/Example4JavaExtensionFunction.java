package com.example.demo.examples;

import java.util.Objects;

public class Example4JavaExtensionFunction {

    //method to create an Instance of PointJava
    public static PointJava createPoint(int x, int y){
        return new PointJava(x,y);
    }

    //PointJava is a class to store a value for x and y
    //as you can see, it is very noisy compared to kotlin PointKotlin
    public static class PointJava {
        int x;
        int y;

        public PointJava(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "PointJava{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PointJava pointJava = (PointJava) o;
            return x == pointJava.x &&
                    y == pointJava.y;
        }

        @Override
        public int hashCode() {

            return Objects.hash(x, y);
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
