package com.kh.first; // ��Ű�� �����

public class A_MethodPrinter {
	
	// Ŭ���� ���� �ȿ� �������� �޼ҵ� �� �����ص� �� ����!!
	// �� ��ɺ��� "�Ϲݸ޼ҵ�" ������ �����غ���!
	// �Ϲݸ޼ҵ� : public void �޼ҵ��() { �ҽ��ڵ�; }
	
	// ���1 : "�ȳ��ϼ���~" ��� ������ ��½����ִ� ���� ����
	public void helloPrint() { // �޼ҵ���� �ҹ��ڷ� ����!
		System.out.println("�ȳ��ϼ���~");
		seeYouPrint();
		//goodByePrint();
	}
	
	// ���2 : "�ٽø�����~" ��� ������ ��½����ִ� ���� ����
	public void seeYouPrint() {
		System.out.println("�ٽø�����~");
		goodByePrint();
		
	}
	
	// ���3 : "�߰���~" ��� ������ ��½����ִ� ���� ����
	public void goodByePrint() {
		System.out.println("�߰���~");
	}
	
	/*
	 * �ش� Ŭ������ main�޼ҵ尡 ���⶧���� ��ٷ� ����Ұ�!!
	 * 
	 * => ����� Ŭ����(���θ޼ҵ带 �������ִ� Ŭ����)�� ������ ���� 
	 *    ���� �����ϰ��� �ϴ� �޼ҵ常�� ȣ���ذ��鼭 �����Ҳ���!
	 */

}



