package com.gof.creational.factory;

import com.gof.creational.factory.factories.MagicMazeGame;
import com.gof.creational.factory.factories.MazeGame;
import com.gof.creational.factory.factories.OrdinaryMazeGame;

public class Test {

    public static void main(String[] args) {
        MazeGame ordinaryGame = new OrdinaryMazeGame();
        MazeGame magicGame = new MagicMazeGame();
    }

}
