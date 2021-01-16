package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	
	// String�� ��� Ŭ�����̴�=> �Һ�Ŭ����: �������ʴ� Ŭ����
	// 						�����ϴ� ���� ������ ���� ����ִ� �������� �������� �ʴ´�
	
	// 1. �����ڸ� ���� ���ڿ� ���
	public void method1() {
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1 == str2); // false
		
		System.out.println(str1);
		System.out.println(str2/*.toString*/);
		// toString() => String Ŭ������ �̹� �������̵� �Ǿ����� (���� ����ִ� ���ڿ� ��ȯ)
		
		System.out.println(str1.equals(str2)); // ���� ����ִ� ���ڿ� ��
		//equals() => String Ŭ������ �̹� �������̵� �Ǿ�����(�ּҰ� �񱳾ƴ� ���� ��� ���ڿ��� ��)
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// hashCode() => String Ŭ������ �̹� �������̵� �Ǿ����� (�ּҰ� ����̾ƴ� ���� ���ڿ� ������� �ؽ��ڵ� ���� ���� ��ȯ)
		//������ �ּҰ����ٸ�!!!! 
		//Ȯ���Ϸ���? System.identityHashCode(���۷���)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

		
	}
	
	public void method2() {
		
		String str2 = "hello";
		String str1 = "hello";
	}

}
