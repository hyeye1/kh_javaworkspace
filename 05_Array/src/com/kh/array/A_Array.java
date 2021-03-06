package com.kh.array;

import java.util.Scanner;

public class A_Array {
	
	/*
	변수: 자료형의 값 "하나"만을 담을 수 있는 값
			ex. int a = 10;
					a = 20; => 10은 20으로 덮어씌어진다
	
	배열: 같은 자료형의 변수 "여러개"를 담을 수 있는 값
			각 방마다 인덱스가 지정됨(인덱스 0부터시작)
			ex. int[] b = new int[5]; // int b라는 배열이 만들준다, 
		
	
	 */
	
	public void method1() {
		
		// * 배열을 왜 써야할까?
		
		/*
		// ex. 변수만을 가지고 프로그래밍을 하게될때:
		// 0, 1, 2, 3, 4, 데이터를 기록하기 위해선
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		// 출력할 때? 하나하나씩 출력해야 된다.
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		//==> 반복문 이용안됨; 왜냐면 변수의 이름이 다 다르기 때문에 num + i 라는 식으로 표현해줄수 없음 
		
		//총 합계를 구할땐? 마찬가지로 반복문 안됨
		int sum = num1 + num2 + num3 + num4 + num5;
		System.out.println("총 합계 : " + sum);
		*/

		//배열을 가지고 프로그래밍하기
		/*
		1. 배열 선언 (여러개의 값들을 보관할 배열을 만들거야!)
			자료형 배열명 []; 
			자료형 [] 배열명;

		int arr[]; 
		or   
		int[] arr;

		int a ; // 변수선언
		 */
		/*
		 2. 배열 할당
			이 배열에 몇 개의 값들을 보관할건지 크기를 지정하는 과정  == 그 갯수만큼 방이 만들어진다.
			배열명 = new 자료형[];
		arr = new int[5];
		 */
			
		//*3. 배열 선언과 동시에 할당 	
		 int[] arr = new int[5];
		 
		 /*
		  3. 각 인덱스에 값 대입
		  	 배열명[인덱스] = 값;
		  */
		 /*
		 arr[0] = 0;
		 arr[1] = 1;
		 arr[2] = 2;
		 arr[3] = 3;
		 arr[4] = 4;
		 */
		 //배열의 가장 큰 장점이라고 한다면, 반복문을 활용할 수 있다.
		 //for(int i=0; i<=4; i++) { //0에서부터 4(마지막인덱스==배열의크리 -1)까지 매번 1씩 증가하는 동안 반복 수행
		 //for(int i=0; i<=arr.length-1; i++) {
		 for(int i=0; i<arr.length; i++) {
			 arr[i] = i;
		 }
		 
		 //System.out.println(arr[0]);
		 for(int i=0; i<arr.length; i++) {
			 System.out.println(arr[i]);
		 }

	}
	
	public void method2() {
		
		int i = 10;
		
		int [] iArr = new int[5];
		System.out.println("i : " + i);
		System.out.println("iArr : " + iArr);
		System.out.println("iArr의 해쉬코드 : " +iArr.hashCode());
		
		double[] dArr = new double[3];
		
		System.out.println("dArr : " + dArr);
		System.out.println("dArr의 해쉬코드 : " + dArr.hashCode());
		
		/*
		 실제 값을 바로 담을 수 있는 변수를 일반 변수라고 얘기하고
		 주소값을 담고있는 변수는 참조변수 라고 표현한다
		 
		 기본자료형 ( boolean, char, byte, short, int, long, float, double)으로 선언한 변수
		 => 일반 변수 => 실제 값을 바로 담을 수 있는 변수
		 
		 그 외 자료형 (int[], double[], char[], short[], String ... , Scanner, Class)으로 선언된 변수
		 => 참조 변수(레퍼런스 변수) => 주소값을 담고있는 변수 
 
		 */
		
	}
	
	public void method3() {
		
		int[] iArr = new int[3]; 
		double[] dArr = new double[5];
		
		System.out.println("iArr배열의 크기 : " + iArr.length);
		System.out.println("dArr배열의 크기 : " + dArr.length);
		
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		for(int i=0; i<dArr.length; i++) {
			System.out.println(dArr[i]);
		}
		
		/*
		 * 각각의 인덱스에 값을 대입하지 않았음에도 불구하고 뭔가 담겨있음!
		 * 왜? heap은 절대 빈 공간이 존재할 수 없음!
		 * => jvm이 기본값으로 초기화를 진행해줌
		 */
		
	}
	
	public void method4() {
		
		int[] iArr = new int[5];
		
		/*
		 * iArr[0] = 1;
		 * iArr[1] = 2;
		 * iArr[2] = 3;
		 * iArr[3] = 4;
		 * iArr[4] = 5;
		 */
		
		
		//값 대입용
		for(int i =0; i<iArr.length; i++) {
			iArr[i] = i + 1;
		}
		
		//총 합계 구할겸 출력
		int sum = 0;
		
		/*
		 sum += iArr[0];
		 sum += iArr[1];
		 .
		 .
		 .
		 */
		for(int i=0; i<iArr.length; i++) {
			sum += iArr[i];
			System.out.print(iArr[i] + " ");
		}
		
		System.out.println("\n총 합계 : " + sum);
		
		System.out.println(iArr); //주소값
		System.out.println(iArr.hashCode()); // hashCode == 주소값의 10진수형태
		
		
	}
	
