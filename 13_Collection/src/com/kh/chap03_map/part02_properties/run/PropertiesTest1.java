package com.kh.chap03_map.part02_properties.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class PropertiesTest1 {

	public static void main(String[] args) {
		// Properties : Map 계열 => 키, 밸류 세트로 저장됨
		//				단,  Properties만의 특징이라고 한다면 키, 밸류 모두 String으로 제한이 되어있다. 
		
		Properties prop = new Properties();
		
		// Map 계열이기 때문에 put 메소드를 통해서 키+벨류 추가가능
		prop.put("다이제", new Snack("초코맛", 1500));
		
		System.out.println(prop);
		System.out.println(prop.get("다이제"));
		
		//단, 주로  Properties 를 상요하는 경우는 Properties에 담겨있는 key+value 세트들을 파일로 기록시킨다거나(storeXXX())
		//파일에 기록되어있는 key+value를 가지고올때(loadXXX()) 주로사용됨
		/*try {
			prop.store(new FileOutputStream("test.properties"), "Properties test");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		// 그래서 Properties에 갑을 추가할때는 보통
		// 1. setProperty(String key, String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop); //저장순서 유지 안됨, key값 중복안됨
		
		//2. getProperty(String key) : String
		System.out.println(prop.getProperty("set"));
		
		try {
			//3. store(OutputStream os, String Comments) : Properties 에 담긴 key-value 값들을 파일로 출력
			prop.store(new FileOutputStream("test.properties"), "Properties Test");

			//4. storeToXML(OutputStream os, String comments) : Prop
			prop.storetoXML(new FileOutputStream("test.xml"));
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	
		
	}

}
