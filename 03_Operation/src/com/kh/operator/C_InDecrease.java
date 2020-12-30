package com.kh.operator;

public class C_InDecrease {
	
	/*
	 * * ���������� (++, --)
	 * ++ : ���� 1������Ű�� ������
	 *      ++�� (��������), ��++ (��������)
	 *      
	 * -- : ���� 1���ҽ�Ű�� ����
	 *      --�� (��������), ��-- (��������)     
	 * 
	 * (����������)�� : ���� ���� => ������ ��ó��
	 * ��(����������) : ���� ���� => ��ó�� ������
	 * 
	 */
	
	public void method1() {
		
		// ���� ����
		int a = 10; 
		int b = ++a; // a = a+1   =>    b = a
		
		//a++;
		//++a;  
		
		// a : xx, b : xx
		System.out.println("a : " + a + ", b : " + b);
		
		// ���� ����
		int c = 10;
		int d = c++; // d = c   =>  c = c+1
		
		// c : xx, d : xx
		System.out.printf("c : %d, d : %d\n", c, d);
		
		System.out.println("================");
		
		int num = 20;
		
		System.out.println("���� num : " + num); 	// num=20
		System.out.println("++num : " + ++num);	// num=21
		System.out.println("num++ : " + num++);	// num=21(22)
		System.out.println("--num : " + --num);	// num=21
		System.out.println("num-- : " + num--);	// num=21(20)
		System.out.println("���� num : " + num); 	// num=20
		
	}
	
	public void method2() {
		
		int num1 = 20;
		int result1 = num1++ * 3;	// 20(21) * 3
									// result1 = 60, num1 = 21
		
		System.out.println("num1 : " + num1);
		System.out.println("result1 : " + result1);
		
		
		int num2 = 20;
		int result2 = ++num2 * 3; // 21 * 3
								  // result2 = 63, num2 = 21
		
		System.out.println("num2 : " + num2);
		System.out.println("result2 : " + result2);
		
	}
	
	public void method3() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++); // a=10(11)	=> 10��� 
		
		System.out.println((++a) + (b++)); // a=12  b=20(21)	=> 32���
		
		System.out.println((a++) + (--b) + (--c)); // a=12(13) b=20 c=29 => 61���
		
		System.out.println("a : " + a); // 13
		System.out.println("b : " + b); // 20
		System.out.println("c : " + c); // 29
		
	}

	
}






