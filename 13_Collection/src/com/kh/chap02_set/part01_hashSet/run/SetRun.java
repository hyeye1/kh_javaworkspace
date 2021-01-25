package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {

		HashSet<String> hs1 = new HashSet<String>();
		//set과 list는 같은 부모클래스를 상속받고있기때문에 같은 메소드가 많이 있다.
		
		//1. add();
		hs1.add("반갑습니다.");
		hs1.add(new String("반갑습니다."));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요."));
		hs1.add(new String("여러분"));
		
		System.out.println(hs1); //내가 추가한 순서대로 유지되지않고, 중복된 데이터는 존재하지않는다.
		
		HashSet hs2 = new HashSet();
		
		hs2.add(new Student("공유", 40, 100));
		hs2.add(new Student("김복순", 26, 40));
		hs2.add(new Student("홍길동", 24, 60));
		hs2.add(new Student("공유", 40, 100)); // 첫번째와 다른 주소값을 배정받았기에 동일 객체가 되지않는다.
		
		System.out.println(hs2); // 저장순서 유지 x, 중복저장 o => 왜? 동일객체로 판단되지않음

		// HashSet에 객체를 담을 때 내부적으로 equals()로 비교 + hashCode()값이 일치하는지도 비교
		// equals()한 결과가 true이고 hashCode()값이 일치하면 => 동일 객체로 판단(중복저장불가)
		
		// Object클래스에 있는 equals() : 두 객체의 "주소값을 가지고 비교"해서 일치하면 true/ 일치하지않으면 false반환
		// Object클래스에 있는 hashCode() : 객체의 "주소값을 기반으로 해서" 해쉬코드 값 만들어서 반환
		
		// 객체의 각 필드값이 일치하면 동일한 객체로 판단이 되서 중복저장이 불가하게끔 하고싶다?
		
		// Student 클래스에 equals() 오버라이딩: 세 "필드값"이 일치하면 true/ 하나라도 일치하지않으면 false 반환 재정의
		// Student 클래스에 hashCode() 오버라이딩: 세 "필드값" 기반으로해서 해쉬코드 값만들어서 반환 재정의
		
		// Set => 무작위 객체가 저장되어있음 => index 개념없음 => 반복문 활용불가
		
		// 그럼 담겨있는 객체에 순차적으로 접근하고자할때?
		
		// 1. for문 사용가능(단, for each문(향상된 for문)으로만 가능 !! 왜?
		//for(Student s : hs2) {
		//System.out.println(s);
	    //}
		
		//2. ArrayList에 담아준 후 ArrayList반복문 수행
		/*
		 //ArrayList<Student> list = new ArrayList<>(); // 빈리스트로 생성후
		 * list.addAll(hs2); // 리스트에 hs2에 담겨있는 객체들 통째로 추가
		 * 
		 */
		
		ArrayList<Student> list = new ArrayList<>(hs2);
		System.out.println("======================");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//3. Iterator 반복자를 이용한 방법
		// hs2 에 담겨있는 객체들을 Iterator(반복자)에 담는 과정
		Iterator<Student> it = hs2.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
