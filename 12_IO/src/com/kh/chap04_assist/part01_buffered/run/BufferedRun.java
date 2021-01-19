package com.kh.chap04_assist.part01_buffered.run;

import com.kh.chap04_assist.part01_buffered.model.dao.BufferedDao;

public class BufferedRun {

	public static void main(String[] args) {
		/*
		 * 
		 * 보조스트림
		   일반 기반스트림(외부매체와 직접 연결 되어있는 통로)만으로
		   부족했던 성능을 향상시켜준다거나
		   기반스트림에서는 제공하지 않는 추가적인 메소드를 활용할때 사용
		   보조스트림 단독사용 불가 (단독 객체생성불가)
		   
		   보조스트림 변수명 = new 보조스트림(기반스트림객체); --> 기반스트림객체를 넘겨주면서 생성해주어야함
		  
		   > BufferedXXX : 속도향상을 해줄 수 있음!!
		   					왜? 버퍼공간을 제공해서 한번에 모아놨다가 한꺼번에 입력및 출력 진행
		   					
		  
		  
		 */
		
		BufferedDao bd = new BufferedDao();
		//bd.fileSaver();
		bd.fileRead();
		
	}

}
