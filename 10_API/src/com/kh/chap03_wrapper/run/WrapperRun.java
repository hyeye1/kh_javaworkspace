package com.kh.chap03_wrapper.run;

public class WrapperRun {

	public static void main(String[] args) {
		/*
		 * // Wrapper Ŭ����
		 *=> �⺻�ڷ����� ��ü�� �������ִ� Ŭ�������� ����Ŭ���������
		 *
		 *
		 *		�⺻�ڷ���		wrapperŬ����
		 *		  boolean <---> Boolean
		 *		  char    <---> Character
		 *		  byte	  <---> Byte
		 *		  short   <---> Short
		 *		   int    <---> Integer
		 *		  long    <---> Long
		 *		  float   <---> Float
		 *		 double   <---> Double
		 *
		 *
		 */
		int num1 = 10;
		int num2 = 15;
		
		//System.out.println(num1.equals(num2));
		//System.out.println(num1.hashCode());
		
		// �⺻�ڷ��� ==> Wrapper �ڷ��� Boxing
		Integer i1 = num1;
		Integer i2 = num2;
		
		System.out.println(i1.equals(i2));
		
		// Wrapper �ڷ��� ==> �⺻�ڷ��� unboxing
		int num3 = i1;
		int num4 = i2; 
			
		System.out.println("===========");
		
		//�⺻�ڷ��� <---> String
		
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2);
		
		// 1, String => �⺻�ڷ��� : �Ľ��Ѵ�.
		int i = Integer.parseInt(str1); // "10" => 10
		double d = Double.parseDouble(str2); // "15.3" => 15.3
		
		System.out.println( i+d );
		
		//2. �⺻�ڷ��� ==> String
		// 		10     ==> "10"
		//     15.3    ==> "15.3"
		
		// String.valueOf(��ȯ�ұ⺻�ڷ���) : String
		String strI = String.valueOf(i); 
		String strD = String.valueOf(d);
		
		
		
		
	}

}
