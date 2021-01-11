package com.kh.chap01.objectVSobjectArray.run;

import java.util.Scanner;

import com.kh.chap01.objectVSobjectArray.model.vo.Book;

public class ObjectArrayRun {
	
	public static void main(String[] args) {
		
		Book[] books =  new Book[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<books.length; i++) {
			System.out.println(i+1+"��° ���� ���� �Է�");
			System.out.print("���� : ");
			String title = sc.nextLine();
			System.out.print("���� : ");
			String author = sc.nextLine();
			System.out.print("���� : ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.print("���ǻ� : ");
			String publisher = sc.nextLine();
			
			books[i] = new Book(title, author, price, publisher);
			
		}
		
		for(int i = 0 ; i< books.length; i++) {
			System.out.println(books[i].information());
		}
		
		System.out.print("�˻��� å ����: ");
		String search = sc.nextLine();
		
		int count =0; // ��ġ�ϴ� ������ ã�� ���� 1����
		for(int i=0; i<books.length; i++) {
			if(books[i].getTitle().equals(search)) {
				System.out.println(books[i].information());
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("�˻��� ������ �����ϴ�.");
		}
	}

}
