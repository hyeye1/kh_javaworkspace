package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	//프로그램 --> 파일 ( 출력)!
	
	public void fileSave() {
		// 1. FileWriter 객체생성(파일이 없으면 만들어지면서 연결/ 있으면 그냥연결)
		FileWriter fw = null;
		try {
			fw= new FileWriter("b_char.txt");
			
			// 2. write() 메소드 사용해서 데이터 출력
			fw.write("와! 재밌당 ㅎ");
			fw.write('A');
			fw.write(' ');
			fw.write("\n");
			
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);
			
			
		} catch(IOException e ) {
			e.printStackTrace();
		} finally {
			try {
				//3. 다쓴 자원 반납
				fw.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//프로그램 <-- 파일(입력)
	public void fileRead() {
		
		// fileReader : 파일로부터 데이터를 2바이트 단위로 입력받기
		
		FileReader fr = null;
		try {
			fr = new FileReader("b_char.txt");
			
			int value =0;
			while((value = fr.read()) != -1) {
				System.out.println((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
