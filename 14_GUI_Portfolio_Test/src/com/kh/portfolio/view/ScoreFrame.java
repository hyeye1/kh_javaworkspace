package com.kh.portfolio.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScoreFrame extends javax.swing.JFrame {
	
	public ScoreFrame() {
		this.setBounds(200, 200, 400, 200); 
		
		this.setTitle("��Ʈ����������"); 
		this.setResizable(false);
		
		JPanel inputPanel = new JPanel();
		JPanel resultPanel = new JPanel();
		
		JTextField num1 = new JTextField(10);
		JTextField num2 = new JTextField(10);
		
		inputPanel.add(new JLabel("�ڹ� : "));
		inputPanel.add(num1);
		
		inputPanel.add(new JLabel("SQL : "));
		inputPanel.add(num2);
		
		JPanel btnPanel = new JPanel();
		JButton valueBtn = new JButton("����ϱ�");
		btnPanel.add(valueBtn);
		
		inputPanel.add(btnPanel);
		  
		JTextField sum = new JTextField(10);
		resultPanel.add(new JLabel("���� : "));
		resultPanel.add(sum);
		
		JTextField avg = new JTextField(10);
		resultPanel.add(new JLabel("��� : "));
		resultPanel.add(avg);
		
		valueBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int value1 = Integer.parseInt( num1.getText() );
				int value2 = Integer.parseInt( num2.getText() );
				
				sum.setText(value1 + value2 + "");
				avg.setText((value1 + value2)/2 + "" );
			}
		});
		
		
		
		JLabel title = new JLabel("������ �Է��ϼ���",0);
		
		this.add(title, "North");
		this.add(inputPanel, "Center");
		this.add(resultPanel, "South");
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

}
