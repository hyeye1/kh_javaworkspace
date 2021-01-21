package com.kh.chap04_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectsDao {
	
	//프로그램 --> 파일(출력)
	public void fileSave(String fileName) {
		
		/*
		Phone[] arr = new Phone[3];
		arr[0] = new Phone("엘지", 1000000);
		arr[1] = new Phone("삼성", 2000000);
		arr[2] = new Phone("애플", 1500000);
		*/
		
		// ArrayList클래스에 Phone만 저장할 수 있도록 객체 생성(제네릭사용해서)
		ArrayList<Phone> phoneList = new ArrayList<>();
		
		phoneList.add(new Phone("엘지", 1000000));
		phoneList.add(new Phone("삼성", 2000000));
		phoneList.add(new Phone("애플", 1500000));
				
		System.out.println(phoneList);
		
		// FileOutputStream
		// ObjectOutputStream
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			
			/*
			for(int i =0; i<arr.length;i++) {
				oos.writeObject(arr[i]);
			}
			*/
			for(int i=0; i<phoneList.size(); i++) {
				oos.writeObject(phoneList.get(i));
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) { 	
			e.printStackTrace();
		}

	}
	
	// 프로그램 <-- 파일(입력)
	public void fileRead() {
		
		// FileInputStream +objectInputStream
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phones.txt"))){
			
			while(true) {
				System.out.println(ois.readObject());
				System.out.println(ois.readObject());
				System.out.println(ois.readObject());
				System.out.println(ois.readObject());
			}
			
		} catch (FileNotFoundException e) { // 캐치블럭이 작성되어있다는것만으로도 예외처리가 된것
			e.printStackTrace(); //구문을 작성하지않으면 어디서 문제가 발생했는지 알 수 없다.
			// 어디서 오류가 났는지를 추적해서 출력해주는것 print 출력하다 stacktrace어디서 오류가 났는지 
			//개발자한테 오류가 어디서났는지 알려주는 목적
		} catch (EOFException e) {
			//e.printStackTrace();
			System.out.println("파일을 다 읽었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // 
		}
		
		System.out.println("프로그램이 종료됩니다.");
				
	} 
	
	/*
	 * 보조스트림
	 - Buffered InputStream/ OutputStream /Reader/Writer : 버퍼라는 공간을 제공해줌으로써 데이터 입출력시 버퍼에 데이터를 모아서 한꺼번에
	 										입출력을 하게끔 해주기때문에 속도향상에 좋다.
	 - Object InputStream/OutputStream					 : 객체자체를 입출력할 수 있게끔 도와주는 스트림( 단 직렬화처리를 해주어야함)
	 - Data InputStream/OutputStream					 : 기본자료형별 데이터를 입출력가능하게 도와줌					
	 */

}
