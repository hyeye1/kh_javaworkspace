package com.kh.run;

import com.kh.first.B_ValuePrinter;

public class RunB {
	
	public static void main(String[] args) {
		
		// com.kh.first.B_ValuePrinter �� printValue �޼ҵ� ȣ��!
		
		// 1) Ŭ���� ����(new)
		//    Ŭ������ ������̸� = new Ŭ������();
		B_ValuePrinter b = new B_ValuePrinter();
		
		// 2) Ŭ�����ȿ��ִ� �޼ҵ� ȣ��(����)
		//    ������̸�.�����Ҹ޼ҵ�();
		//b.printValue();
		b.sumStringNumber();
		
	}

}
