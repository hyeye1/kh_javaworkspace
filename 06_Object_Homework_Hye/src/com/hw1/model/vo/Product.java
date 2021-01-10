package com.hw1.model.vo;

public class Product {
	/*
	 * - productId: String // 상품 아이디
	 * - productName: String // 상품명
	 * - productArea: String // 생산지
	 * - price: int  //가격
	 * - tax: double //부가세비율
	 * 
	 * + Product()
	 * + Product(productId : String / product Name: String productArea:String, price : int, tax:double)
	 * + information () : String
	 * 
	 * + setter & getter 직접구현
	 * 
	 * 매개변수 생성자를 이용하여 3개의 객체생성후 출력
	 * setter메소드를 이용하여 값 수정 후 출력
	 * getter메소드를 이용하여 부가세포함 상품가격 출력
	 * 
	 */
	
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	public Product() {
		
	}
	
	public Product(String productId, String productName, String productArea, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public void setProductName (String productName) {
		this.productName = productName;
	}
	
	public void setProductArea (String productArea) {
		this.productArea = productArea;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public String getProductId() {
		return productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public String getProductArea() {
		return productArea;
	}
	
	public int getPrice() {
		return price;
	}
	
	public double getTax() {
		return tax;
	}
	
	public String information() {
		return productId + " " + productName +" "+ productArea +" "+ price +" " + tax ;
	}
	
}
