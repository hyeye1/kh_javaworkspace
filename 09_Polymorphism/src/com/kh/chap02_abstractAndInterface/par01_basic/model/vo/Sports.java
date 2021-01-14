package com.kh.chap02_abstractAndInterface.par01_basic.model.vo;

public abstract class Sports {
	
	private int people; // �������� �����ϴ� ���� ���
	
	public Sports() {}
	
	public Sports(int people) {
		this.people = people;
	}
	
	public void setPeople(int people) {
		this.people = people;
	}
	
	public int getPeople() {
		return people;
	}
	
	@Override
	public String toString() {
		return "people: " + people;
	}
	
	/*
	 * �����  {} ���������ʴ�
	 * �� , �̿ϼ� �޼ҵ� == �߻�޼ҵ�
	 * 
	 * �޼ҵ� ���ǽ� abstract ����� ���
	 * 
	 * �Ӹ��ƴ϶� �߻�޼ҵ尡 �����ϸ� 
	 * �� Ŭ���� ���� ������ �߻�Ŭ������ �ۼ��ؾ��Ѵ�.
	 * 
	 */
	public abstract void rule(); //_> ���ȣ������ �̿ϼ��޼ҵ� : �߻�޼ҵ�
	//�߻�޼ҵ�(�̿ϼ��޼ҵ�)�� �Ϸ��ϰ������ ���������ڿ� ��ȯ�� ���̿� abstract��� Ű���� �ۼ��ؾ���
	
	

}
