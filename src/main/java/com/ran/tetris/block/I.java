package com.ran.tetris.block;

import com.ran.tetris.Cell;
import com.ran.tetris.TetrisBlock;

import java.awt.*;

public class I extends TetrisBlock {

    public I() {
        Color color = new Color(0x00a381);
        cellList.add(new Cell(0, 4, color));
        cellList.add(new Cell(0, 3, color));
        cellList.add(new Cell(0, 5, color));
        cellList.add(new Cell(0, 6, color));
    }

    public void paint(Graphics g) {
        System.out.println("paint");
        for (Cell cell : cellList) {
            cell.paint(g);
        }
    }

}
