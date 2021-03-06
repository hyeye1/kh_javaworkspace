package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest2 {

	public static void main(String[] args) {
		
		Properties prop = new Properties(); // 비어있는상태
		
		try {
			// 5. load 읽어오기
			prop.load(new FileInputStream("test.properties"));
			
			// 6. loadFromXML(InputStream is)
			prop.loadFromXML(new FileInputStream("test.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop);
		/*
		 * 
		 * .properties 사용하느 경우는
		 * 해당 프로그램이 기본적으로 가져야할 정보들을 .properties확장자 문서로 저장해두면
		 * key value 모두 문자열이기때문에 개발자가아닌 일반 관리자가 해당 문서를 다루기 쉽다.
		 * -> JDBC 가서 사용할 예정
		 * 
		 * .xml사용하는 경우는
		 * -.xml 확장자 문서는 다양한 프로그래밍 언어간에 호황이 쉽다.
		 */
		

	}

}
