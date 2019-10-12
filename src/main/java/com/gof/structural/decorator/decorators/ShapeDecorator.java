package com.gof.structural.decorator.decorators;

import com.gof.structural.decorator.component.Shape;

public abstract class ShapeDecorator implements Shape {
      protected Shape decoratedShape;

      public ShapeDecorator(Shape decoratedShape) {
            super();
            this.decoratedShape = decoratedShape;
      }

}