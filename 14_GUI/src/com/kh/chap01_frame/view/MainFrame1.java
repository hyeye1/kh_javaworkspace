package com.kh.chap01_frame.view;

import javax.swing.JFrame;

// javax.swing.JFrame Ŭ������ ���ؼ� ������ ���� ����

// �������� �����ϴ� ���1.
// JFrame ��ü�� ���� ������ �� �� ������ ��ü�� �ϳ��� ���������� �δ� ���
// ������ ��ü�� ���ؼ� �������� ũ�� �� ��ġ ��� ����
public class MainFrame1 {
	
	public void showFrame() {
		
		//JFrame mainFrame = new JFrame(); // JFrame ��ü ����
		//mainFrame.setTitle("MainFrame1"); // ������ ������ ���� ����
		
		// JFrame ��ü ������ ���ÿ� ���� ����
		JFrame mainFrame = new JFrame("MainFrame1");
		
		mainFrame.setLocation(300, 200); // �������� �ߴ� ��ġ ���� (x, y)
		mainFrame.setSize(800, 500);     // ������ ũ�� ���� (width, height)
		
		
		mainFrame.setVisible(true); // â�� �������Բ� �ϴ� �޼ҵ�
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �ݱ� ��ư�� Ŭ�������� �Ϻ��ϰ� ���μ������� ����ǰ�
		
	}

}
