package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class EncapsulationRun {
	/*
	 7. 캡슐화 과정을 통해 완벽한 클래스의 형태를 갖추자!
	 
	 캡슐화: 클래스의 가장 중요한 목적인 "데이터의 접근제한"을 원칙적으로 외부로부터 "데이터의 직접접근을 막고"
	 		대신에 데이터를 "간접적으로라도 처리" (값을 담거나, 가지고 온다거나)할 수 있는 메소드들을 클래스 내부에 작성해서 관리하는 방법
	 		
	 1) 정보은닉: private
	 			추상화를 통해 선정된 속성들을 외부로부터 직접 접근을 막기 위해 public 대신에 private이라는 접근 제한자를 사용
	 			
	 			ex. 학생들이 본인의 점수를 바꾼다거나 다른 학생의 점수를 알아낸다거나 하면 안됨!
	 			
	  2) setter/getter 메소드
	  	간접적으로나마 접근해서 값을 담거나(변경하거나) 또는 그 값을 가져올 수 있는 메소드
	  	setter - set 한다! getter - get(가져온다) !
	  	
	  			ex. 선생님은 학생의 성적을 기록하거나 조회할 수 있는 권한이 있음
	  	
	 */
	
	public static void main(String[] args) {
		
		Student hong = new Student();
		
		/*private 접근제한자 때문에 외부에서 "직접적인 접근 불가"
		hong.name = "홍길동";
		hong.age = 20;
		hong.height = 163.4;
		
		-> 직접 접근을 막았다면 간접적으로나마 접근할 수 있도록 만들어주자!
		*/
		
		hong.setName("홍길동");  //public void setName(매개변수작성) 매개변수작성해줘야함
		hong.setAge(20);
		hong.setHeight(163.4);
		
		System.out.printf("%s님의 나이는 %d살이고, 키는 %.1fcm입니다.\n", hong.getName(), hong.getAge(), hong.getHeight());
		System.out.println(hong.information());
	}

}
