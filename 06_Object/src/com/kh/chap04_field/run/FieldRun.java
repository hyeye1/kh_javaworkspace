package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class FieldRun {

	public static void main(String[] args) {
	
		// FieldTest1 �׽�Ʈ
		//FieldTest1 f1 = new FieldTest1(); //������� ��������
		// ���� ��ü �����ϴ� �������� global �̶�� ������ �޸𸮻� �������(�� ���Ե� ä��)

		//f1.test(5); //�������� ��������
		// ���� test�޼ҵ� ȣ���ϴ� ������ test�޼ҵ� ���� ������������ �޸𸮻� �������
		
		// �������� �Ҹ����
		// �޼ҵ尡 �ٳ����� ���� ���� �������� �޸𸮻󿡼� �����
		
		//f1=null; //������� �Ҹ� ����
		//��ü�� �Ҹ�ɶ� ��������� �޸𸮻� �����
		
		
		
		//========FieldTest 2 �׽�Ʈ ===========
		//FieldTest2 f2 = new FieldTest2();
		
		//public = ��𼭵� ���ٰ���
		//System.out.println(f2.pub);
		
		//protected => ���� ��Ű�� ���ٰ��� �ٸ���Ű���� ��ӱ��������� ���ٰ���
		//System.out.println(f2.pro); ������=> getter�޼ҵ��ۼ��ϸ�ȴ�
		
		// default => ���� ��Ű�������� ���ٰ���
		//System.out.println(f2.def); // getter�޼ҵ�� ���
		
		// private => ���� Ŭ���������� ���ٰ���
		//System.out.println(f2.pri); // getter�޼ҵ�� �� ����
		
		
		
		//============FieldTest3 �׽�Ʈ ===============
		// static�̶�� Ű���尡 ���� Ŭ���� ������ ���� �ش� ��ü ���������ʾƵ� ��밡��
		// ��? �̹� �޸� ������ �����Ǿ��ֱ� ������!
		System.out.println(FieldTest3.sta);
		System.out.println(FieldTest2.sta);
		// ���������� ��밡�� (static������ �ڵ����� � Ŭ���������� �����Ǿ�����)
		// �� �Ҽ����� ��� � ������ �θ����� �˷���
		
		FieldTest3.sta= "������";
		
		System.out.println(FieldTest3.NUM);
		
		System.out.println(FieldTest3.sta);
		
		System.out.println(Math.PI);
		

	}

	
	
	
	
	
	
	
}
