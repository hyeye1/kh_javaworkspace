package com.kh.chap04_field.model.vo;

// �ʵ���� ����������

public class FieldTest2 {
	
	/*
	 * �ʵ忡�� ��밡���� ���������� 4����
	 
	 (+)public		 => ��𼭵� (���� ��Ű��, �ٸ� ��Ű��) ���� ���� ������ ����
	 (#)protected 	 => ���� ��Ű�� ���� ���ٰ��� + ���� �ٸ���Ű����� ��ӱ���(�θ��ڽİ��� ����)������ �������ٰ���
	 (~)default	 => ���� ��Ű�������� ���� ���ٰ���
	 (-)private 	 => only �ش� �� Ŭ���������� ���ٰ���  
	 
	 */
	
	public String pub = "public"; 
	protected String pro = "protected";
	/*default*/ String def = "default";
	private String pri = "private";
	
	public static String sta = "fieldTest2 static����";
}
