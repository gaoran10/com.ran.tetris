package com.ran.tetris.block;

import com.ran.tetris.Cell;
import com.ran.tetris.TetrisBlock;

import java.awt.*;

public class L extends TetrisBlock {

    public L() {
        Color color = new Color(52, 152, 219);
        cellList.add(new Cell(0, 4, color));
        cellList.add(new Cell(0, 3, color));
        cellList.add(new Cell(0, 5, color));
        cellList.add(new Cell(1, 3, color));
    }

    @Override
    public void change() {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

}
