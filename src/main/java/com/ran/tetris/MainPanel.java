package com.ran.tetris;


import com.ran.tetris.block.I;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class MainPanel extends JFrame {

    private WallPanel wallPanel;
    private TetrisBlock activeBlock;
    private JLayeredPane mainPane = new JLayeredPane();

    public static void main(String[] args) throws InterruptedException {
        MainPanel mainPanel = new MainPanel();
        mainPanel.init();
    }

    public void init() throws InterruptedException {
        this.setSize(Cell.WIDTH * 23, Cell.HEIGHT * 42);
        this.setTitle("TETRIS");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                switch (e.getKeyCode()) {
                    case 37:
                        activeBlock.moveLeft(wallPanel);
                        break;
                    case 38:
                        activeBlock.change();
                        break;
                    case 39:
                        activeBlock.moveRight(wallPanel);
                        break;
                    case 40:
                        activeBlock.moveDown(wallPanel);
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });



        wallPanel = new WallPanel();
        wallPanel.setOpaque(true);
        mainPane.add(wallPanel, 10);

//        for (int i = 0 ; i < 10 ; i++) {
//            Thread.sleep(600L);
//            block.moveDown(wallPanel);
//        }

        this.setLayeredPane(mainPane);
        this.setVisible(true);

        while (activeBlock == null) {
//            activeBlock = TetrisBlock.randomBlock();
            activeBlock = new I();
            activeBlock.setOpaque(true);
            activeBlock.setBounds(0, 0, 400, 400);
            mainPane.add(activeBlock, 20);

            boolean couldDown = true;
            while (couldDown) {
                Thread.sleep(500L);
                couldDown = activeBlock.moveDown(wallPanel);
            }
            wallPanel.setWall(activeBlock);
            activeBlock.destroy();
            mainPane.remove(activeBlock);
            activeBlock = null;
        }

    }

}
