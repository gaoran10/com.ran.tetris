package com.ran.tetris;

import javax.swing.*;
import java.awt.*;

public class Cell extends JPanel {

    public static int WIDTH = 20;
    public static int HEIGHT = 20;
    public static final int MOVE_DOWN = 1;
    public static final int MOVE_LEFT = 2;
    public static final int MOVE_RIGHT = 3;

    private Integer defaultRow;

    private Integer defaultCol;

    private Integer currentRow;

    private Integer currentCol;

    private Color color;

    private Integer isWall;

    public Cell(Integer row, Integer col, Color color) {
        this.defaultRow = row;
        this.currentRow = row;
        this.defaultCol = col;
        this.currentCol = col;
        this.color = color;
        this.isWall = 0;
        this.setOpaque(true);
        this.setBounds(0, 0, WIDTH, HEIGHT);
    }

    public Cell(Integer row, Integer col, Color color, Integer isWall) {
        this.defaultRow = row;
        this.currentRow = row;
        this.defaultCol = col;
        this.currentCol = col;
        this.color = color;
        this.isWall = isWall;
        this.setOpaque(true);
        this.setBounds(0, 0, WIDTH, WIDTH);
    }

    public Integer getDefaultRow() {
        return defaultRow;
    }

    public void setDefaultRow(Integer defaultRow) {
        this.defaultRow = defaultRow;
    }

    public Integer getDefaultCol() {
        return defaultCol;
    }

    public void setDefaultCol(Integer defaultCol) {
        this.defaultCol = defaultCol;
    }

    public Integer getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(Integer currentRow) {
        this.currentRow = currentRow;
    }

    public Integer getCurrentCol() {
        return currentCol;
    }

    public void setCurrentCol(Integer currentCol) {
        this.currentCol = currentCol;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getIsWall() {
        return isWall;
    }

    public void setIsWall(Integer isWall) {
        this.isWall = isWall;
    }

    public boolean checkBlockCollideWall(WallPanel wallPanel, int moveDirection) {
        int rowNum = this.currentRow;
        int colNum = this.currentCol;
        switch (moveDirection) {
            case MOVE_DOWN:
                rowNum++;
                break;
            case MOVE_LEFT:
                colNum--;
                break;
            case MOVE_RIGHT:
                colNum++;
                break;
            default:
                break;
        }
        Cell[][] wallCells = wallPanel.getValues();
        System.out.println(rowNum + ", " + colNum + ": " + wallCells[rowNum][colNum].getIsWall());
        return wallCells[rowNum][colNum].getIsWall() == 1;
    }

    @Override
    public void paintComponent(Graphics g) {
//        System.out.println("X: " + this.defaultCol * WIDTH + ", Y: " + this.defaultRow * HEIGHT);
        g.drawRect(this.defaultCol * WIDTH, this.defaultRow * HEIGHT, WIDTH, HEIGHT);
        g.setColor(this.color);
        g.fillRect(this.defaultCol * WIDTH, this.defaultRow * HEIGHT, WIDTH, HEIGHT);
    }

}
