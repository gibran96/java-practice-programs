package com.hackerranck;

public class Rectangle extends Shape {

    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        super(length, breadth);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void area() {
        System.out.println(this.length*this.breadth);
    }
}
