package com.kh.chap01_list.part02_mvc.view;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

// View Ŭ���� : �ð����ο�� (����ڰ� ���Ե� ȭ��� ����)
// 				��� �� �Է�
public class MusicView {
	
	private Scanner sc = new Scanner(System.in); //�ٸ� �޼ҵ忡�� ����� ���ֵ��� ���������� ����
	//musicController Ŭ���� �θ����ְ� ����Ʈ�ϱ�
	private MusicController mc = new MusicController();
	
	
	// ����ȭ�� : ���α׷� ����� ���� ó�� �������� ȭ��
	public void mainMenu() {
		
		while(true) {// ��� ȭ�� �����Ҽ��ֵ��� ���ѹݺ� 
			
			System.out.println("\n==== Welcome ���� ====");
			System.out.println("1. ���ο� �� �߰�");
			System.out.println("2. �� ��ü ��ȸ");
			System.out.println("3. Ư�� �� �˻�");
			System.out.println("4. Ư�� �� ����");
			System.out.println("5. Ư�� �� ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("�޴� �Է�: ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: insertMusic(); break; //���߰�
			case 2: selectMusicList(); break; //�� ��ü ��ȸ
			case 3: searchMusic(); break; //���ð� ��ȸ
			case 4: deleteMusic(); break; // �� ����
			case 5: updateMusic(); break; // �ٽùݺ�// ����ġ���� break�� �ش� ����ġ���� �������� 
			case 0: System.out.println("���α׷��� �����ϰڽ��ϴ�. �ȳ���������"); return;
			default: System.out.println("���� �޴��� �Է��߽��ϴ�. �ٽ��Է��ϼ���"); break;
			}
		}
	}
	
	public void insertMusic() {
		
		System.out.println("\n=== �� �߰� ===");
		
		System.out.print("��� �Է� : ");
		String title = sc.nextLine();
		System.out.print("������ �Է� : ");
		String artist = sc.nextLine();
		
		// ��û == controller�� �޼ҵ� ȣ��
		mc.insertMusic(title, artist);
		System.out.println("���������� �߰��Ǿ����ϴ�.");
	}
	
	// 2. ���� ��ü���� ��ȸ�� �� �ִ� ȭ��
	public void selectMusicList() {
		System.out.println("\n === �� ����Ʈ ===");
		
		ArrayList<Music> list = mc.selectMusicList();
		
		if(list.isEmpty()) { //����Ʈ�� ������� ��� => �� x
			System.out.println("���� �����ϴ� ���� �����ϴ�");
			
		}else { // ����Ʈ�� ����������� ��� => ��o
			for(int i=0;i<list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
	}
	
	public void searchMusic() {
		System.out.println("\n=== �� �˻� ===");
		
		System.out.print("�˻��� ��� Ű���� : ");
		String keyword = sc.nextLine();
		
		ArrayList<Music> searched = mc.searchMusic(keyword);
		
		if(searched.isEmpty()) {
			System.out.println("�˻������ �����ϴ�.");
		} else {
			for(Music m : searched ) {
				System.out.println(m);
			}
		}
	}
	
	public void deleteMusic() {
		System.out.println("\n=== ����� ===");
		
		System.out.print("������ �� �� : ");
		String title = sc.nextLine();
		
		int result = mc.deleteMusic(title);
		
		if(result>0) {//���������
			System.out.println("���������� �����Ǿ����ϴ�.");
		} else { // ���� ���� x => ������ �� ã�� ����
			System.out.println("������ ���� ã�� ���Ͽ����ϴ�.");
		}
		
	}
	
	//5. �� ������ �� �ִ� ȭ��
	public void updateMusic() {
		System.out.println("\n=== �� ���� ===");
		
		//�������, ������ ���/������ ������
		System.out.print("�������(�����ϰ����ϴ�) : ");
		String title = sc.nextLine();
		
		System.out.print("��������(���) : " );
		String upTitle = sc.nextLine();
		
		System.out.print("��������(������) : ");
		String upArtist = sc.nextLine();
		
		int result = mc.updateMusic(title, upTitle, upArtist);
		
		if(result>0) {
			System.out.println("���������� �����Ǿ����ϴ�.");
		}else {
			System.out.println("������ ���� ã�����߽��ϴ�.");
		}
		
	}

}
