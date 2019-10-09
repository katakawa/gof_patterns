package com.gof.creational.abstractfactory.factories;

import com.gof.creational.abstractfactory.objects.MotifScrollBar;
import com.gof.creational.abstractfactory.objects.MotifWindow;
import com.gof.creational.abstractfactory.objects.PMScrollBar;
import com.gof.creational.abstractfactory.objects.PMWindow;

public class PMWidgetFactory implements WidgetFactory {

    @Override
    public PMScrollBar createScrollBar() {
        return new PMScrollBar();
    }

    @Override
    public PMWindow createWindow() {
        return new PMWindow();
    }
}