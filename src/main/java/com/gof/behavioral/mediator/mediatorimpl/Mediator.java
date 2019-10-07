package com.gof.behavioral.mediator.mediatorimpl;

import com.gof.behavioral.mediator.component.Component;
import com.gof.behavioral.mediator.component.Note;

import javax.swing.*;

public interface Mediator {
    void addNewNote(Note note);
    void deleteNote();
    void getInfoFromList(Note note);
    void saveChanges();
    void markNote();
    void clear();
    void sendToFilter(ListModel listModel);
    void setElementsList(ListModel list);
    void registerComponent(Component component);
    void hideElements(boolean flag);
    void createGUI();
}