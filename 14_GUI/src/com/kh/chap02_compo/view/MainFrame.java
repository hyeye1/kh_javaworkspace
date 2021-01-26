package com.kh.chap02_compo.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainFrame extends JFrame {
	
	public MainFrame() {
		this.setBounds(200, 200, 600, 300);
		
		JPanel panel = new JPanel();
		
		//JTextField : �⺻���� �ؽ�Ʈ�� �Է��� �� �ִ� ����
		JTextField id = new JTextField(20);
		panel.add(new JLabel("ID : "));
		panel.add(id);
		
		// JPasswordField :  ��й�ȣ�� �Է��� �� �ִ� ���� 
		JPasswordField pwd = new JPasswordField(20);
		panel.add(new JLabel("PWD : "));
		panel.add(pwd);
		
		// JTextArea : �������� �ؽ�Ʈ�� �Է��� �� �ִ� ����
		JTextArea info = new JTextArea(10, 30);
		panel.add(new JLabel("�ڱ�Ұ� : "));
		panel.add(info);
		
		//JButton : Ŭ�������� ��ư
		JButton button = new JButton("����");
		
		
		this.add(panel,"North");
		this.add(button,"South");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
