package com.gof.behavioral.mediator;

import com.gof.behavioral.mediator.component.*;
import com.gof.behavioral.mediator.mediatorimpl.Editor;
import com.gof.behavioral.mediator.mediatorimpl.Mediator;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
