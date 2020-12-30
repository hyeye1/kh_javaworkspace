package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int user = sc.nextInt();

		if (user >= 1) { // 1_1. �� �Է����� ��� 	
			
			for (int i = 1; i <= user; i++) {
				System.out.print(i + " ");
			}
			
		} else { // 1_2. �װ� �ƴ� ��� (�߸� �Է����� ���)
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			
		}
	}

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);

		// �켱 ���� �ݺ� ��������
		while (true) {
			
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int user = sc.nextInt();
			
			if (user >= 1) { // 1_1. �� �Է����� ��� 		=> �������� ��� ��� �� �ݺ��� ����
				
				for (int i = 1; i <= user; i++) {
					System.out.print(i + " ");
				}
				break;
				
			} else { // 1_2. �װ� �ƴ� ��� (�߸� �Է����� ���) => �ٽ� �ݺ��� ����
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
				
			}
		}
	}

	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int user = sc.nextInt();

		if (user >= 1) { // 1_1. �� �Է����� ���
			
			for (int i = user; i >= 1; i--) {
				System.out.print(i + " ");
			}
			
		} else {// 1_2. �װ� �ƴ� ��� (�߸� �Է����� ���)
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			
		}
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		// �켱 ���� �ݺ� ��������
		while (true) {
			
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int user = sc.nextInt();
			
			if (user >= 1) { // 1_1. �� �Է����� ��� 		=> �������� ��� ��� �� �ݺ��� ����
				
				for (int i = user; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
				
			} else { // 1_2. �װ� �ƴ� ��� (�߸� �Է����� ���) => �ٽ� �ݺ��� ����
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
				
			}
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=num; i++) { // i���� 1�������� ����ڰ� �Է��� ������ 1�� �����ϴ� ���� �ݺ�
			
			// �Ź� sum ������ �����ؼ� ������
			sum += i; 
			
			// �Ӹ��ƴ϶� ��µ� ���ٲ��� .. �ٵ� �������� �䱸�� ��� ����ϰ��� �Ѵٸ�
			if(i < num) { // i ���� num���� ���� �� ������ �ش� ���� �ڿ� + �ٿ����鼭 ���
				System.out.print(i + " + ");
			}else { // �װ� �ƴ� ���(��, i���� num�� �� ��� �׶� ���������� = �ٿ��� ���
				System.out.print(i + " = ");
			}
		}
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		if(num1 >= 1 && num2 >= 1) { // 1_1. �� �� ��� �� �Է����� ��� 
			
			int min = Math.min(num1, num2);	// �� �� �� ���� �� ���
			int max = Math.max(num1, num2); // �� �� �� ū �� ���
			
			for(int i = min; i <= max; i++) { // i�� min�������� max���� 1�� �����ϴµ��� �ݺ�
				System.out.print(i + " ");
			}	
			
		} else { // 1_2. �װ� �ƴ� ��� (�߸��Է����� ���)
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		// �켱 ���� �ݺ� ��������
		while(true) {
			
			System.out.print("ù ��° ���� : ");
			int num1 = sc.nextInt();
			
			System.out.print("�� ��° ���� : ");
			int num2 = sc.nextInt();
			
			if(num1 >= 1 && num2 >= 1) { // 1_1. �� �� ��� �� �Է����� ��� 	=> �������� ��� ��� �� �ݺ��� ��������
				
				int min = Math.min(num1, num2);	// �� �� �� ���� �� ���
				int max = Math.max(num1, num2); // �� �� �� ū �� ���
				
				for(int i = min; i <= max; i++) {
					System.out.print(i + " ");
				}	
				
				break; 
				
			} else {// 1_2. �װ� �ƴ� ��� (�߸��Է����� ���) => �ٽ� �ݺ��� ����
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
				
				
			}
		}
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		System.out.println("===== " + num + "�� =====");
		
		for(int i = 1; i < 10; i++) {			
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num >= 2 && num <= 9) { // 1_1. �� �Է����� ��� => ����ڰ� �Է��� �ܿ������� 9�ܱ��� ���
			
			
			for(int i = num; i < 10; i++) {						// ���� �����ϴ� for��	(����ڰ� �Է��� ������ 9���� 1�� ����)
				System.out.printf("===== %d�� =====\n", i);
				
				for(int j = 1; j <= 9; j++) {					// �������� ���� �����ϴ� for��	
					System.out.printf("%d * %d = %d\n", i, j, (i * j));
				}
				
				System.out.println();
			}		
			
			
		} else { // 1_2. �װ� �ƴ� ��� (��, �߸��Է����� ���)
			System.out.println("2~9������ ���ڸ� �Է����ּ���.");
			
		}
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		// �켱 ���� �ݺ� ��������
		while(true) {			
			
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			if(num >= 2 && num <= 9) { // 1_1. �� �Է����� ��� => ����ڰ� �Է��� �ܿ������� 9�ܱ��� ���
				
				for(int i = num; i <= 9; i++) {					// ���� �����ϴ� for��
					System.out.printf("===== %d�� =====\n", i);
					
					for(int j = 1; j <= 9; j++) {				// �������� ���� �����ϴ� for��
						System.out.printf("%d * %d = %d%n", i, j, (i * j));
					}
					
					System.out.println();
				}	
				break;
				
			} else { // 1_2. �װ� �ƴ� ��� (��, �߸��Է����� ���)
				System.out.println("2~9 ������ ���ڸ� �Է����ּ���.");
			}
		}
	}
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int start = sc.nextInt();
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		for(int i=0; i<10; i++) { // 0�������� 9���� �Ź� 1�� �����ϴµ��� �ݺ�(10ȸ)
			
			System.out.print(start + " ");
			//start = start + num;
			start += num;
			
		}
		
		
		
	}

	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			// 1. ������ �Է¹ޱ� (+, -, *, /, %) + exit
			System.out.print("������(+, -, *, /, %) : ");
			String op = sc.nextLine(); // "+", "-", "*", ... , "exit" , "^"
			
			// >> ����ڰ� Ȥ�ö�� exit��� ���ڿ��� �Է����� ��� => "���α׷��� �����մϴ�"��� �� �ݺ��� ����������
			if(op.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			// 2. �ΰ��� ���� �Է¹ޱ�
			System.out.print("����1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("����2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			// >> / �Ǵ� % �����ȣ�� �Է��߰� �Ӹ��ƴ϶� �ι�° ������ 0�� ��� 
			//    => "0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���" ��� �� �ݺ��� �ٽ� ����
			if(op.equals("/") || op.equals("%") && num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.\n");
				continue;
			}
			
			// 3. ��������ϱ� => ��������� ��� �ٷ� ��� x => ����� ������ ����ص� ��
			int result = 0; // ��������� ����� ��Ƶ� ����
			
			switch(op) {
			case "+": result = num1 + num2; break;
			case "-": result = num1 - num2; break;
			case "*": result = num1 * num2; break;
			case "/": result = num1 / num2; break;
			case "%": result = num1 % num2; break;
			// >> Ȥ�ö� ���� �����ȣ�� �Է����� ��� => "���� �������Դϴ�. �ٽ��Է����ּ���"��� �� �ݺ��� �ٽý���
			default: System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.\n"); continue;
			}
			
			// 4. ������� ��� ���  (ex)  xx �����ȣ xx = xx
			System.out.printf("%d %s %d = %d\n\n", num1, op, num2, result);			
			
		}
	
		
		
	}
	
	
	
	
}








