package com.gof.structural.bridge;

public abstract class Shape {

    public Shape(Color color) {
        this.color = color;
    }

    protected Color color;
    
    //standard constructors
    
    abstract public String draw();
}