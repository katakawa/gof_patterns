package com.gof.behavioral.mediator.component;

import com.gof.behavioral.mediator.mediatorimpl.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
