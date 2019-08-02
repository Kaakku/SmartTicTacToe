package com.company;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

import com.company.view.Board;

import javafx.scene.control.SplitPane;

public class TicTacToe {
    final int frameWidth = 500;
    final int frameHeight = 400;
    final int margin = 20;
    public static boolean RIGHT_TO_LEFT = false;

    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome to The Smart Tictactoe");

        new TicTacToe().init();
    }

    public static void addComponentsToPane(Container pane) {
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(
                    java.awt.ComponentOrientation.RIGHT_TO_LEFT);
        }
        JPanel test = new JPanel();
        test.setBackground(Color.BLUE);
        pane.add(test, BorderLayout.WEST);
        JButton newGame1 = new JButton("New game1");
        pane.add(newGame1, BorderLayout.WEST);
        JButton newGame2 = new JButton("New game2");
        pane.add(newGame2, BorderLayout.WEST);
        JButton newGame3 = new JButton("New game3");
        JButton newGame4 = new JButton("New game4");
        newGame1.

        pane.add(newGame3, BorderLayout.EAST);
        pane.add(newGame4, BorderLayout.CENTER);
    }

    private void init() {
        JFrame frame = new JFrame();
        frame.setTitle("This is a title");

        frame.setSize(500, 400);
        frame.setResizable(false);
        //frame.setLocationByPlatform(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        addComponentsToPane(frame.getContentPane());
        //frame.pack();













/*
        Container mainContainer = new frame.getContentPane();
        mainContainer.setBackground(Color.green);
        mainContainer.setLayout(new BorderLayout());
        mainContainer.setBorder(BorderFactory.createEmptyBorder(margin, margin, margin, margin));

        Board board = new Board();
        mainContainer.add(board);
        mainContainer.repaint(12,30, 20,50);


        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.black);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(margin *2, frameWidth - 100, margin *2, margin *2));
        buttonPanel.add(newGame1);
        buttonPanel.add(newGame2);
        buttonPanel.add(newGame3);


        JButton newGame4 = new JButton("Game area");

        JPanel gameArea = new JPanel();
        gameArea.setBackground(Color.magenta);
        gameArea.add(newGame4);
        SplitPane mainFrame = new SplitPane();
        mainFrame.
        splitPaneV = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

        frame.add(mainContainer);
        //mainContainer.add(buttonPanel, BorderLayout.EAST);
        mainContainer.add(gameArea, BorderLayout.WEST);*/
    }
}
