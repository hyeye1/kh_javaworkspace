package com.kh.chap01_frame.view;

import javax.swing.JFrame;

// javax.swing.JFrame 클래스를 통해서 프레인 생성가능

// 프레임을 생성하는 방법 1.
// JFrame 객체를 직접 생성한 후 그 생성된 객체를 하나의 프레임으로 두는 방법
// 생성된 객체를 통해서 프레임의 크기 및 위치 등등 변경

public class MainFrame1 {
	
	public void showFrame() {
		
		// JFrame mainFrame = new JFrame(); // JFrame 객체 ㅅ ㅐㅇ성
		// mainFrame.setTitle("MainFrame1"); // 생성된 프레임 제목 설정
		
		// JFrame 객체생성과 동시에 제목설정
		JFrame mainFrame = new JFrame("MainFrame1");
		
		mainFrame.setLocation(300, 200); // 프레임이 뜨는 위치 설정 (x,y)
		mainFrame.setSize(800,500); 	// 프레임 크기설정(width, height)
		
		
		
	}

}
