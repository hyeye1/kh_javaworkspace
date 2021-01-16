package com.kh.chap02.objectArray.run;

import java.util.Scanner;

import com.kh.chap02.objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		int[] iArr = {1, 2, 3, 4, 5};
		
		for(int i=0; i<iArr.length; i++) { // �ݺ�Ƚ��: 5 == �迭�� ũ�� -> �迭�� ũ�⸸ŭ �ݺ����� �����
			System.out.println(iArr[i]);
		}
		
		//���� for�� �̿밡�� (� �迭���� ���翡 0�� �ε����������� �������ε��� ���� ���������� ������ ����)
		/*
		 * for(���������������Ѱ������� �������� : ���������������� �迭�� ) { // �ݺ�Ƚ�� == �迭��ũ��
		 * 		�ݺ������� ������ ����
		 * }
		 */
		
		//�迭�� �ڷ����� ��Ʈ�ڷ����̶�� ������ int��!
		//    int : int[] 
		for(int i : iArr ) { //��¼��� iArr[0] -> iArr[1] -> . . . -> iArr[������]
			System.out.println(i);
		}
		//��𿡵� �ε��� �� ������ ���ð� �Ǿ������ʱ⶧���� �ε���Ȱ���� ����
		
		
		
		
		
		
		
		
		
		
		
		Phone[] arr = new Phone[3];
		/*
		 */
		arr [0] = new Phone("������", "����", 1500000, "��Ʈ20");
		arr [1] = new Phone("������", "���", 1300000, "11pro");
		arr [2] = new Phone("������", "����", 900000, "1");
		int total = 0;

		/*for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].information());
			total += arr[i].getPrice();
		}*/
	// => ���� for�� Ȱ��!
		for(Phone p : arr) {
			System.out.println(p.information());
		}
		
		System.out.println("�� ���� : " + total + "��");
		System.out.println("��հ� : " + total / arr.length + "��");
		
		Scanner sc = new Scanner(System.in);

		System.out.print("ã�����ϴ� �ڵ��� : ");
		String name = sc.nextLine();

		// ��� �ڵ����� �̸��� ���Ͽ� ��ġ�ϴ� ��� �ش� ���� ���� ���
		/*
		for(int i=0; i<arr.length; i++) {
			if(name.equals(arr[i].getName())
					|| arr[i].getBrand().equals(name)
						|| arr[i].getSeries().equals(name)) {
				System.out.println("����: " + arr[i].getPrice()+"��");
			}
		}
		*/
		for(Phone p : arr) {
			if(name.equals(p.getName())
					|| name.equals(p.getBrand())
						|| name.equals(p.getSeries())) {
				System.out.println("����: " + p.getPrice() +"��");
			}
		}

		
	}

}


