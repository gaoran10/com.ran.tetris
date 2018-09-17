package com.ran.tetris.block;

import com.ran.tetris.Cell;
import com.ran.tetris.TetrisBlock;

import java.awt.*;

public class T extends TetrisBlock {

    public T() {
        Color color = new Color(0);
        cellList.add(new Cell(0, 4, color));
        cellList.add(new Cell(0, 3, color));
        cellList.add(new Cell(0, 5, color));
        cellList.add(new Cell(1, 3, color));
    }

}
