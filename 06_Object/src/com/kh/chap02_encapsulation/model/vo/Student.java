package com.kh.chap02_encapsulation.model.vo;

public class Student { //필드부 생성자부 메소드부로 나뉜다.
	
	//필드부
	/*
	 필드 == 멤버변수 == 인스턴스(객체)변수 
	 
	 <표현법>
	 접근제한자 [예약어] 자료형 변수명; 
	 
	 필드부의 접근제한자는 private으로 하는게 객체지향 설계원칙 중 하나
	 
	 */
	private String name;
	private int age;
	private double height;
	
	
	// 생성자부
	
	
	//메소드부 
	/*
	 메소드가 곧 기능
	 즉, 기능을 구현하는 부분
	 각 기능별 메소드를 따로따로 여러개 만들어둘거임
	 
	 <표현법> 반환형- 돌려줄게없으면 void
	 접근제한자[예약어] 반환형 메소드명([이메소드 호출시 전달되는 값을 담기위한 매개변수]) {
	 		//기능구현
	 }
	 */
	// 전달되는 데이터를 기록(대입) 및 수정하는 기능용 메소드(setter메소드)
	// 단, 이 메소드는 접근 가능 하도록 해야되기때문에 접근제한자는 public으로 사용
	// setter 메소드 이름을 지을때는 set으로 시작되고 어떤 필드에 대해서 기록을 하는 메소드인지(낙타표기법)
	
	public void setName(String name) {//String newName = "전달되는값";
		//매개변수: 해당 이 메소드 호출시 전달되는 값을 담기위한 변수선언
		//			매개변수는 오로지 이 메소드에서만 사용가능(==지역변수 개념)
		//name = 전달된값;  (전달된값= 매개변수명)
		
		// 우리가 원하는 건 => 필드의 name = 매개변수 name;
		// 지역변수가 필드보다도 우선순위가 높기때문에
		// 필드의 name을 가리키고자 할 때는 this.를 통해 제시해야됨!
		
		this.name = name;
	}
	
	// age 필드값을 초기화 시켜주는 용도의 메소드
	public void setAge(int age) {
		this.age = age;
	}
	
	// height 필드값을 초기화 시켜주는 용도의 메소드
	public void setHeight(double height) {
		this.height = height;
	}
	
	// 각 필드에 담긴 데이터를 반환시켜주는(돌려주는) 기능용 메소드(getter메소드)
	// getXXX 으로 메소드명을 지어준다 (낙타표기법)
	// getter메소드에는 전달되는 값 없음 (전달되는 값이 없기때문에 매개변수 필요없음)
	// name 필드값을 돌려주는 용도의 메소드
	// 반환값= 어떤 결과값을 돌려줄거면 그 결과값에 대한 자료형 기입 
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	// 모든 필드값을 다 합쳐버린 문자열을 돌려주는 메소드를 만들기
	public String information() {
		String info = name + "님의 나이는 " + age + "살이고, 키는 " + height + "cm입니다.";
		return info; 
	}
	
	
	
}































