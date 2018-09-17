package com.ran.tetris;

import java.awt.*;

public class Cell extends Canvas {

    private static int WIDTH = 20;
    private static int HEIGHT = 20;

    private Integer row;

    private Integer col;

    private Color color;

    public Cell(Integer row, Integer col, Color color) {
        this.row = row;
        this.col = col;
        this.color = color;
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

    public void paint(Graphics g) {
        System.out.println("X: " + this.col * WIDTH + ", Y: " + this.row * HEIGHT);
        g.drawRect(this.col * WIDTH, this.row * HEIGHT, WIDTH, HEIGHT);
        g.setColor(this.color);
        g.fillRect(this.col * WIDTH, this.row * HEIGHT, WIDTH, HEIGHT);
    }

}
