package com.hw1.model.vo;

public class Product {
	/*
	 * - productId: String // ��ǰ ���̵�
	 * - productName: String // ��ǰ��
	 * - productArea: String // ������
	 * - price: int  //����
	 * - tax: double //�ΰ�������
	 * 
	 * + Product()
	 * + Product(productId : String / product Name: String productArea:String, price : int, tax:double)
	 * + information () : String
	 * 
	 * + setter & getter ��������
	 * 
	 * �Ű����� �����ڸ� �̿��Ͽ� 3���� ��ü������ ���
	 * setter�޼ҵ带 �̿��Ͽ� �� ���� �� ���
	 * getter�޼ҵ带 �̿��Ͽ� �ΰ������� ��ǰ���� ���
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
