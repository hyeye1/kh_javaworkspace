package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;



import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {
	
	public static void main(String[] args) {
		
		HashMap<String, Snack> hm = new HashMap();
		
		// 계층구조를 보면 List나 Set계열은 Collection구현한 클래스 => 데이터를 추가할 때 add메소드
		// 단, Map은 아니다. =>> 데이터를 추가할때 put메소드(key+value 세트로 추가)
		
		//1. put(K key, V value)          =>  map 공간에 key+value 세트로 추가해주는 메소드
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸초", new Snack("단맛", 600));
		hm.put("새우깡", new Snack("짠맛", 500));
		
		hm.put("포테이토칩", new Snack("짠맛", 500));
		
		System.out.println(hm); // 저장순서 유지 x, value값이 동일하다고 해도 키값이 중복되지ㅏ 않기 때문에 잘 저장됨
		
		hm.put("새우깡", new Snack("매운맛", 700)); // 중복된 Key값의 value값으로 덮어씌어짐
		
		System.out.println(hm);
		
		//2. get(Object key) : V => 컬렉션에서 해당 키값의 Value값을 돌려주는 메소드
		System.out.println(hm.get("다이제"));
		
		Snack s = (Snack) hm.get("칸초"); //가지고와서 snack타입의 변수에 담을것 -> 형변환해주어야함
		System.out.println(s);
		
		//3. size() => 컬렉션에 담겨있는 갯수
		System.out.println("size: " + hm.size());
		
		//4. replace(K key, V value) => 컬렉션에 해당 Key값을 찾아서 새로 전달된 Value로 변경시켜주는 메소드
		hm.replace("포테이토칩", new Snack("겁나짠맛 ", 1000));
		
		//5. remove(Object key) => 컬렉션 해당 키값 찾아서 키 + value 세트로 지워주는 메소드
		hm.remove("포테이토칩");
		System.out.println(hm);
		
		// 순차적으로 Hashmap에 담겨있는 것을 접근하고자 할 떄?
		//ArrayList list = new ArrayList(hm);
		
		// iterator()는 List나 set계열에서만 쓴느 메소드이기때문에 바로안된다
		//Iterator it = hm.iterator();
		
		//Map 을 set으로 바꿔주는 메소드 제공함 (총 2개)
		//Hashmap == > Set계열 ==> Iterator
		
		//1. KeySet()을 이용하는 방법
		
		//1) hm 에 있는 키들만 set에 담기(키들의 집합형태)
		Set<String> keySet = hm.keySet();
		
		//2) 1번과정에서 작업된 keySet을 Iterator에 담기
		// keySet.iterator() : Iterator
		Iterator<String> itKey = keySet.iterator();
		
		//3) 반복자에 담긴것들 순차적으로 뽑기 (반복문 이용)
		while(itKey.hasNext()) {
			String key = itKey.next();
			Snack value = hm.get(key);
			System.out.println("Key : " +key);
			System.out.println("Value : " +value);
		}
		
		//2. entrySet()이용하는 방법
		
		//1) hm에 있는 key+value 모두 (Entry)  Set에 담기 (engry집합형태)
		Set<Entry<String, Snack>> entrySet = hm.entrySet();
		
		//List랑 Map은 다른꼐열이기때문에 ArrayList담은 후 출력은 불가
		
		
		//2) entrySet에 있는 것들을 Iterator 에 담기
		Iterator<Entry<String,Snack>> itEntry = entrySet.iterator();
		
		//3) 반복문을 이용해서 순차적으로 뽑기
		while(itEntry.hasNext()) {
			Entry<String,Snack> entry = itEntry.next();
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
		}
		
		
	}

}
