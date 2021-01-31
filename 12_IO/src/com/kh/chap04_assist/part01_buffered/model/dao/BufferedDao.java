package com.kh.chap04_assist.part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
	// BufferedReader/BufferedWriter
	
	// 프로그램 --> 파일 (출력)
	public void fileSaver() {
		
		// 1. 기반스트림( FileWriter ) 객체 먼저 생성
		//FileWriter fw = new FileWriter("c_buffer.txt");
		// 2. 이 기반스트림을 가지고 보조스트림을 생성해주기
		//BufferedWriter bw = new BufferedWriter(fw); //어떤 기반스트림객체를 향상시킬것인지 입력
		
		// 1+2. 위의 과정 한번에 처리가능
		/*
		BufferedWriter bw = null; 
		try {
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine(); // 개행 == \n
			bw.write("저리가세요");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		//try ~ with ~ resource 구문 (jdk7버전부터만 가능)
		/*
		 * try (스트림 객체 생성 구문 ; 스트림 객체 생성 구문) {
		 * 
		 *  } catch (예외클래스명 e) {
		 *  
		 *  }
		 *  
		 *  try() 안에 작성된 스트림 객체는 다 사용되면 알아서 반납됨
		 *   
		 * 
		 */
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_Buffer.txt"))){
				
			bw.write("안녕하세요 \n");
			bw.write("반갑습니다");
			bw.newLine();
			bw.write("저리가세요");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	// 프로그램 <-- 파일 (입력)
	public void fileRead() {
		
		//BufferedReader FileReader
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
			
			/*
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			*/
			
			String value = null;
			while((value=br.readLine()) != null ) {
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}

}
