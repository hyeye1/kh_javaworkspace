package com.kh.chap01_frame.view;

import javax.swing.JFrame;

//������ �����ϴ� ��� 2
// javax.swing.JFrameŬ������ ��ӹ޾� �⺻�����ڿ��� �����ӿ� ���� ���� ����
public class MainFrame2 extends JFrame {
	
	public MainFrame2() {
		
		// ���� �� ��ü == this == ������
		//this.setLocation(300, 200);
		//this.setSize(800, 500);
		
		// ������ ��ġ�� ũ�� �ѹ��� ����
		this.setBounds(300, 200, 800, 500); // (x, y, width, height)
		
		this.setTitle("��"); // ������
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
