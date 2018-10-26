package com.ran.tetris.block;

import com.ran.tetris.Cell;
import com.ran.tetris.TetrisBlock;

import java.awt.*;

public class I extends TetrisBlock {

    private static Color COLOR = new Color(0x00a381);

    private int state = 0;

    public I() {
        cellList.add(new Cell(0, 4, COLOR));
        cellList.add(new Cell(0, 3, COLOR));
        cellList.add(new Cell(0, 5, COLOR));
        cellList.add(new Cell(0, 6, COLOR));
    }

    public void change() {
        switch (this.state) {
            case 0:
                this.state = 1;
                cellList.get(1).setDefaultRow(-1);
                cellList.get(1).setCurrentRow(cellList.get(1).getCurrentRow() - 1);
                cellList.get(1).setDefaultCol(4);
                cellList.get(1).setCurrentCol(cellList.get(1).getCurrentCol() + 1);

                cellList.get(2).setDefaultRow(1);
                cellList.get(2).setCurrentRow(cellList.get(1).getCurrentRow() + 1);
                cellList.get(2).setDefaultCol(4);
                cellList.get(2).setCurrentCol(cellList.get(1).getCurrentCol() - 1);

                cellList.get(3).setDefaultRow(2);
                cellList.get(3).setCurrentRow(cellList.get(1).getCurrentRow() + 1);
                cellList.get(3).setDefaultCol(4);
                cellList.get(3).setCurrentCol(cellList.get(1).getCurrentCol() - 2);
                break;
            case 1:
                this.state = 0;
                cellList.get(1).setDefaultRow(0);
                cellList.get(1).setCurrentRow(cellList.get(1).getCurrentRow() + 1);
                cellList.get(1).setDefaultCol(3);
                cellList.get(1).setCurrentCol(cellList.get(1).getCurrentCol() - 1);

                cellList.get(2).setDefaultRow(0);
                cellList.get(2).setCurrentRow(cellList.get(1).getCurrentRow() - 1);
                cellList.get(2).setDefaultCol(5);
                cellList.get(2).setCurrentCol(cellList.get(1).getCurrentCol() + 1);

                cellList.get(3).setDefaultRow(0);
                cellList.get(3).setCurrentRow(cellList.get(1).getCurrentRow() - 1);
                cellList.get(3).setDefaultCol(6);
                cellList.get(3).setCurrentCol(cellList.get(1).getCurrentCol() + 2);
                break;
            default:
                break;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

}
