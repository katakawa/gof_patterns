package com.gof.structural.composite;

public class Test {

    public static void main(String[] args) {

        //Initialize four ellipses
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        //Initialize three composite graphics
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();
        CompositeGraphic graphic3 = new CompositeGraphic();

        //Composes the graphics
        graphic2.add(ellipse1);
        graphic2.add(ellipse2);
        graphic2.add(ellipse3);

        graphic3.add(ellipse4);

        graphic1.add(graphic2);
        graphic1.add(graphic3);

        //Prints the complete graphic (four times the string "Ellipse").
        graphic1.print();
    }
}