package com.gof.creational.factory.factories;

import com.gof.creational.factory.objects.OrdinaryRoom;
import com.gof.creational.factory.objects.Room;

public class OrdinaryMazeGame extends MazeGame {
    @Override
    protected Room makeRoom() {
        return new OrdinaryRoom();
    }
}