package com.kh.chap01_list.part02_mvc.view;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

// View 클래스 : 시각적인요소 (사용자가 보게될 화면과 같음)
// 				출력 및 입력
public class MusicView {
	
	private Scanner sc = new Scanner(System.in); //다른 메소드에서 사용할 수있도록 전역변수로 세팅
	//musicController 클래스 부를수있게 임포트하기
	private MusicController mc = new MusicController();
	
	
	// 메인화명 : 프로그램 실행시 제일 처음 보여지는 화면
	public void mainMenu() {
		
		while(true) {// 계속 화면 선택할수있도록 무한반복 
			
			System.out.println("\n==== Welcome 별밤 ====");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정 곡 검색");
			System.out.println("4. 특정 곡 삭제");
			System.out.println("5. 특정 곡 수정");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 입력: ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: insertMusic(); break; //곡추가
			case 2: selectMusicList(); break; //곡 전체 조회
			case 3: searchMusic(); break; //선택곡 조회
			case 4: deleteMusic(); break; // 곡 수정
			case 5: updateMusic(); break; // 다시반복// 스위치문의 break는 해당 스위치문만 빠져나감 
			case 0: System.out.println("프로그램을 종료하겠습니다. 안녕히가세요"); return;
			default: System.out.println("없는 메뉴를 입력했습니다. 다시입력하세요"); break;
			}
		}
	}
	
	public void insertMusic() {
		
		System.out.println("\n=== 곡 추가 ===");
		
		System.out.print("곡명 입력 : ");
		String title = sc.nextLine();
		System.out.print("가수명 입력 : ");
		String artist = sc.nextLine();
		
		// 요청 == controller에 메소드 호출
		mc.insertMusic(title, artist);
		System.out.println("성공적으로 추가되었습니다.");
	}
	
	// 2. 현재 전체곡을 조회할 수 있는 화면
	public void selectMusicList() {
		System.out.println("\n === 곡 리스트 ===");
		
		ArrayList<Music> list = mc.selectMusicList();
		
		if(list.isEmpty()) { //리스트가 비어있을 경우 => 곡 x
			System.out.println("현재 존재하는 곡이 없습니다");
			
		}else { // 리스트가 비어있지않을 경우 => 곡o
			for(int i=0;i<list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
	}
	
	public void searchMusic() {
		System.out.println("\n=== 곡 검색 ===");
		
		System.out.print("검색할 곡명 키워드 : ");
		String keyword = sc.nextLine();
		
		ArrayList<Music> searched = mc.searchMusic(keyword);
		
		if(searched.isEmpty()) {
			System.out.println("검색결과가 없습니다.");
		} else {
			for(Music m : searched ) {
				System.out.println(m);
			}
		}
	}
	
	public void deleteMusic() {
		System.out.println("\n=== 곡삭제 ===");
		
		System.out.print("삭제할 곡 명 : ");
		String title = sc.nextLine();
		
		int result = mc.deleteMusic(title);
		
		if(result>0) {//삭제진행됨
			System.out.println("성공적으로 삭제되었습니다.");
		} else { // 삭제 진행 x => 삭제할 곡 찾지 못함
			System.out.println("삭제할 곡을 찾지 못하였습니다.");
		}
		
	}
	
	//5. 곡 수정할 수 있는 화면
	public void updateMusic() {
		System.out.println("\n=== 곡 수정 ===");
		
		//기존곡명, 수정할 곡명/수정할 가수명
		System.out.print("기존곡명(수정하고자하는) : ");
		String title = sc.nextLine();
		
		System.out.print("수정내용(곡명) : " );
		String upTitle = sc.nextLine();
		
		System.out.print("수정내용(가수명) : ");
		String upArtist = sc.nextLine();
		
		int result = mc.updateMusic(title, upTitle, upArtist);
		
		if(result>0) {
			System.out.println("성공적으로 수정되었습니다.");
		}else {
			System.out.println("수정할 곡을 찾지못했습니다.");
		}
		
	}

}
