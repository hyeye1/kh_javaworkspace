package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	public void method() {
		
		String str = "java,oracle,jdbc,html,server,Spring";
		
		//�����ڸ� �����ؼ� �ش� ���ڿ� �и���Ű�� ���
		
		//���1. �и��� ���ڿ����� String[] ���������Ƽ� �����ϰ��� �� ��
		//       ���ڿ�.split(String ������) : String[]
		String[] arr = str.split(",");
		
		//for(int i=0; i<arr.length; i++) {
		//	System.out.println(arr[i]);
		//}
		
		for( String s : arr ) {
			System.out.println(s);
		}
		
		System.out.println("=========");
		
		// ���2. �и��� ������ ���ڿ����� ��ū���� ����ϰ� ������
		// 		  java.util.StringTokenizer Ŭ������ �̿��ϴ¹��
		// 		  StringTokenizer stn = new StringTokenizer(�и���Ű�����ϴ� ���ڿ�, ������);
		//StringTokenizer stn = new StringTokenizer();
		
	}

}
