package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;

public class Run {

	public static void main(String[] args) {
		
		Car c = new Car("��Ʋ��",12.5, "����", 4);
		Ship s = new Ship("���ù�", 0.1, "�", 1);
		Airplane a = new Airplane("�����", 0.021, "��Ʈ��", 16, 4);
		
		System.out.println(c.information());
		System.out.println(s.information());
		System.out.println(a.information());
		
		c.howToMove();
		s.howToMove();
		a.howToMove();
		/*
		 * ����� Ư¡
		 - Ŭ�������� ����� ���� ��Ӹ� ����(�θ�� �ϳ�)
		 - ��õǾ����� ������ ��� Ŭ���� (�ڹٿ��� �����ϴ� Ŭ����, �������� Ŭ����) objectŬ������ ��ӹް�����
		 => ��,  object Ŭ������ �����ϰ��մ� �޼ҵ� ���� �͵��� ������� ��������!
		 => �Ӹ��ƴ϶� ������ �ȵ�� �� �Ը���� ������(�������̵�) ����
		 */
	}

}
