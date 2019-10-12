package com.gof.structural.decorator.component;

public interface Shape {
    void draw();
    void resize();
    String description();
    boolean isHide();
}