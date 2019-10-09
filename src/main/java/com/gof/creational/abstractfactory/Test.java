package com.gof.creational.abstractfactory;


import com.gof.creational.abstractfactory.factories.MotifWidgetFactory;
import com.gof.creational.abstractfactory.factories.PMWidgetFactory;
import com.gof.creational.abstractfactory.factories.WidgetFactory;

public class Test {

    public static void main(String[] args) {
        WidgetFactory pmWidgetFactory = new PMWidgetFactory();
        WidgetFactory motifWidgetFactory = new MotifWidgetFactory();

        System.out.println(pmWidgetFactory.createScrollBar().getClass());
        System.out.println(motifWidgetFactory.createScrollBar().getClass());
    }
}
