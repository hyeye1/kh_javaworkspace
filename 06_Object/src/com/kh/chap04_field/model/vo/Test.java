package com.kh.chap04_field.model.vo;

// fieldRun�� �ٸ���  ���� ��Ű���� ������?

public class Test {
	
	public static void main(String[] args) {
		
		
		//========FieldTest 2 �׽�Ʈ ===========
		FieldTest2 f2 = new FieldTest2();
		
		//public = ��𼭵� ���ٰ���
		System.out.println(f2.pub);
		
		//protected => ���� ��Ű�� ���ٰ��� �ٸ���Ű���� ��ӱ��������� ���ٰ���
		System.out.println(f2.pro); // ������Ű�� ���ٰ���
		
		// default => ���� ��Ű�������� ���ٰ���
		System.out.println(f2.def); // ������Ű�� ���ٰ���
		
		// private => ���� Ŭ���������� ���ٰ���
		//System.out.println(f2.pri); // getter�޼ҵ�� �� ����
	}

}
