package com.company.view;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class Board extends JPanel {
	//private GridLayout

	public Board() {
		this.setBackground(Color.red);

		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				System.out.println("Something");
			}
		});
	}

	public enum State {
		PlayerX, PlayerO;
	}
}
