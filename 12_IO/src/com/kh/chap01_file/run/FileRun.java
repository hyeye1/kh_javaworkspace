package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		// 본격적으로 어떤 외부 매체 (파일) 에 대해서 데이터를 입력 및 출력하기 전에 
		// 파일을 만드는 등등에 대한 내용을 먼저보자!!
		// java.io.file 클래스를 가지고 작업
		
		try{
			
			// 1. 경로지정을 딱히 하지않은 채로 파일명 작성시 기본적으로 현재 이 프로젝트 폴더에 파일생성
			File f1 = new File("test.txt");
			f1.createNewFile(); // 이 메소드를 실행해야만 실제파일이 만들어진다
			
			// 2. 경로지정을 한 파일명 작성시 해당 그 경로에 파일이 생성
			File f2 = new File("C:\\test1\\test.txt"); // 해결방법 1 . 경로를 찾을 수 있게끔 폴더를 만들어주기
			f2.createNewFile();
			
			//3. 폴더생성 후 파일 생성하기
			File testFolder = new File("C:\\test2");
			testFolder.mkdir();
			
			File testFile = new File("C:\\test2\\test.txt");
			testFile.createNewFile();
			
			
			//4. 별도의 경로지정없이 폴더 생성후 파일 생성하기(프로젝트폴더 내에 생성됨)
			File folder = new File("test");
			folder.mkdir();
			File file = new File("test\\person.txt");
			file.createNewFile();
			
			// File 객체에서 제공하는 메소드 
			System.out.println(folder.isFile());
			System.out.println(file.isFile());
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("상위폴더 : " + file.getParent());
			System.out.println("파일용량 : " + file.length());
			System.out.println("절대경로 : " + file.getAbsolutePath());
			
		} catch(IOException e ) {
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램을 종료합니다.");
		/*
		 * 프로그램상의 데이터를 외부매체(모니터, 스피커, 파일, 시스템..) 로 출력한다거나 
		 * 또는 외부매체(키보드, 마이크, 파일, 시스템 ..) 로부터 데이터 입력을 받아오는 과정을 하고자 한다면
		 * 반드시 프로그램과 외부매체와의 "통로"를 만들어야함 ==> "스트림"
		 * 
		 * 스트림
		 * 단방향: 하나의 스트림으로 입출력을 동시에 x, 입력용/출력용 스트림 별개
		 * 선입선출(FiFo) 파이프와 같은것이기때문에 먼저 들어간게 먼저 나감 => 시간지연
		 * 
		 * 
		 * 
		 * 스트림의 구분
		 * > 통로의 사이즈
		 * - 바이트 스트림 : 1byte짜리가 왔다갔다 할 수 있을 정도의 사이즈 (통로가 좁음) => 입력 (inputStream)/출력(outputStream)
		 * - 문자스트림 : 2byte 짜리가 왓다갔다 할 수 있을 정도의 사이즈 (통로가 넓음) => 입력(reader)/출력(writer)
		 * => xxxInputStream/ xxxOutputStream -> 의 부모 : inputStream & OutputStream
		 * => xxxReader/ xxxWriter -> 의 부모 : Reader & Writer
		 * 
		 * >외부매체와 직접연결 여부
		 * - 기반스트림(기본스트림): 외부매체와 직접적으로 연결하는 통로
		 * - 보조스트림: 기반스트림만으로 부족한 성능을 향상시켜주는 용도 (외부매체와 직접적으로 연결되는 통로가 아니다)
		 * 				(속도를 향상시킨다거나, 자료형에 맞춰서 변환한다거나 등등 요융한 기능들을 제공하는 스트림)
		 * 				단, 보조스트림은 단독으로 사용 불가! 외부매체와  직접적으로 연결되는 기반스트림 필수!
		 * 
		 * 
		 * 
		 */
	}

}
