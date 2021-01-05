package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class EncapsulationRun {
	/*
	 7. ĸ��ȭ ������ ���� �Ϻ��� Ŭ������ ���¸� ������!
	 
	 ĸ��ȭ: Ŭ������ ���� �߿��� ������ "�������� ��������"�� ��Ģ������ �ܺηκ��� "�������� ���������� ����"
	 		��ſ� �����͸� "���������ζ� ó��" (���� ��ų�, ������ �´ٰų�)�� �� �ִ� �޼ҵ���� Ŭ���� ���ο� �ۼ��ؼ� �����ϴ� ���
	 		
	 1) ��������: private
	 			�߻�ȭ�� ���� ������ �Ӽ����� �ܺηκ��� ���� ������ ���� ���� public ��ſ� private�̶�� ���� �����ڸ� ���
	 			
	 			ex. �л����� ������ ������ �ٲ۴ٰų� �ٸ� �л��� ������ �˾Ƴ��ٰų� �ϸ� �ȵ�!
	 			
	  2) setter/getter �޼ҵ�
	  	���������γ��� �����ؼ� ���� ��ų�(�����ϰų�) �Ǵ� �� ���� ������ �� �ִ� �޼ҵ�
	  	setter - set �Ѵ�! getter - get(�����´�) !
	  	
	  			ex. �������� �л��� ������ ����ϰų� ��ȸ�� �� �ִ� ������ ����
	  	
	 */
	
	public static void main(String[] args) {
		
		Student hong = new Student();
		
		/*private ���������� ������ �ܺο��� "�������� ���� �Ұ�"
		hong.name = "ȫ�浿";
		hong.age = 20;
		hong.height = 163.4;
		
		-> ���� ������ ���Ҵٸ� ���������γ��� ������ �� �ֵ��� ���������!
		*/
		
		hong.setName("ȫ�浿");  //public void setName(�Ű������ۼ�) �Ű������ۼ��������
		hong.setAge(20);
		hong.setHeight(163.4);
		
		System.out.printf("%s���� ���̴� %d���̰�, Ű�� %.1fcm�Դϴ�.\n", hong.getName(), hong.getAge(), hong.getHeight());
		System.out.println(hong.information());
	}

}
