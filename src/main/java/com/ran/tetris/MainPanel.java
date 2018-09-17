package com.ran.tetris;

import com.ran.tetris.block.I;
import com.ran.tetris.block.J;
import com.ran.tetris.block.O;

import javax.swing.*;

public class MainPanel extends JFrame {

    public static void main(String[] args) {
        MainPanel mainPanel = new MainPanel();
        mainPanel.init();
    }

    public void init() {
        this.setSize(400, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        O o = new O();
        this.add(o);
    }

}
