package com.kh.chap01_frame.view;

import javax.swing.JFrame;

//프레임 생성하는 방법 2
// javax.swing.JFrame클래스를 상속받아 기본생성자에서 프레임에 대한 설정 진행
public class MainFrame2 extends JFrame {
	
	public MainFrame2() {
		
		// 현재 이 객체 == this == 프레임
		//this.setLocation(300, 200);
		//this.setSize(800, 500);
		
		// 프레임 위치와 크기 한번에 설정
		this.setBounds(300, 200, 800, 500); // (x, y, width, height)
		
		this.setTitle("혜"); // 제목설정
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
