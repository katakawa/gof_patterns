package com.gof.creational.abstractfactory.factories;

import com.gof.creational.abstractfactory.objects.ScrollBar;
import com.gof.creational.abstractfactory.objects.Window;

public interface WidgetFactory {
    ScrollBar createScrollBar();
    Window createWindow();
}