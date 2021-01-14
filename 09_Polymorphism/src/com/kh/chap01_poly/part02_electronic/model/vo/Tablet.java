package com.kh.chap01_poly.part02_electronic.model.vo;

public class Tablet extends Electronic{
	private boolean penFlag;
	
	public Tablet() {}
	public Tablet(String brand, String name, int price, boolean penFlag) {
		super(brand, name, price);
		this.penFlag = penFlag;
	}
	
	public void setPenFlag(boolean penFlag) {
		this.penFlag = penFlag;
	}
	
	public boolean isPenFlag() {     // boolean�ڷ������� get�̾ƴ϶� is�� �ۼ�
		return penFlag;
	}
	
	@Override
	public String toString() {
		return super.toString() +", penFlag: " + (penFlag? "����" : "����"); //���׿�����: ������ ���ǽ� ����  (���ǽ�? ���ϰ�� : �����ϰ��)
	}
	

}
