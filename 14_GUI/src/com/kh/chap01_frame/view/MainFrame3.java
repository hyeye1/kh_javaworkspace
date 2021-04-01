package com.kh.chap01_frame.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame3 extends JFrame {
	
	public MainFrame3() {
		
		this.setBounds(200, 200, 500, 500);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		panel1.setBounds(0, 0, 250, 500);
		panel2.setBounds(250, 0, 250, 500);
		
		// setBackground를 통해 색상 지정 가능
		panel1.setBackground(Color.RED);
		panel2.setBackground(Color.BLUE);
		
		// JPanel 객체 생성 후 설정까지만 한다고 해서 자동 부착x
		// 현재 프레임에 직접 부착 해야됨! 추가해야됨
		this.add(panel1);
		this.add(panel2);
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
