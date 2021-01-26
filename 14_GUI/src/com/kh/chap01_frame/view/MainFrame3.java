package com.kh.chap01_frame.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame3 extends JFrame {
	
	public MainFrame3() {
		this.setBounds(200, 200, 500, 500);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
