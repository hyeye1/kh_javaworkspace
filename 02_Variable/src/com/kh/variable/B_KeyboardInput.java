package com.kh.variable;

import java.util.Scanner;

public class B_KeyboardInput {
	
	// 사용자가 키보드를 통해 입력한 값을 가져온 후 변수에 기록하는 방법
	
	public void inputScanner1() {
		/*
		 * 키보드로 입력한 값을 가져오기 위해서는
		 * 자바에서 이미 제공하고 있는 java.util.Scanner라는 클래스가 
		 * 가지고 있는 메소드들을 이용해야 됨
		 * 
		 * 다른 클래스에 있는 메소드를 호출하고자 할 때
		 * 1) 클래스 생성 (new)
		 * 2) 해당 클래스에 있는 메소드 호출 
		 * 
		 */
		
		//java.util.Scanner sc = new java.util.Scanner(System.in); // --> System.in : 입력받은 값을 바이트단위로 받아들이겠다라는 말
		Scanner sc = new Scanner(System.in);
		
		// 간단하게 사용자의 정보(이름, 나이, 키)를 입력 받고 그 입력받을 정보를 출력하는 프로그램
		// 보통 입력받고자 하는 내용을 먼저 출력해서 유도
		System.out.print("당신의 이름은 무엇입니까 : ");
		
		// 사용자가 입력한 값을 문자열로 받아오는 메소드 (sc.next(), sc.nextLine())
		//sc.next(); // 단, 이렇게만 작성하면 입력된 값을 가지고 오고 나서 끝남
		
		//String name = sc.next(); 
		// next() : 사용자가 입력한 값 중 공백 이전까지 값만 읽어옴! 
		//          (따라서 주소같은 공백이 포함될 여지가있는 문자열은 적절하지 않음!)
		
		String name = sc.nextLine();
		// nextLine() : 사용자가 입력한 값 모두다 읽어옴!
		
		System.out.print("당신의 나이는 몇살입니까(숫자만) : ");
		int age = sc.nextInt();
		// nextInt() : 사용자가 입력한 값 정수로 읽어옴! (정수가 아닌 문자도 같이 입력됐을 경우 오류발생)
		
		System.out.print("당신의 키는 몇 cm입니까 (소수점 아래 첫째 자리까지) : ");
		double height = sc.nextDouble();
		// nextDouble() : 사용자가 입력한 값 실수로 읽어옴! (문자도 같이 입력됐을 경우 오류발생)
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		
	}
	
	
	public void inputScanner2() {
		
		Scanner sc = new Scanner(System.in);
		
		// 이름, 나이, 주소, 키
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이(숫자만) : ");
		int age = sc.nextInt();
		
		// 버퍼에 남아있는 '엔터'를 비워주는 과정을 하면됨!!
		sc.nextLine();
		
		/*
		 * sc.nextLine() : 버퍼에서 값을 가져온 후 '엔터'를 비워주는 역할을 수행
		 * 그 외의 next~~~() : 버퍼에서 값을 가져오고 끝냄 ('엔터'를 비워주지 않음 == '엔터'가 여전히 남아있을 것)
		 * 
		 * sc.nextInt() 후에 sc.nextLine() 메소드가 호출된다면 
		 * 버퍼에 남아있는 엔터때문에 sc.nextLine() 바로 실행되버림!!
		 * 
		 * 결론 : sc.next~~() 메소드 뒤에 바로 sc.nextLine() 메소드가 사용될 거 같으면 버퍼에 남아있는 '엔터'를 빼주는 과정 필요!
		 *      즉, 그 사이에 sc.nextLine() 메소드를 한번 더 호출해주자
		 */
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("키(cm) : ");
		double height = sc.nextDouble();
		
		/*
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(height);
		*/
		
		// xxx님은 xx살이며, 사는 곳은 xxxxxxx이고, 키는 xxxxcm입니다.
		//System.out.println(name + "님은 " + age + "살이며, 사는 곳은 " + address + "이고, 키는 " + height + "cm입니다.");
		System.out.printf("%s님은 %d살이며, 사는 곳은 %s이고, 키는 %.1fcm입니다.", name, age, address, height);
		
	}
	
	
	public void inputScanner3() {
		
		Scanner sc = new Scanner(System.in);
		
		// 문자열 => sc.nextLine()
		// 정수 => sc.nextInt()
		// 실수 => sc.nextDouble()
		
		System.out.print("이름 : ");
		String name = sc.nextLine(); // "홍길동"
		
		System.out.print("성별(남/여) : ");
		//char gender = sc.nextChar(); // nextChar 메소드는 존재 하지 않음
		char gender = sc.nextLine().charAt(0);
		// 사용자가 입력한 값을 문자열로 가지고 온 후 내가 원하는 인덱스의 문자값을 추출해서 담기
		// * 인덱스 == 0번부터 시작
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		/*
		 * xxx님의 개인정보
		 * 성별 : x
		 * 나이 : xx
		 * 키 : xxxcm
		 */
		System.out.println(name + "님의 개인정보");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height + "cm");
	}
	
	
	/*
	 * * 정리 *
	 * 1. 콘솔창에(모니터) 출력하기 위해 : System.out.println(출력하고자 하는 값) 메소드 호출
	 * 2. 콘솔창에(키보드) 입력받기 위해 : Scanner sc = new Scanner(System.in);
	 * 							   sc.nextLine(), sc.next(), sc.nextInt(), sc.nextDouble(), ...
	 * 	  
	 *    '문자' 값을 입력받기 위해 sc.nextLine()을 통해 문자열로 가지고 온 후
	 *    그 뒤에 .charAt(추출하고자하는인덱스)을 통해 해당 인덱스의 문자 값을 뽑을 수 있음
	 *    
	 * * 주의사항 *
	 * sc.nextXXX() 메소드 뒤에 sc.nextLine() 메소드가 오게 될 경우 
	 * 그 전에 버퍼에 남아있는 '엔터' 비워주는 과정인 sc.nextLine() 메소드 한번더 호출
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	

}
