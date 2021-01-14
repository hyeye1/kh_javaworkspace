package com.kh.chap02_abstractAndInterface.par01_basic.model.vo;

public class Basketball extends Sports {
	//부모클래스의 미완성된메소드를 자식클래스가 완성시켜준다
	//어떻게? override로
	
	//미완성된 클래스인 추상클래스를 상속받게 되면
	// 부모클래스에있는 추상메소드를 강제로 오버라이딩을 통해서 완성시켜주어야한다.
	
	@Override
	public void rule() {
		System.out.println("손으로 공을 던져 링에 넣어야 된다.");
	}
}
