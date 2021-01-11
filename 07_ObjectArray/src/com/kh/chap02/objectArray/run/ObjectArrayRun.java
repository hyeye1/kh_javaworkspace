package com.kh.chap02.objectArray.run;

import java.util.Scanner;

import com.kh.chap02.objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		Phone[] arr = new Phone[3];
		
		arr [0] = new Phone("������", "����", 1500000, "��Ʈ20");
		arr [1] = new Phone("������", "���", 1300000, "11pro");
		arr [2] = new Phone("������", "����", 900000, "1");
		
		int total = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].information());
			total += arr[i].getPrice();
		}
		
		System.out.println("�� ���� : " + total + "��");
		System.out.println("��հ� : " + total / arr.length + "��");
		
		Scanner sc = new Scanner(System.in);

		System.out.print("ã�����ϴ� �ڵ��� : ");
		String name = sc.nextLine();

		// ��� �ڵ����� �̸��� ���Ͽ� ��ġ�ϴ� ��� �ش� ���� ���� ���
		for(int i=0; i<arr.length; i++) {
			if(name.equals(arr[i].getName())
					|| arr[i].getBrand().equals(name)
					|| arr[i].getSeries().equals(name)) {
				System.out.println("����: " + arr[i].getPrice()+"��");
			}
		}
		
	}

}


