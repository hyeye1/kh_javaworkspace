package com.kh.chap02_inherit.model.vo;

public class Airplane extends Vehicle {
	
	private int tire; //Ÿ�̾� ����
	private int wing; // ���� ����
	
	public Airplane () {}
	
	public Airplane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);
		this.tire = tire;
		this.wing = wing;
	}
	
	public void setTire(int tire) {
		this.tire = tire;
	}
	public int getTire() {
		return tire;
	}
	
	public void setWing(int wing) {
		this.wing = wing;
	}
	public int getWing() {
		return wing;
	}
	
	@Override //1. ������ �˷��ִ� ���� 2. �������̵��ε� Ʋ���� �����ʾҴ��� üũ���� 
	public String toString() {
		return super.toString() + ", tire: " +tire + ", wing: " +wing;
	}
	
	@Override //������̼� -> �� ���� �ؿ� �������Ѱž� ��� �˷���  
	public void howToMove() { //-> �������̵� �� ������̼��� �ٿ��ذ�� �޼ҵ� �̸� �����ϰ� �ۼ��ؾ���
		System.out.println("������ ���ٰ� ������ ����");
	}

} 
