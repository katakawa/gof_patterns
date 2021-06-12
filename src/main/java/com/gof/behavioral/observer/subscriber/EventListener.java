package com.gof.behavioral.observer.subscriber;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}