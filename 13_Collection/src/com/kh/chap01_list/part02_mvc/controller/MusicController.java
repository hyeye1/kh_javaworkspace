package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// Controller 클래스 : 사용자의 요청을 받아서 처리해주는 클래스
//						처리결과를 돌려주는 역할까지 
// Music클래스에있는 메소드들을 호출 후 return결과값 반환
public class MusicController {
	
	// 내가 보유하고 있는 몇가지 곡들을 담을 리스트생성
	private ArrayList<Music> list = new ArrayList<>();
	{//초기화 블럭
		list.add(new Music("Good Bye", "박효신"));
		list.add(new Music("딩가딩가", "마마무"));
		
	}
	
	// 새로운 곡 추가요청시 실행될 메소드
	public void insertMusic(String title, String artist) {
		
		list.add(new Music(title, artist));
	}
	
	// 곡 전체 조회 요청시 실행될 메소드
	public ArrayList<Music> selectMusicList(){		
		return list;
	}
	
	public ArrayList<Music> searchMusic(String keyword) {
		
		ArrayList<Music> searched = new ArrayList<>();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				searched.add(list.get(i));
			}
		}
		
		return searched;
	}
	
	public int deleteMusic(String title) {
		
		int result = 0; //삭제 진행된 갯수
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				//System.out.println("성공적으로 삭제하였습니다.");
				result++;
			}
			
		}
		
		return result; // 0일수도있고 양수값일수도 있음
		
	}
	
	public int updateMusic(String title, String upTitle, String upArtist) {
		
		int result = 0;//수정된 곡 개슈
		for(int i=0; i<list.size(); i++) {
			
			if(list.get(i).getTitle().equals(title)) {
				list.get(i).setTitle(upTitle);
				list.get(i).setArtist(upArtist);
				//System.out.println("성공적으로 수정되었습니다.");
				result++;
			}
		}
		return result; //0일 수도 있고 양수일 수도 있음
	}
	
}
