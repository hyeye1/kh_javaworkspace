package com.hw2.model.run;

import com.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		
		//�⺻�����ڸ� �̿��ؼ� ù��° book��ü ����
		Book b1 = new Book();
		
		//�Ű����� �����ڸ� �̿��Ͽ� �ι�° book��ü ����
		Book b2 = new Book("�ڹ��� ����", 20000, 0.2, "����");
				
		//��ü�� ���� �ʵ� �� ��� Ȯ��
		System.out.println(b1.information()+"\n"+b2.information());
		System.out.println("=============================");
		
		//ù��° ��ü�� ���� ���� setter�� �̿��Ͽ� ����
		b1.setTitle("C���");
		b1.setPrice(30000);
		b1.setDiscountRate(0.1);
		b1.setAuthor("ȫ�浿");
				
		//������ ���� ��� Ȯ��
		System.out.println("������ ��� Ȯ��");
		System.out.println(b1.information());
		System.out.println("=============================");
		
		//�� ��ü�� �������� ������ å ������ ����ؼ� ���
		//���ε� ���� = ���� -(����*������)
		
		System.out.println("������ = "+ b1.getTitle());
		System.out.println("���ε� ���� = " + (int)(b1.getPrice()-(b1.getPrice()*b1.getDiscountRate()))+"��");
		System.out.println("������ = "+ b2.getTitle());
		System.out.println("���ε� ���� = " + (int)(b2.getPrice()-(b2.getPrice()*b2.getDiscountRate()))+"��");

	}

}
