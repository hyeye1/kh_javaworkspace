package com.kh.variable;

public class D_Casting {
	
	// 형변환 : 값의 자료형을 바꾸는 것 
	/*
	 * * 컴퓨터에서의 값 처리 규칙
	 * 1. 대입 연산자(=)를 기준으로 왼쪽과 오른쪽은 같은 자료형이여야된다.
	 *    => 즉, 같은 자료형에 해당하는 값만 대입 가능함! 
	 *    => 다른 자료형의 값을 대입하고자 한다면 "형변환"이 필수!!
	 *    
	 *    자료형 변수명 = (자료형)값;
	 *    
	 * 2. 같은 자료형끼리만 연산이 가능, 뿐만 아니라 연산결과도 같은 자료형으로 나옴!
	 *    값 + (자료형)값
	 * 
	 * * 형변환 종류
	 * 1. 자동 형변환 => 자동으로 형변환이 진행되기 때문에 내가 직접 형변환 할 필요 없음
	 * 
	 * 2. 강제(명시적) 형변환 => 자동 형변환이 되지 않아 내가 직접 형변환을 해야됨
	 *    [표현법]   (바꿀자료형)값
	 *    
	 *    (바꿀자료형)을 cast연산자 즉, 형변환 연산자 라고 함
	 * 
	 * * 주의사항
	 * - boolean은 형변환이 불가 (즉, true 또는 false값만을 가질 수 있음)
	 */
	
	// 자동 형변환
	public void autoCasting() {
		
		/*
		 * * 자동 형변환
		 * 사이즈가 작은 자료형과 큰 자료형 간의 연산(대입, 계산 등)시
		 * 자동으로 작은 자료형이 큰 자료형을 변환됨
		 */
		
		// 1. int(4byte) --> double(8byte)
		int i1 = 10;
		double d1 = /*(double)*/i1; // 10 => 10.0
		
		System.out.println("d1 : " + d1);
		
		
		int i2 = 12;
		double d2 = 3.3;
		
		double result = /*(double)*/i2 + d2; // 12.0 + 3.3 => 15.3
		
		System.out.println("result : " + result);
		
		
		// int(4byte) --> long(8byte)
		int i3 = 1000;
		long l3 = /*(long)*/i3;
		
		System.out.println("l3 : " + l3);
		
		int i4 = 22345;
		long l4 = 154678795L;
		
		long result2 = /*(long)*/i4 + l4;
		
		System.out.println("result2 : " + result2);
		
		
		// 특이 3. long(8byte) --> float(4byte) 
		// float이 long형 보다 담을 수 있는 값의 범위가 더 큼
		long l5 = 10000000000L;
		float f5 = /*(float)*/l5; // 10000000000.0
		System.out.println("f5 : " + f5);
		
		// char => 0~65xxx
		// 특이 4. char(2byte) <--> int(4byte)
		char ch = 65; // 'A'
		System.out.println("ch : " + ch);
		
		//ch = -65; // 음수값은 저장 불가 
		
		int num = 'A';
		System.out.println("num : " + num);
		
		// 각 문자마다의 고유한 숫자가 정해져있음!
		// 아스키코드표(0~127, 영문/숫자/특수문자), 유니코드표(0~65xxx, 영문/숫자/특수문자/한글)
		
		System.out.println((int)'강');
		
		//int sum = 'A' + 10;
		char sum = 'A' + 10;
		System.out.println("sum : " + sum);
		
		
		// 특이 5. byte, short 간의 연산
		byte b1 = 1;
		byte b2 = 10;
		
		//byte result3 = b1 + b2; // 에러 발생 => byte나 short로 연산시 무조건 int(4byte)로 처리
		byte result3 = (byte)(b1 + b2); // => 강제로 형변환 하면 저장 가능
		System.out.println("result3 : " + result3);	
		
	}
	
	
	// 강제형변환
	public void forceCasting() {
		
		// 강제형변환 : 큰 크기의 자료형을 작은 크기의 자료형으로 바꾸는거 
		
		// double(8byte) --> float(4byte)
		float f = 4.0f;
		System.out.println("f : " + f);
		
		double d2 = 4.0;
		float f2 = (float)d2;
		System.out.println("f2 : " + f2);
		
		// double(8byte) --> int(4byte)
		double d3 = 10.89;
		int i3 = (int)d3;
		System.out.println("i3 : " + i3);
		
		int iNum = 10;
		double dNum = 5.89;
		
		//int iSum = iNum + dNum; // 10.0 + 5.89 => 15.89 double형
		
		// 해결방법1. 수행 결과를 int형으로 강제형변환
		int iSum = (int)(iNum + dNum); // (int)15.89 => 15
		System.out.println("iSum : " + iSum);
		// 실수형을 정수형으로 강제형변환시 => 데이터 손실이 발생할 수 있음!! 
		
		// 해결방법2. dNum값만 int형으로 강제형변환
		int iSum2 = iNum + (int)dNum; // 10 + 5 => 15 int형
		System.out.println("iSum2 : " + iSum2);
		
		// 해결방법3. 그냥 연산결과를 double로 담기
		double dSum = iNum + dNum;
		System.out.println("dSum : " + dSum);
		
		
		
		
		
	}
	
	
	
	

}
