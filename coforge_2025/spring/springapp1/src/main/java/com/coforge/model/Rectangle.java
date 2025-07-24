package com.coforge.model;

public class Rectangle implements  Shape{

    private float length;
    private float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public float area() {
        return this.width*this.length;
    }
}
