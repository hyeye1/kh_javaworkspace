package com.kh.chap03_override.model.vo;

public class Book /* extends Object*/{
	
	private String title;
	private String author;
	private int price;
	
	//기본생성자
	public Book() {}
	
	//매개변수 생성자
	public Book(String title, String author, int price) {
		//super();
		this.title = title;
		this.author = author;
		this.price = price;
				
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}

	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	/*
	 * 매개변수 자료형, 갯수, 순서동일
	 * 반환형 동일 (jdk버전업 되면서 반환형의 자식자료형까지는 가능)
	 * 부모메소드의 접근제한자보다 같거나 크기
	 * -> 규약들 (너가 재정의하려면 이정도 규칙은 지켜줘)
	 * 
	 * @override 어노테이션 
	 *생략가능함 (명시를 하지않아도 부모메소드와 형태가 같으면 그냥 오버라이딩)
	 *어노테이션을 붙이는 이유?
	 *
	 *잘못기술했을경우 오류를 알려주기때문에
	 *부모메소드명이나 매개변수가 수정된경우 오류
	 *자식메소드도마찬가지로 수저오디는 경우 오류
	 *이 메소드가 오버라이된 메소드라는 것을 알리기
	 *
	 */
	@Override
	public String toString() {
		return "title: "+title+", author: " + author + ", price: " +price ;
	}

}
