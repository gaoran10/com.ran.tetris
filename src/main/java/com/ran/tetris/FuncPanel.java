package com.ran.tetris;

import javax.swing.*;
import java.awt.*;

public class FuncPanel extends JPanel {

    private Integer clearRows;

    private Integer score;

    public FuncPanel() {
        this.clearRows = 0;
        this.score = 0;

        JPanel scorePanel = new JPanel();
        scorePanel.setSize(200, 200);
        scorePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        JLabel clearRowsLabel = new JLabel();
        clearRowsLabel.setText("消除行数: " + this.clearRows);
        scorePanel.add(BorderLayout.CENTER, clearRowsLabel);

        JLabel scoreLabel = new JLabel();
        scoreLabel.setText("得分: " + this.score);
        scorePanel.add(BorderLayout.CENTER, scoreLabel);

        this.add(scorePanel);
    }

}
