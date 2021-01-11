package com.kh.chap01.objectVSobjectArray.run;

import java.util.Scanner;

import com.kh.chap01.objectVSobjectArray.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
		
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<3; i++) {
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
			
			if(i==0) {
				bk1 = new Book (title, author, price, publisher);
			} else if(i==1) {
				bk2 = new Book (title, author, price, publisher);
			} else {
				bk3 = new Book (title, author, price, publisher);
			}
		}
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		System.out.print("검색할 책 제목 : ");
		String search = sc.nextLine();
		
		if(bk1.getTitle().equals(search)) {
			System.out.println(bk1.information());
		} else if(bk2.getTitle().equals(search)) {
			System.out.println(bk2.information());
		} else if(bk3.getTitle().equals(search)) {
			System.out.println(bk3.information());
		} else {
			System.out.println("검색된 도서가 없습니다.");
		}

	}

}
