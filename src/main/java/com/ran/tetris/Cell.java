package com.ran.tetris;

import javax.swing.*;
import java.awt.*;

public class Cell extends JPanel {

    public static int WIDTH = 20;
    public static int HEIGHT = 20;
    public static final int MOVE_DOWN = 1;
    public static final int MOVE_LEFT = 2;
    public static final int MOVE_RIGHT = 3;

    private Integer row;

    private Integer col;

    private Color color;

    private Integer isWall;

    public Cell(Integer row, Integer col, Color color) {
        this.row = row;
        this.col = col;
        this.color = color;
        this.isWall = 0;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getCol() {
        return col;
    }

    public void setCol(Integer col) {
        this.col = col;
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
        boolean flag = false;
        System.out.println("X:" + this.col + ", Y:" + this.row);
        for (Cell[] row : wallPanel.getValues()) {
            for (Cell c : row) {
                int rowNum = this.row;
                int colNum = this.col;
                switch (moveDirection) {
                    case 1:
                        rowNum++;
                        break;
                    case 2:
                        colNum--;
                        break;
                    case 3:
                        colNum++;
                        break;
                    default:
                        break;
                }
                if(rowNum == c.getRow() || colNum == c.getCol()) {
                    flag = true;
                    break;
                }
            }
            if(flag) break;
        }
        return flag;
    }

    @Override
    public void paintComponent(Graphics g) {
//        System.out.println("X: " + this.col * WIDTH + ", Y: " + this.row * HEIGHT);
        g.drawRect(this.col * WIDTH, this.row * HEIGHT, WIDTH, HEIGHT);
        g.setColor(this.color);
        g.fillRect(this.col * WIDTH, this.row * HEIGHT, WIDTH, HEIGHT);
    }

}
