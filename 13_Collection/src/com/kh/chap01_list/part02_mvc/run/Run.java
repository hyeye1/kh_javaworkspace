package com.kh.chap01_list.part02_mvc.run;

import com.kh.chap01_list.part02_mvc.view.MusicView;

/*
 * m (model) : 데이터를 담당하는 역할
 * model.vo/ model.dao
 * v (view) : 시각적인 요소 담당 (화면) => 출력 및 입력은 무조건 이클래스에서 작성할 것이다.
 * c (controller) : 
 * r run : 실행만 시켜준 메소드
 */
public class Run {

	public static void main(String[] args) {
		
		MusicView mv = new MusicView();
		
		mv.mainMenu();
		
		
	}

}
