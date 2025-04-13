package com.javarush.games.minigames.mini05;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

import java.util.ArrayList;

/* 
Цвета радуги
*/

public class RainbowGame extends Game {

    //напишите тут ваш код
    private final static ArrayList<Color> colors = new ArrayList<>();

    @Override
    public void initialize() {
        colors.add(Color.RED);
        colors.add(Color.ORANGE);
        colors.add(Color.YELLOW);
        colors.add(Color.GREEN);
        colors.add(Color.BLUE);
        colors.add(Color.INDIGO);
        colors.add(Color.VIOLET);
        setScreenSize(10, 7);
        for (int y = 0; y < 7; y++) {
            for (int x = 0; x < 10; x++) {
                setCellColor(x,y,colors.get(y));
            }
        }
    }
}
