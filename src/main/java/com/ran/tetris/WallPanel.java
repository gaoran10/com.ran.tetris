package com.ran.tetris;

import javax.swing.*;
import java.awt.*;

public class WallPanel extends JPanel {

    private Cell[][] values = new Cell[40][22];

    public Cell[][] getValues() {
        return values;
    }

    public void setValues(Cell[][] values) {
        this.values = values;
    }

    public WallPanel() {
        for (int i = 0 ; i < this.values.length ; i++) {
            if(i == this.values.length - 1) {
                for (int j = 0 ; j < this.values[i].length ; j++) {
                    this.values[i][j] = new Cell(i, j, Color.BLACK,1);
                }
            } else {
                for (int j = 0 ; j < this.values[i].length ; j++) {
                    if(j == 0 || j == this.values[i].length - 1) {
                        this.values[i][j] = new Cell(i, j, Color.BLACK, 1);
                    }else {
                        this.values[i][j] = new Cell(i, j, new Color(0, 0, 0, 0));
                    }
                }
            }
        }
        this.setOpaque(true);
        this.setBounds(0, 0, Cell.WIDTH * 22, Cell.WIDTH * 40);
    }

    public void setWall(int x, int y, Color color) {
        values[y][x].setIsWall(1);
        values[y][x].setColor(color);
    }

    public void setWall(TetrisBlock block) {
        for (Cell cell : block.getCellList()) {
            setWall(cell.getCurrentCol(), cell.getCurrentRow(), cell.getColor());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        for (Cell[] row : this.values) {
            for(Cell c : row) {
                if(c == null) {
                    continue;
                }
                if(c.getIsWall() == 1) {
//                    System.out.println(c.getIsWall());
                    c.paintComponent(g);
                }
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
