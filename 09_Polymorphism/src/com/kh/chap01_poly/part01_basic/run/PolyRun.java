package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {

		//����صѰ�
		// = ���Կ����ڸ� �������� ���� �������� �ڷ����� ���ƾ���
		
		//1. �θ�Ÿ�� ���۷����� �θ�ü�� �ٷ�� ���
		System.out.println("1. �θ�Ÿ�� ���۷����� �θ�ü�� �ٷ�� ���");
		Parent p1 = new Parent();
		p1.printParent(); 
		
		//2. �ڽ�Ÿ�� ���۷����� �ڽİ�ü�� �ٷ�� ���
		System.out.println("2. �ڽ�Ÿ�� ���۷����� �ڽİ�ü�� �ٷ�� ���");
		Child1 c1 = new Child1();
		c1.printParent();
		c1.printChild1();
		//c1 ���۷����� Parent, Child1 �� �� ���� ����
		
		//3. �θ�Ÿ�� ���۷����� �ڽİ�ü�� �ٷ�� ���( �������� ����� ���� )
		System.out.println("3. �θ�Ÿ�� ���۷����� �ڽİ�ü�� �ٷ�� ���");
		Parent p2 = /*(Parent)*/ new Child1();
		//������ �ڷ����� �ٸ����� �ұ��ϰ� �� ��! => '�ڵ�����ȯ' �߻�
		//��ӱ��������� Ŭ���� ����ȯ�� ����!
		
		p2.printParent(); // p2 ��� ���۷����� Parent���� ���ٰ���..
		((Child1)p2).printChild1();
		
		/*
		 * Ŭ�������� ����ȯ ����(��, ��ӱ����϶���) 
		 * 
		 * 1. UpCasting
		 * �ڽ�Ÿ��=> �θ�Ÿ������ ����ȯ
		 * �������� (�ڵ�����ȯ��)
		 * 
		 * 
		 * 2. DownCasting
		 * �θ�Ÿ�� => �ڽ�Ÿ������ ����ȯ
		 * �����Ұ� (�����(����) ����ȯ �ؾߵ�)
		 * 
		 * 
		 * 
		 */
		
		//�������� ���� ����?
		// Child1 ��ü 2���� Child2 ��ü 2���� �ʿ���
		//��ü�迭 �̿��ؼ�!
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 4);
		arr1[1] = new Child1(2, 1, 5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(5, 7, 2);
		arr2[1] = new Child2(2, 3, 5);
		
		System.out.println("====== ������ ������ ��ü �迭 ======");
		// ��, �������� ����Ǹ� �θ�Ÿ�� ���۷����� �پ��� �ڽ� ��ü���� �޾��� �� ����
		Parent[] arr = new Parent[4];
		arr[0] = new Child1(1, 2, 4);
		arr[1] = new Child2(5, 7, 2);
		arr[2] = new Child2(2, 3, 5);
		arr[3] = new Child1(2, 1, 5);
		
		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
		((Child2)arr[2]).printChild2();
		((Child1)arr[3]).printChild1();
		
		System.out.println("====== �ݺ��� �̿��ؼ� �غ��� ======");
		for(int i=0; i<arr.length; i++) {
			//instanceof ������
			// ���� ���۷����� ������ � �ڽ� Ŭ������ �����ϰ� �ִ��� Ȯ���� �� ���
			//if(arr[i] instanceof Child1) {
			//	((Child1)arr[i]).printChild1();
			//}else {
			//	((Child2)arr[i]).printChild2();
			//		}
		arr[i].print();
		// ��, �������̵������� �����ϸ� ���� ���� ���డ����
		// ���������� �����ϰ� �ִ� �ڽ� Ŭ������ �������̵� �� �޼ҵ� ã�ư��� �˾Ƽ� ����ȴ�
		
		
			
		}
	}

}
