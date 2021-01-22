package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_basic.model.vo.Music;

/*
 * * 컬렉션이란?
 	 - 자료구조가 내장되어있는 클래스
 	 - 자바에서 제공하는 "자료구조"를 담당하는 "프레임워크"이다.
 	 방대한 데이터들을 앞으로 처리해야하는데 
 	 우리가 직접 코드로서 기술을 하여도 되지만 이미 다 내제되어있기 때문에 방대한데이터를
 	 수정하거나 추가하거나 등등을 내가 작성할 필요없음. 
 	 굳이 번거로운 코드를 짤 필요없음 (컬렉션을 이용하면)
 	 
 	 - 새로운 데이터를 추가한다거나, 삭제한다거나, 정렬시킨다거나 등등의 기능을 처리할때 
 	 따로 코드로써 구현할 필요없이 이런 방대한 데이터를 효율적으로, 구조적으로 다룰 수 있는 알고리즘이 내장되어있는 컬렉션을 이용하면 
 	 간단하게 해결 가능  (알고리즘을 코드로써 짤 필요가없다.)
 	 
 	 
 	 	> 자료 구조?
 	 	- 방대한 데이터를 효율적으로 구조적으로 다룰때 필요한 알고리즘이다. (ex.책장의 라벨같은것들)
 	 	> 프레임워크?
 	 	- 이미 만들어져 있는 틀 
 
 	  
   * 우리가 방대한 데이터를 다룰때 사용했던 배열과의 비교
   * 배열의 단점을 보완한것이 컬렉션
   
   * 배열 VS 컬렉션
     
     > 배열의 단점
     1. 배열의 크기:배열을 쓰고자 할 때는 먼저 크기를 꼭 지정해줬어야 했다. 뿐만아니라 한번 지정된 크기는 변경불가했었다.
     	애초에 크기를 크게 할당하면? => 메모리 낭비 
     	
     2. 배열의 중간위치에 새로운 데이터를 추가하거나 삭제하는 경우 땡겨주거나 늘려주는 작업을 일일히 
     	코드로써 알고리즘을 구현해야된다. 
     	
     3. 해당 자료형 한가지 타입의 데이터들만 저장이 가능하다.
     
     ==>> 변동사항이 없다면 배열을 많이쓴다.
     
     	
     > 컬렉션의 장점 (배열의 단점이 보완)
     1. 크기를 꼭 지정할 필요는 없다(해도 상관은 없음) 또한 크기가 알아서 늘어난다 -> 크기에 제약이없음
     
     2. 중간에 값을 추가하거나 삭제하는 경우, 알고리즘을 직접 구현할 필요 없다. 
     	이미 메소드로 정의되어있기때문에 호출만 해주면 구현이 된다.
     
     3. 여러타입의 데이터를 저장할 수 있음 (단, 객체단위로만 저장가능)
     
     ==>> 방대한 데이터들을 담고 새로운 데이터들이 추가되거나 삭제하거나.. 이런 과정들이 빈번할ㄱ같은 경우 => 컬렉션을 사용
     	   단지 방대한 데이터들을 보관만 시켜서 조회할 용도로는 배열을 사용한다.
     	   
     
     * 컬렉션 종류 (컬렉션의 주요 인터페이스)
     1. List 계열
     	구현 클래스 - *ArrayList/Vector(arraylist이전버전)/LinkedList 
     
     2. Set 계열
     	구현 클래스 - HashSet/TreeSet
     
     3. Map 계열 
     	구현 클래스 - *HashMap/HashTable/TreeMap/ *Properties
     
     
     
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class BasicRun {

	public static void main(String[] args) {
		
		/*
		 * 제네릭(<>)을 제시하는 이유
		 * 1. 내가 제시한 타입의 객체만 저장하게끔 타입의 제한을 두기위해서 
		 * 2. 컬렉션에 저장된 객체를 꺼내서 쓸때 매번 형변환하는 절차를 없애기 위해
		 * 3. 보안상의 이유(모든 타입이 다 담길수있기때문에 보안에 취약해진다)
		 */
		
		ArrayList<Music> list = new ArrayList<>(3); //크기지정가능
		
		System.out.println(list); // 안에 아무것도없음 
		
		// E  --> Element: 리스트에 담길 요소들
		//1. add( E e ) => 리스트의끝에 해당 전달된 객체를 추가해주는 메소드
		list.add(new Music("Good Bye", "박효신"));
		list.add(new Music("이 밤", "양다일"));
		list.add(new Music("잊혀지다", "정키"));
		//list.add("끝");
		
		// 지정한 크기보다 더 많이 넣어도 오류나지 않는다      => 장점1
		// 다양한 타입이 추가가 되어도 상관이 없다.         => 장점2
		System.out.println(list);
		
		// 2. add(int index, E e) : 해당 index에 전달된 객체를 추가해주는 메소드
		list.add(1, new Music("진심이 담긴 노래", "케이시"));
														// 1번인덱스에 추가!
		System.out.println(list);
		
		// 3. set(int index, E e) : 해당 index에 담긴 값을 전달된 객체로 변경해주는 메소드
		list.set(0, new Music("술이 달다", "에픽하이"));  // list.set => 수정!!
		
		System.out.println(list);
		
		// 4. size(): 해당 리스트 안에 데이터 갯수
		System.out.println("현재 리스트 크기 : " +list.size());
		
		// 5. remove(int index) : 해당 index에 담긴 객체 삭제후 뒤에것들 앞으로 땡겨오는 과정
		list.remove(1);
		
		System.out.println(list);
		
		//6. get(int index) : E => 해당 인덱스에 존재하는 객체를 반환해주는 메소드
		Music m = /*(Music)*/list.get(0);
		System.out.println(m);
		
		System.out.println(list.get(0));
		list.get(0).getTitle();
		
		//7. subList(int index1, int index2) : 해당 인덱스에서부터 다음인덱스이전까지를 추출해서 새로운 List로 반환해줌
		List<Music> sub = list.subList(0, 1);  // java.util에있는 List를 import해주기
		System.out.println(sub);
		
		// 8. addAll(Collection c) 컬렉션을 통째로 뒤에 추가해주는 메소드
		list.addAll(sub);
		System.out.println(list);
		
		// 9. clear(); 컬렉션 비워주는 메소드
		list.clear();
		System.out.println(list);
		
		// 10. isEmpty(); 해당 컬렉션이 비어있는지 묻는 메소드
		System.out.println(list.isEmpty());
		
		System.out.println("=====================");
		
		//반복문을 통해서 출력해보자
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)); // arr[i] 
		}

	}

}
