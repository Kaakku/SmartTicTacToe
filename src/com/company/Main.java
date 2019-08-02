package com.company;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome to The Smart Tictactoe");

        new Main().init();
    }
    private void init() {
        JFrame frame = new JFrame();
        frame.setTitle("This is a title");

        JPanel container = new JPanel();
        container.setBackground(Color.GRAY);
        container.setLayout(new BorderLayout());
        frame.add(container);
        container.setBorder(BorderFactory.createEmptyBorder(22,22,22,22));

        frame.pack();
        frame.setResizable(false);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
}
