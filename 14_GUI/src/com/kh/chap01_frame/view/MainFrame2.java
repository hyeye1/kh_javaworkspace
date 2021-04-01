package com.kh.chap01_frame.view;

import javax.swing.JFrame;

// 프레임을 생성하는 방법2.
// javax.swing.JFrame 클래스를 상속 받아 기본생성자에서 프레임에 대한 설정 진행
public class MainFrame2 extends JFrame {
	
	public MainFrame2() {
		
		// 현재 이 객체 == this == 프레임
		//this.setLocation(300, 200);
		//this.setSize(800, 500);
		
		// 프레임 위치와 크기를 한번에 설정
		this.setBounds(300, 200, 800, 500);  // (x, y, width, height)
		
		this.setTitle("MainFrame2");
		
		// 프레임 사이즈 재조정 여부를 지정할 수 있는 (기본값이 true)
		this.setResizable(false);
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
