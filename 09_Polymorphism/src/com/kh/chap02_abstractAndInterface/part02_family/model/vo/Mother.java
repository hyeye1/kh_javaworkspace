package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public class Mother extends Person implements Basic {
	//�������̽� Ŭ������ ��ӹ޴´ٴ� ǥ������ '����' �̶�� ǥ���� ����Ѵ�. 
	
	private String babyBirth; // �Ʊ��� ź��: ���, �Ծ�, ����
	
	public Mother() {}
	
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
	
	public String getBabyBirth() {
		return babyBirth;
	}
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	
	@Override
	public String toString() {
		return "mother[" + super.toString() + ", babyBirt : " + babyBirth + "]";
	}
	
	@Override
	public void eat() {
		// ������ ������� => ������ 10 ����
		
		super.setWeight(super.getWeight() + 10);
		
		// �ǰ����� ������ �����Կ� 10 ����
		
		super.setHealth(super.getHealth() - 10);
		
	}
	

	@Override
	public void sleep() {
		// �ǰ��� 10 ����
		super.setHealth(super.getHealth() + 10);
		
	}
	

}
