package com.kh.chap01_beforeVSafter.after.model.vo;

public class Desktop extends Product {
	
	private boolean allInOne;
	
	public Desktop() {
		//super();
		//항상 알게모르게 부모생성자를 호출하고있기때문에
		//부모객체가 먼저 메모리영역에 할당이 된다.
		// => 부모 클래스에 기본생성자가 없어서는 안된다.
	}
	
	public Desktop(String pName, String pCode, String brand, int price, boolean allInOne) {
		/* 
		 * super. 으로 부모클래스에 접근가능
		 * 단, 접근하고자 하는 접근제한자가 private일 경우 직접 접근 불가
		 * 
		 * 해결방법 1. 부모필드를 자식에서는 직접접근가능하게끔 protected로 하기
		super.pName = pName;
		super.pCode = pCode;
		super.brand = brand;
		super.price = price;
		
		 * 해결방법 2. setter메소드(public)을 활용하기 
		super.setpName(pName);
		super.setpCode(pCode);
		super.setBrand(brand);
		super.setPrice(price);
		
		 * 해결방법 3. super() 이용해서 부모생성자를 호출하기
		 */
		super(pName, pCode, brand, price);
		
		
		this.allInOne = allInOne;
	}
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public boolean isAllInOne() {
		return allInOne;
	}
	
	//부모클래스에 메소드가 마음에 들지않는다면?
	// 자식클래스에서 재정의하면 된다.
	
	public String information() {
		return super.information() + ", allInOne: " +allInOne;
	}

}
