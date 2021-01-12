package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class AfterRun {

	public static void main(String[] args) {
		//desktop객체생성
		
		//Desktop d = new Desktop();
		//d.setpName("짱짱데스크탑");
		
		Desktop d = new Desktop("짱짱데스크탑", "d-01", "삼성", 2000000, true);
		Tv t = new Tv("올레드티비", "t-01", "LG", 3500000, 60);
		SmartPhone s = new SmartPhone("아이폰", "s-01", "애플", 1500000, "skt");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
	}
	/* 상속의 장점
	 * - 보다 적은 양의 코드로 새로운 클래스 작성가능
	 * - 코드를 공통적으로 관리하기 때문에 코드의 추가나 변경에 용이
	 * - 중복된 코드를 줄였기 때문에 프로그램의 생산성과 유지보수에 크게 기여
	 */

}
