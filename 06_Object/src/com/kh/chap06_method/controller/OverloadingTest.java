package com.kh.chap06_method.controller;

public class OverloadingTest {
	
	//�����ε� : �� Ŭ���� ���� ���� �̸��� �޼ҵ������ ������ ������ �� �ִ� ���
	
	public void test() {
	
	}
	
	public void test(int a) {
		// �Ű�����
	}
	
	public void test(int a, String s) {
		
	}
	
	public void test(String s, int a) {
		
	}
	
	public void test(int a, int b) {
		
	}
	
	//public void test(int c, int d) {
	//	
	//}       -> error : �Ű���������� ������� �ڷ����� ������ ���� �ߺ��ȵ�
	
	//public int test(int a, int b) {
		//
	//} -> error: ��ȯ���� ������� 

}
