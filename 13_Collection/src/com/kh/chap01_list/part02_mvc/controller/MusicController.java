package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// Controller Ŭ���� : ������� ��û�� �޾Ƽ� ó�����ִ� Ŭ����
//						ó������� �����ִ� ���ұ��� 
// MusicŬ�������ִ� �޼ҵ���� ȣ�� �� return����� ��ȯ
public class MusicController {
	
	// ���� �����ϰ� �ִ� ��� ����� ���� ����Ʈ����
	private ArrayList<Music> list = new ArrayList<>();
	{//�ʱ�ȭ ��
		list.add(new Music("Good Bye", "��ȿ��"));
		list.add(new Music("��������", "������"));
		
	}
	
	// ���ο� �� �߰���û�� ����� �޼ҵ�
	public void insertMusic(String title, String artist) {
		
		list.add(new Music(title, artist));
	}
	
	// �� ��ü ��ȸ ��û�� ����� �޼ҵ�
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
		
		int result = 0; //���� ����� ����
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				//System.out.println("���������� �����Ͽ����ϴ�.");
				result++;
			}
			
		}
		
		return result; // 0�ϼ����ְ� ������ϼ��� ����
		
	}
	
	public int updateMusic(String title, String upTitle, String upArtist) {
		
		int result = 0;//������ �� ����
		for(int i=0; i<list.size(); i++) {
			
			if(list.get(i).getTitle().equals(title)) {
				list.get(i).setTitle(upTitle);
				list.get(i).setArtist(upArtist);
				//System.out.println("���������� �����Ǿ����ϴ�.");
				result++;
			}
		}
		return result; //0�� ���� �ְ� ����� ���� ����
	}
	
}
