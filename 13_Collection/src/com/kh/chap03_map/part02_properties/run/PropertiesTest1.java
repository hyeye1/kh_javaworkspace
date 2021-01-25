package com.kh.chap03_map.part02_properties.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class PropertiesTest1 {

	public static void main(String[] args) {
		// Properties : Map �迭 => Ű, ��� ��Ʈ�� �����
		//				��,  Properties���� Ư¡�̶�� �Ѵٸ� Ű, ��� ��� String���� ������ �Ǿ��ִ�. 
		
		Properties prop = new Properties();
		
		// Map �迭�̱� ������ put �޼ҵ带 ���ؼ� Ű+���� �߰�����
		prop.put("������", new Snack("���ڸ�", 1500));
		
		System.out.println(prop);
		System.out.println(prop.get("������"));
		
		//��, �ַ�  Properties �� ����ϴ� ���� Properties�� ����ִ� key+value ��Ʈ���� ���Ϸ� ��Ͻ�Ų�ٰų�(storeXXX())
		//���Ͽ� ��ϵǾ��ִ� key+value�� ������ö�(loadXXX()) �ַλ���
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
		
		// �׷��� Properties�� ���� �߰��Ҷ��� ����
		// 1. setProperty(String key, String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop); //������� ���� �ȵ�, key�� �ߺ��ȵ�
		
		//2. getProperty(String key) : String
		System.out.println(prop.getProperty("set"));
		
		try {
			//3. store(OutputStream os, String Comments) : Properties �� ��� key-value ������ ���Ϸ� ���
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
