package list.controller;

import java.util.ArrayList;

import list.model.vo.Book;

public class BookController {
	
	// ????????  ??? ??? bookList
	private ArrayList<Book> bookList = new ArrayList<Book>();
	
	{
		// ??? 4?????? ???
		bookList.add(new Book("????? ????", "??��", "???", 20000));
		bookList.add(new Book("C???", "????", "???", 15000));
		bookList.add(new Book("?????? ???????", "??????", "?��?", 17500));
		bookList.add(new Book("??????", "KH", "???", 10000));
	}
	
	
	public void insertBook(String title, String author, int category, int price) {
		/*
		 * 1. ??????? ??????? ?????? Book ??? ???? (??, ??? ???? ?? ?? ??????? ????? ?????? ??????? ??? ???????? ????!)
		 * 2. bookList?? 1???? Book??? ???
		 */
		
		String cate = null;
		switch(category) {
		case 1: cate = "?��?"; break;
		case 2: cate = "???????"; break;
		case 3: cate = "???"; break;
		case 4: cate = "???"; break;
		}
		
		bookList.add(new Book(title, author, cate, price));
	}
	
	
	public ArrayList<Book> selectList(){
		/*
		 * 1. ??? bookList ???
		 */
		
		return bookList; 	// ?? ?��? ?????????~! ?��?? null?? ??????
	}
	
	
	public ArrayList<Book> searchBook(String keyword){
		/*
		 * 1. ??? ??? ??????? ????? ?????(ArrayList<Book> searchList) ???? ?? ????
		 * 2. ??????? ???? bookList?? ??? ?? ????? ??????? keyword?? "???? ?????? ???" --> HINT : ????? ????? ?? String ??????? contains ???? ?????? ??????
		 *    searchList?? ??? ? "???"??? 
		 * 
		 * 3. searchList ???
		 */
		ArrayList<Book> searchList = new ArrayList<>();
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(keyword)){
				searchList.add(bookList.get(i));
			}
		}
		
		return searchList;   // ?? ?��? ?????????~! ?��?? null?? ??????
	}
	
	public int deleteBook(String title, String author) {
		/*
		 * 1. ?????? ????? ???????? ??????? ????? ??? ?????????? ???? ?? ?????, ??? ??? ??? ?????? ?????? ??? ???? ??????.
		 *    ????? ??? ?????? ???? result ?????? 0???? ???? ?? ??? ????? ????.
		 * 2. ??????? ???? bookList?? ??? ?? ????? ??????? title?? ???????, ??????? ??????? author?? ?????? ??? 
		 *    ??? ?��????? ???? "????"??? result 1?? ???? ?? ??????????(????? ??????? ???? ????????? break??��? ?? ?????)
		 * 
		 * 3. result ?? ???
		 */
		int result = 0;
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(title)&&bookList.get(i).getAuthor().contains(author)) {
				bookList.remove(i);
				result ++;
			}
		}
		return result;   // ?? ?��? ?????????~! ?��?? 0???? ??????
	}
	
	
	
	
}
