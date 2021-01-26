package com.kh.chap03_event.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends javax.swing.JFrame {
	
	public MainFrame() {
		
		this.setBounds(200, 200, 300, 200);
		
		this.setTitle("����");
		this.setResizable(false);
		
		
		JPanel inputPanel = new JPanel(); // ����ڿ��� ���� �Է¹޴� �Է¿� �г�
		JPanel resultPanel = new JPanel(); // ����ڿ��� ������� ������ִ� ��¿� �г�
		
		// �Է¿� �г�(inputPanel)�� ������ ����
		JTextField num1 = new JTextField(15);
		JTextField num2 = new JTextField(15);
		
		inputPanel.add(new JLabel("ù��° ���� : "));
		inputPanel.add(num1);
		
		inputPanel.add(new JLabel("�ι�° ���� : "));
		inputPanel.add(num2);
		
		JPanel btnPanel = new JPanel();
		
		JButton plusBtn = new JButton("+");
		JButton minusBtn = new JButton("-");
		
		btnPanel.add(plusBtn);
		btnPanel.add(minusBtn);
		
		inputPanel.add(btnPanel);
		
		//����� �г�( resultPanel)
		JTextField result = new JTextField(15);
		resultPanel.add(new JLabel("��� : "));
		resultPanel.add(result);
		
		
		// ����ư�� �̺�Ʈ �ɾ��ֱ�(�̺�Ʈ����)
		// plusBtn Ŭ���� => �ΰ��� ������ ������ �� �������� �� ��� �� result �ؽ�Ʈ���ڿ� ���
		plusBtn.addActionListener(new ActionListener() {//�������̽�(�ȿ� �̿ϼ��޼ҵ��ִ�) �̱� ������ ��ٷ� ������ �Ұ�
														// �� ���⼭ ������ �ϰ�ʹٸ� �̿ϼ��� �� 
														// �ϼ���Ű�鼭 �����ϸ�� (�͸�Ŭ���� ���)
			@Override
			public void actionPerformed(ActionEvent e) {
				// plusBtn Ŭ���� ������ ����
				int value1 = Integer.parseInt( num1.getText() ); //"10"=> 10 �Ľ��ϱ�
				int value2 = Integer.parseInt( num2.getText() );  // getText: ��������\
				
				result.setText(value1 + value2 + ""); // setText: �����ϱ�
				
				//�ؽ�Ʈ�ʵ�.getText() : String => �ش� �ؽ�Ʈ�ʵ忡 �ۼ��� ���� �������� �޼ҵ�
				//�ؽ�Ʈ�ʵ�.setText(String)    => �ش� �ؽ�Ʈ�ʵ��� ���� �������ִ� �޼ҵ�
			} 
			
		});
		
		
		
		// minusBtn Ŭ���� => �ΰ��� ������ ������ �� �������� �� ����ø� result �ؽ�Ʈ���ڿ� ��
		minusBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//minus ������ ����
				result.setText(Integer.parseInt(num1.getText()) - Integer.parseInt(num2.getText()) + "");
				
			}
			
		});
		
		
		
		
		
		
		
		JLabel title = new JLabel("�ΰ��� ������ �Է��Ͻÿ�", 0);
		
		this.add(title, "North");
		this.add(inputPanel, "Center");
		this.add(resultPanel, "South");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
