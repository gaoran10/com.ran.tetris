package com.ran.tetris.block;

import com.ran.tetris.Cell;
import com.ran.tetris.TetrisBlock;

import java.awt.*;

public class Z extends TetrisBlock {

    public Z() {
        Color color = new Color(26, 82, 118);
        cellList.add(new Cell(1, 4, color));
        cellList.add(new Cell(0, 3, color));
        cellList.add(new Cell(0, 4, color));
        cellList.add(new Cell(1, 5, color));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

}
