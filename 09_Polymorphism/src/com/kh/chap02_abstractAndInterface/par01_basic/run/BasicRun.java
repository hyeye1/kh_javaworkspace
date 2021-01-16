package com.kh.chap02_abstractAndInterface.par01_basic.run;

import com.kh.chap02_abstractAndInterface.par01_basic.model.vo.Basketball;
import com.kh.chap02_abstractAndInterface.par01_basic.model.vo.Football;
import com.kh.chap02_abstractAndInterface.par01_basic.model.vo.Sports;

public class BasicRun {

	public static void main(String[] args) {

		//Sports s = new Sports();
		// 추상 클래스로 생성 불가! (왜? 미완성된 클래스이기 때문에)
		
		//Sports s; 단 객체생성만 안될뿐이지 레퍼런지 변수로는 사용가능
		/*1.*/Sports s = new Football(); // 다형성을 적용해서 자식객체를 받아주는 용도로 사용
		
		/*2.*/Sports[] arr = new Sports[2];
		arr[0] = new Basketball();
		arr[1] = new Football();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].rule();
		}
		/*
		 * 추상클래스 (미완성클래스) abstract class
		 * 추상메소드가 존재하는 순간 반드시 추상클래스로 정의
		 * (일반필드+일반메소드+[추상메소드])
		 * 
		 * 단, 추상메소드가 굳이 없어도 추상클래스로 둘 수 있음
		 * 언제?
		 * => 아직 구체적이지 않은 덜 구현된 상태인것 같을때 (개념적)
		 * => 이 클래스를 객체생성이 불가하게끔 하고자 할때 (기술적)
		 * 
		 * - 객체 생성 불가
		 * 단, 레퍼런스 변수로는 사용가능(다형성적용가능)
		 * 
		 * 추상메소드
		 * - 미완성된 메소드로 몸통부가(){} 구현되어있지않은 메소드
		 * - 자식클래스에서 오버라이딩을 통해 완성됨(강제로 오버라이딩 해야됨)
		 * => 오버라이딩 하지않을 경우 에러발생
		 * => 메소드 사용의 통일성 확보목적
		 * => 표준화된 틀을 제공할 목적
		 */
		
	}

}
