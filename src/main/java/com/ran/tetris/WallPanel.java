package com.ran.tetris;

import javax.swing.*;
import java.awt.*;

public class WallPanel extends JPanel {

    private Cell[][] values = new Cell[41][21];

    public Cell[][] getValues() {
        return values;
    }

    public void setValues(Cell[][] values) {
        this.values = values;
    }

    public WallPanel() {
        for (int i = 0 ; i < this.values.length ; i++) {
            for (int j = 0 ; j < this.values[i].length ; j++) {
                this.values[i][j] = new Cell(i, j, Color.PINK);
            }
        }
    }

    public void setWall(int x, int y, Color color) {
        values[y][x].setIsWall(1);
        values[y][x].setColor(color);
    }

    @Override
    protected void paintComponent(Graphics g) {
        for (Cell[] row : this.values) {
            for(Cell c : row) {
                if(c == null) {
                    continue;
                }
//                if(c.getIsWall() == 1) {
                    c.paintComponent(g);
//                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Cell[] row : this.values) {
            for (Cell v : row) {
                sb.append(v == null ? 0 : v.getIsWall()).append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("\n");
        }
        return sb.toString();
    }

}
