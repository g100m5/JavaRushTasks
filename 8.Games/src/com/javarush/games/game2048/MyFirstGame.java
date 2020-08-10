package com.javarush.games.game2048;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

public class MyFirstGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(10, 10);
        showGrid(false);
        setCellValueEx(1, 1, Color.BLUE, "X", Color.ORANGE, 50);
        setCellValueEx(1, 2, Color.BLUE, "Y", Color.ORANGE, 50);

        setCellColor(0, 0, Color.RED);
        setCellColor(3, 6, Color.WHITE);
        setCellColor(7, 7, Color.WHITE);

        setCellColor(6, 7, Color.YELLOW);


        Color myColor = getCellColor(2, 0);

        System.out.println(myColor.name());

        setCellValue(3, 6, "text");
        setCellValue(0, 8, "W");
        setCellValue(4, 1, "2222");
        setCellValue(6, 6, "");


        String s = getCellValue(3, 3);
        System.out.println(getCellValue(4, 1));

        setCellTextSize(3 , 6, 10);
    }

}
