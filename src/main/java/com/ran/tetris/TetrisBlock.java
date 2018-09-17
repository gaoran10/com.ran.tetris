package com.ran.tetris;

import com.ran.tetris.block.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TetrisBlock extends Canvas {

    public List<Cell> cellList = new ArrayList<>();

    public void moveLeft() {
        for (Cell cell : cellList) {
            cell.setCol(cell.getCol() - 1);
        }
    }

    public void moveRight() {
        for (Cell cell : cellList) {
            cell.setCol(cell.getCol() + 1);
        }
    }

    public void moveDown() {
        for (Cell cell : cellList) {
            cell.setRow(cell.getRow() + 1);
        }
    }

    public static TetrisBlock randomBlock() {
        int random = (int) (Math.random() * 7);
        switch (random) {
            case 0:
                return new I();
            case 1:
                return new J();
            case 2:
                return new L();
            case 3:
                return new O();
            case 4:
                return new S();
            case 5:
                return new T();
            case 6:
                return new Z();
        }
        return null;
    }

    public void paint(Graphics g) {
        System.out.println("paint");
        for (Cell cell : cellList) {
            cell.paint(g);
        }
    }

}
