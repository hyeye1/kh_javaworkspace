package com.kh.chap01.objectVSobjectArray.run;

import java.util.Scanner;

import com.kh.chap01.objectVSobjectArray.model.vo.Book;

public class ObjectArrayRun {
	
	public static void main(String[] args) {
		
		Book[] books =  new Book[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<books.length; i++) {
			System.out.println(i+1+"번째 도서 정보 입력");
			System.out.print("제목 : ");
			String title = sc.nextLine();
			System.out.print("저자 : ");
			String author = sc.nextLine();
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			books[i] = new Book(title, author, price, publisher);
			
		}
		
		for(int i = 0 ; i< books.length; i++) {
			System.out.println(books[i].information());
		}
		
		System.out.print("검색할 책 제목: ");
		String search = sc.nextLine();
		
		int count =0; // 일치하는 도서를 찾는 순간 1증가
		for(int i=0; i<books.length; i++) {
			if(books[i].getTitle().equals(search)) {
				System.out.println(books[i].information());
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("검색된 도서가 없습니다.");
		}
	}

}
