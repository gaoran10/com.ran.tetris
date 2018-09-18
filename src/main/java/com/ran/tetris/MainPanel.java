package com.ran.tetris;

import com.ran.tetris.block.*;

import javax.swing.*;

public class MainPanel extends JFrame {

    public static void main(String[] args) throws InterruptedException {
        MainPanel mainPanel = new MainPanel();
        mainPanel.init();
    }

    public void init() throws InterruptedException {
        this.setSize(Cell.WIDTH * 20, Cell.HEIGHT * 40);
        this.setTitle("TETRIS");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        WallPanel wallPanel = new WallPanel();
        this.add(wallPanel);
        this.setComponentZOrder(wallPanel, 1);
        this.setVisible(true);

        S block = new S();
        this.add(block);
        this.setComponentZOrder(block, 1);

        for (int i = 0 ; i < 39 ; i++) {
            Thread.sleep(300L);
            block.moveDown();
        }

    }

}
