package com.kh.array.practice.example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		//���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ����� �̿��Ͽ� ������� �迭 �ε����� ���� �� �� �� ���.
		//ex. 1 2 3 4 5 6 7 8 9 10
	
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			
			System.out.print(arr[i]+ " ");
		}
	}
	
	public void practice2() {
		// ���� ���
		
		int[] arr = new int[10];
		
		for(int i = arr.length-1; i>=0; i--) {
			arr[i] = i+1;
			
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public void practice3() {
		//����ڿ��� �Է¹��� ������ŭ �迭ũ�� �Ҵ�
		//1���� �Է¹��� ������ �迭�� �ʱ�ȭ �� �� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ����: ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
		
		
	}
	
	
	public void practice4() {
		String[] fruit = {"���","��", "����", "������", "����"};
		
		System.out.print(fruit[1]);
	}
	
	
	public void practice5() {
		//���ڿ��� �Է¹޾Ƽ� ���� �ϳ��ϳ� �迭�� �ְ� �˻��� ���ڰ� ��ִ��� ������  ���°�ε����� ��ġ�ϴ��� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		char[] text = new char[str.length()];
		
		System.out.print("���� : ");
		char cha = sc.nextLine().charAt(0);
		
		int count = 0;
		for(int i = 0; i<str.length(); i++) {
			text[i] = str.charAt(i);
			
				if(cha==text[i]) {
					count++;
					System.out.print("�ε�����ȣ : "+i+" \n");
				}
			}
		System.out.print(cha +" ���� : " + count);
		}
	
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		String[] day = {"��","ȭ","��", "��", "��", "��","��"};
		
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int num = sc.nextInt();

		if(num>=0 && num < 7) {
			System.out.println(day[num] + "����");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		int j = 0; //j= ��, i=�ε�����ȣ
		int i = 0;
		for(i=0; i<arr.length; i++) {
			
			System.out.printf("�迭 %d ��° �ε����� ���� �� : ", i);
			j = sc.nextInt();			
			arr[i]=j;						
		}
		int sum = 0;
		
		for(i=0; i<arr.length; i++) {
		System.out.print(arr[i]+" ");	
		}
		
		for(i=0; i<arr.length; i++) {
		sum += arr[i] ;
		}
		
		System.out.print("\n�� �� : "+sum);

	}
	
	public void practice8() {
		//3�̻��� Ȧ�� �ڿ����� �Է¹ޱ�
		//�迭�� �߰������� 1���� 1�� �����Ͽ� ������������ ���ֱ�
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			if(num>3 && (num%2 == 1)) {
				int[] arr = new int[num];

				for(int i = 0; i<=arr.length/2; i++) {
			
					arr[i] = i+1;
					System.out.print(arr[i]+" ");

				}
				for(int i=arr.length/2; i>0; i--) {
					
					arr[i] = i;
					System.out.print(arr[i]+ " ");
				}
				break;
			}else {
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}
	}
	
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ġŲ �̸��� �Է��ϼ���: ");
		String str = sc.nextLine();
		
		String[] chicken = {"�Ķ��̵�", "���", "����", "�ſ� ���"};
		
		boolean isMenu = true;
		
		int i = 0;
		
		for(i =0; i<chicken.length; i++) { 
			
			isMenu = (chicken[i].equals(str));
			
			if(isMenu) {
				System.out.println(str+"ġŲ ��� ����");
				break;
			}
		
		}
		if(isMenu==false) {
			System.out.println(str+ "ġŲ�� ���� �޴��Դϴ�.");
		}
		
	
	
	}
	
	public void practice10() {
		int[] arr = new int [10];
		
		for(int i=0; i<10; i++) {
			arr[i] = (int)(Math.random()*10+1);
			
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String num = sc.nextLine();
		char[] reg = new char[num.length()];
		char[] copy = reg.clone();
		
		for(int i=0; i<8; i++) {
			reg[i] = num.charAt(i);
			
			System.out.print(reg[i]);
		}
		for(int i=8; i<num.length(); i++) {
			
			copy[i]= '*';
			
			System.out.print(copy[i]);
		}
		
		

		
		
		
		
	}
	
	
	
}		

		
		
		
		
		
	
		
		
	
	
	
	
	
	
	
	

