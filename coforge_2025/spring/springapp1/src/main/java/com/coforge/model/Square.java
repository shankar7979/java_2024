package com.coforge.model;

public class Square implements  Shape{

    private float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side+
                '}';
    }

    @Override
    public float area() {
        return this.side*this.side;
    }
}
