package com.gof.structural.bridge;

public class Test {

    public static void main(String[] args) {
        Shape square = new Square(new Red());
        System.out.println(square.draw());

        Shape circle = new Circle(new Green());
        System.out.println(circle.draw());
    }

}
