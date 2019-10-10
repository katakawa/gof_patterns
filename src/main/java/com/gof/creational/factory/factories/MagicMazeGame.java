package com.gof.creational.factory.factories;

import com.gof.creational.factory.objects.MagicRoom;
import com.gof.creational.factory.objects.Room;

public class MagicMazeGame extends MazeGame {
    @Override
    protected Room makeRoom() {
        return new MagicRoom();
    }
}