package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

// ������(�θ�Ÿ�� ���۷����� �ڽİ�ü�� �޾��ִ�) �����������
public class ElectronicController2 {
	
	private Electronic[] elec = new Electronic[3];  //desktop/ tablet/ notebook���� �� �ִ� �迭
	
	//desktop/ notebook/ tablet ���ε��� �����ʰ� ��� ����ټ� �ִ� �θ�Ÿ�� ���۷��� -> ������
	public void insert(Electronic any, int index) { //�Ű������� �ε��� ���� ������ �����
		elec[index] = any; 
	}
	
	public Electronic select(int index) { //��ȸ�ϰ����ϴ� �ε������� �����ֱ� -> �Ű������� �Է�
		return elec[index];
	}
	
	//����������
	public Electronic[] select() { //���ε��� ��ȸ�ƴϰ� ��°�� �� ������
		return elec;
	}

}