	/*
	 * 메모리에는 총 stack heap static 영역이 있다
	 * 기본자료형이아닌 그 외의 자료형은 주소값이 담기는 박스/ stack에
	 *
	 * new를 만나는 순간 heap에 방이 만들어짐 (int방이 5개면/4바이트/4바이트/4/4/4/)
	 * 주소값이 담김(참조 한다 , 해서 참조변수라고부름)
	 * 
	 *  
	 */
	

	
	//배열의 가장큰 단점
	public void method5() {
		
		int[] iArr = new int[5]; //int 배열을 만들고 5개를 담을 예정
		
		//만약 배열에 2, 4, 6, 8, 10 을 담고싶다면?
		int value = 2; //처음에 2 부터 담기위해
		for(int i=0; i<iArr.length; i++) {
			iArr[i] = value; //순차적으로 돌면서 (반복하면서) 인덱스에 숫자를 담는다. 
			value += 2;  // i에 value값 대입하고=> 2 증가시키고 또 대입하고 2증가시키고 반복
		}
		
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		System.out.println(iArr); //숫자로 변경? hashCode
		System.out.println("iArr의 해쉬코드 값 :  " + iArr.hashCode());
		
		//iArr[5] = 12;
		// 배열의 가장 큰 단점
		// 한번 지정한 배열의 크기는 변경이 불가하다
		// => 배열의 크기를 변경하고자 한다면 어쩔수없이 다시 만들어줘야 한다.
		iArr = new int[7];
		
		System.out.println("====변경 후 ====");
		System.out.println("iArr의 해쉬코드 값: " + iArr.hashCode());
			// iArr이라는 배열이 다시 new(선언) 되었고, 이전의 배열값은 사라졌다. 각 인덱스의 값도 다시 0으로 초기화
			// 기존의 배열값은 새로운 배열이 선언됨과 동시에 참조형 연결이 끊어졌고, 메모리안에 남아있던 값은 자동으로 삭제된다.
			// -> 자바의 특징중 하나 : 자동 메모리관리 (garbage collection)
		
			// 지금 연결되어있는 고리를 끊고자 한다면?
			iArr = null;
					
			System.out.println(iArr);
			
			
			/*
			String str = null;
			int i = 0;
			double d = 0.0;
			*/

		
	}
	
	public void method6() {
		
		int num = 10; 
		
		int[] arr = new int [3];
		
		arr[0] = 100;
		System.out.println(arr[0]);
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = 100;
		}
		
		arr = new int[5];
		
	}
		
	public void method7() {
		int [] arr = new int[10];
		
		//0번 인덱스에서부터 마지막 인덱스까지 51~100사이의 랜덤값
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 50 + 51);
		}
		for(int i = 0; i<arr.length; i++) {
			// arr[x] : 57
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}
	}
	
	public void method9() {
		double[] arr = new double[3];
		
		Scanner sc = new Scanner(System.in);
		
		double[] heights = new double[3];
		
		for(int i = 0; i<arr.length; i++) {
			
			System.out.print("키 입력: ");
			heights[i] = sc.nextDouble();
			
		}
		
		double sum = 0;
		for(int i = 0 ; i<heights.length; i++) {
			System.out.println(heights[i]);
			sum += heights[i];
		}
		
		//System.out.println("세명의 키의 총 합계 : " + sum);
		//System.out.println("세명의 키의 평균 : " + sum/heights.length);
		
		System.out.printf("세명의 키의 총 합계 : %.1f\n", sum);
		System.out.printf("세명의 키의 평균: %.1f\n", sum/heights.length);
	}	
	
	public void method10() {
		
		//사용자에게 문자열 입력받은 후
		//각 문자들을 char배열에 담기
		
		//1. 사용자에게 문자열 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		//2. char배열 생성해두기 (배열 크기 === 문자열의 길이만큼)
		char[] arr = new char[str.length()];
		
		//3. 문자열에서 각 인덱스별 문자를 뽑아서 char배열의 각 인덱스에 담기
		/*
		 * arr[0] = str.charAt(0);
		 * arr[1] = str.charAt(1);
		 * arr[마지막인덱스] = str.charAt(마지막인덱스);
		 * 
		 */
		for(int i = 0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
			
		}
		

		//4. char배열의 각 인덱스에 잘 담겨있는지 출력해보기
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public void method11() {
		//배열에 담고자하는 값들이 정해져있을 경우
		//각 인덱스에 값을 담은채로 배열을 생성할 수 있는 방법
		
		//배열선언과 동시에 할당
		int[] arr = new int[4];
		//각 인덱스에 값 초기화(대입)
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		//배열 선언 및 할당과 동시에 초기화 대입 한번에 끝내기
		int[] arr1 = new int[] {1, 2, 3, 4,}; //첫번째 방법
		int[] arr2 = {1, 2, 3, 4}; //두번째 방법
		
		System.out.println(arr == arr1);
		System.out.println(arr1 == arr2);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}