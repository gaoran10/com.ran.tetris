package com.ran.tetris.block;

import com.ran.tetris.Cell;
import com.ran.tetris.TetrisBlock;

import java.awt.*;

public class O extends TetrisBlock {

    public O() {
        Color color = new Color(243, 156, 18);
        cellList.add(new Cell(0, 3, color));
        cellList.add(new Cell(0, 4, color));
        cellList.add(new Cell(1, 3, color));
        cellList.add(new Cell(1, 4, color));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

}
