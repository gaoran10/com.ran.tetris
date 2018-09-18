package com.ran.tetris.block;

import com.ran.tetris.Cell;
import com.ran.tetris.TetrisBlock;

import java.awt.*;

public class J extends TetrisBlock {

    public J() {
        Color color = new Color(231, 76, 60);
        cellList.add(new Cell(0, 4, color));
        cellList.add(new Cell(0, 3, color));
        cellList.add(new Cell(0, 5, color));
        cellList.add(new Cell(1, 5, color));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

}
