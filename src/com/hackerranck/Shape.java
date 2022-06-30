package com.hackerranck;

public class Shape {
    private int length;
    private int breadth;

    public Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        System.out.println(length + " " + breadth);
    }
}
