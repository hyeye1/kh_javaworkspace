package com.kh.chap03_override.model.vo;

public class Book /* extends Object*/{
	
	private String title;
	private String author;
	private int price;
	
	//�⺻������
	public Book() {}
	
	//�Ű����� ������
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
	 * �Ű����� �ڷ���, ����, ��������
	 * ��ȯ�� ���� (jdk������ �Ǹ鼭 ��ȯ���� �ڽ��ڷ��������� ����)
	 * �θ�޼ҵ��� ���������ں��� ���ų� ũ��
	 * -> �Ծ�� (�ʰ� �������Ϸ��� ������ ��Ģ�� ������)
	 * 
	 * @override ������̼� 
	 *���������� (��ø� �����ʾƵ� �θ�޼ҵ�� ���°� ������ �׳� �������̵�)
	 *������̼��� ���̴� ����?
	 *
	 *�߸����������� ������ �˷��ֱ⶧����
	 *�θ�޼ҵ���̳� �Ű������� �����Ȱ�� ����
	 *�ڽĸ޼ҵ嵵���������� ��������� ��� ����
	 *�� �޼ҵ尡 �������̵� �޼ҵ��� ���� �˸���
	 *
	 */
	@Override
	public String toString() {
		return "title: "+title+", author: " + author + ", price: " +price ;
	}

}
