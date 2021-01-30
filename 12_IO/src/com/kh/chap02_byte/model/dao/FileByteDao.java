package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException; //filenotfoundException의 부모는 ioException
import java.io.FileOutputStream; // 입출력관련된 스트림이 모여있는 패키지 => java.io
import java.io.IOException;

// DAO(Data Access Object) : 데이터가 보관되어있는 공간과 직접접근해서 데이터를 주고받는 클래스

public class FileByteDao {
	
	
	// 프로그램기준으로 봤을 때 내보낸다 외부매체로 (기록하기위해)
	// 프로그램 (자바 또는 메모리 ) --> 외부매체(파일)
	// 출력 : 프로그램 내의 데이터를 파일로 내보내기 즉, 파일로 저장시키겠다.
	public void fileSave() {
		
		// FileOutputStream(1바이트짜리 작은 통로) : "파일"로 데이터를 1바이트 단위로 출력하는 스트림
		
		FileOutputStream fout = null; // 특정영역 어디든 가져다 쓸수 있도록 바깥에 변수 작성하고 안에서 객체생성 완료하기

		try {
			// 객체생성해주면 -> 파일을 열겠다는 뜻 (직접적인 통로를 만든다는 뜻) 즉, 스트림을 만드는과정
			// 1. FileOutputStream 객체생성 == 해당 파일과 직접 연결되는  통로를 만들겠다.
			//   해당 파일이 존재하지않으면 자동으로 만들어지면서 통로와 연결되고/ 존재하는 파일이면 바로 통로 연결
			fout = new FileOutputStream("a_byte.txt"/*, true*/); // 내가 연결하고자 하는 파일명을 매개변수에 입력 
																			  // 연이어서 출력하고싶다면 true입력!!
																			  // true미작성시 => 덮어씌어짐 (기본값false)
																			  // ture 작성시   => 이어서 작성된다.
			
			// 2. 통로가 만들어 졌으니 이제 연결 통로로 데이터 출력하기 write( ) 메소드사용 (기록하다는 의미)
			//    1바이트 범위 : -128 ~ 127 까지의 숫자 (단, 파일에 기록되기로는 해당 숫자의 고유한 문자가 기록된다)
			//                  따라서, 음수는 불가하다 ( 아스키코드표에 음수는 존재하지않음, 0 ~ 127 까지만 가능) 
			fout.write(97); // a_byte에 입력된것 확인해보면 97은 a를 의미하기에  a가 기록되어있다. 
			fout.write('b');
			//fout.write('강'); //int와 char는 자유롭게 자동형변환 가능, 한글은 아스키코드표에서 벗어나기때문에 글자가 깨져서 출력(바이트스트림만으로는 제약이있다)
			
			byte[] bArr = {99, 100, 101};
			fout.write(bArr);
			// write(byte[] arr, int off, int len) : 전달된 배열의 off인덱스에서부터 len갯수만큼 출력
			fout.write(bArr, 1, 2); //bArr의 1번인덱스부터 2개를 전달할 것이다.

			// 3. 스트림이용을 완료했으면 반납을 해줘야한다. (반드시!)
			//fout.close(); //위에서 혹시라도 예외가 발생했을경우 이 구문은 실행되지않는다 따라서 반드시실행하기위해 finally블록으로 이동
			
			
		} catch (FileNotFoundException e) { // FileNotFoundException : 존재하지 않는 경로를 제시했을 때 발생! 
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
					// 중간에 예외가 발생하는 순간 catch구문으로 넘어가고 그럼 그사이의 코드는 실행되지않는다.	
		} finally { // 그래서 쓰는 것이 finally
			
				try {
					// 어떤 예외가  발생하던간에 반드시 실행할 구문 작성
					fout.close(); // 반드시스트림이용을 반납하여야하기때문에 finally안에 작성
					// 그리고 예외처리를 또 해야한다 
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}
	
	// 프로그램 <-- 외부매체(파일) ; 읽어들이겠다. 가져오겠다.
	// 입력 : 파일로부터 데이터를 가져오겠다. 받아오기
	public void fileRead() {
		
		// FileInputStream : 파일이라는 외부 매체로부터 데이터를 1바이트 단위로 입력받는 스트림 
		
		// 1. FileInputStream 객체 생성 == 해당 파일과의 입력용 연결통로를 만들겠다.
		// 입력이기때문에 해당파일이 존재하지않으면 FileNotFoundException 발생
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("a_byte.txt"); 
			
			// 2. 완성된 통로로부터 데이터 입력받기 (통로만들기==객체만들기, so 통로만들긴완성됨)
			//   단, 1byte단위로만 읽어온다. 
			// fin.read(); 
			//System.out.println(fin.read()); //출력하기위해 println구문
			//System.out.println(fin.read());
			//System.out.println(fin.read());
			//System.out.println(fin.read());
			//System.out.println(fin.read());
			//System.out.println(fin.read());
			//System.out.println(fin.read());
			//(문자 하나씩 1바이트 단위로 가져오기때문에 문자 수만큼 출력을 해줘야한다.)
			// 실제로 파일에 얼마만큼의 데이터가 있는지 모른다면?!
			
			// 해결방법1. 무한반복으로 돌려놓고 조건검사
			/*
			int value = 0;
			while(true) {
				value = fin.read(); // value라는 변수에 기록해놓고
				if(value == -1) {// value가 -1과 일치할경우 반복문 종료시키자
					break;
				}
				System.out.println(value);
			}
			*/
			
			// 해결방법2.
			int value = 0; 
			while( (value = fin.read()) != -1 ) { // 조건문에 벨류값이 -1이 될때까지 실행
				System.out.println((char)value); // int로 출력되기때문에 문자로 읽고싶다면 (char) 로 형변환해주기
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. 다쓴 스트림 반납하기
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	

}
