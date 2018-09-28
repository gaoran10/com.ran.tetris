package com.ran.tetris;

import com.ran.tetris.block.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public abstract class TetrisBlock extends JPanel {

    protected List<Cell> cellList = new ArrayList<>();

    public List<Cell> getCellList() {
        return cellList;
    }

    public void setCellList(List<Cell> cellList) {
        this.cellList = cellList;
    }

    public boolean moveLeft(WallPanel wallPanel) {
        for (Cell cell : cellList) {
            if(cell.checkBlockCollideWall(wallPanel, Cell.MOVE_LEFT)) {
                return false;
            }
        }
        this.setBounds(this.getX() - Cell.HEIGHT, this.getY(), this.getWidth(), this.getHeight());
        for (Cell cell : cellList) {
            cell.setCurrentCol(cell.getCurrentCol() - 1);
        }
        return true;
    }

    public boolean moveRight(WallPanel wallPanel) {
        for (Cell cell : cellList) {
            if(cell.checkBlockCollideWall(wallPanel, Cell.MOVE_RIGHT)) {
                return false;
            }
        }
        this.setBounds(this.getX() + Cell.HEIGHT, this.getY(), this.getWidth(), this.getHeight());
        for (Cell cell : cellList) {
            cell.setCurrentCol(cell.getCurrentCol() + 1);
        }
        return true;
    }

    public boolean moveDown(WallPanel wallPanel) {
        for (Cell cell : cellList) {
            if(cell.checkBlockCollideWall(wallPanel, Cell.MOVE_DOWN)) {
                return false;
            }
        }
        this.setBounds(this.getX(), this.getY() + Cell.WIDTH, this.getWidth(), this.getHeight());
        for (Cell cell : cellList) {
            cell.setCurrentRow(cell.getCurrentRow() + 1);
        }
        return true;
    }

    public void destroy() {
        this.cellList.clear();
    }

    public abstract void change();

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

    @Override
    protected void paintComponent(Graphics g) {
        for (Cell cell : cellList) {
            cell.paintComponent(g);
        }
    }
}
