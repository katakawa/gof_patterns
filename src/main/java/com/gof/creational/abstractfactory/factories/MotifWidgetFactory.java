package com.gof.creational.abstractfactory.factories;

import com.gof.creational.abstractfactory.objects.MotifScrollBar;
import com.gof.creational.abstractfactory.objects.MotifWindow;

public class MotifWidgetFactory implements WidgetFactory {

    @Override
    public MotifScrollBar createScrollBar() {
        return new MotifScrollBar();
    }

    @Override
    public MotifWindow createWindow() {
        return new MotifWindow();
    }
}