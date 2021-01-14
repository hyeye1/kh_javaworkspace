package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicController1;
import com.kh.chap01_poly.part02_electronic.controller.ElectronicController2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {
			
		//�޼ҵ��� �Ű������� ������(�θ�Ÿ�� ���۷����� �ڽİ�ü�� �޾��ְڴ�)�� �����ų���
		
		// ElectronicRun: ��ǰ��ü! ElectronicController1: ������ڻ� ������������
		
		/*
		// 1. ������ ���� ������ ���(ElectronicController1)
		ElectronicController1 ec = new ElectronicController1();
		// �����ϴ� ���� �� Ŭ������ �ʵ���� �޸� ������ �ö�!
		
		ec.insert(new Desktop("Samsung", "��ž", 1200000, "Geforce 1070"));
		ec.insert(new NoteBook("LG", "�׷�", 2000000, 4));
		ec.insert(new Tablet("����", "�����е�", 800000, false));
		
		// ���Կ� �ִ� ��ǰ���� ��ȸ
		Desktop d = ec.selectDesktop(); //����ũž��ü�� ��ȯ�� �Ǿ� ���ƿðű⿡ �޾��ټ� �ִ� ���� ����
		NoteBook n = ec.selectNoteBook(); // �޾��� ��Ʈ�� ����
		Tablet t = ec.selectTablet(); 
		
		// �մԿ��� �Ұ������ֱ� (������ֱ�)
		System.out.println(d); //���۷����� �������־ ��µ�
		System.out.println(n); // println �ȿ� �⺻�ڷ����̾ƴ϶� �����ڷ����̸� �ڵ�����
		System.out.println(t); // JVM�� toString�޼ҵ��� �������
		*/
		
		// 2. ������ �������� �� (ElectronicController2)
		
		ElectronicController2 ec = new ElectronicController2();
		
		ec.insert(new Desktop("Samsung", "��ž", 1200000, "Geforce 1070"), 0);
		ec.insert(new NoteBook("LG", "�׷�", 2000000, 4), 1);
		ec.insert(new Tablet("����", "�����е�", 800000, false), 2);
		/*
		Desktop d = (Desktop)ec.select(0);
					//electronic -=> desktop �ڷ������� ��ȯ��Ŵ
		NoteBook n = (NoteBook)ec.select(1);
		Tablet t = (Tablet)ec.select(2);
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		*/
		//�������� �����ؼ� �������� ����ϱ�
		// ��ȸ�ϰ����ϴ� �ε����� �ϳ��ϳ� ����ϴ°��̾ƴ�
		//�ѹ��� �������°�!
		
		Electronic[] elec = ec.select();
		
		for(int i=0; i<elec.length; i++) {
			System.out.println(elec[i]);
		}
		
		/*
		 * �������� ����ϴ� ����
		 * 1. �θ�Ÿ���� ��ü�迭�� �پ��� �ڽĵ��� �޾��� ������
		 * -> �θ�Ÿ�� �ϳ������ε� �پ��� �ڽİ�ü���� �ٷ� �� ����
		 * 2. �޼ҵ��� �Ű������� ��ȯ���� �������� �����ϰ� �Ǹ� �޼ҵ� ������ Ȯ �پ���.
		 */
	}

}
