package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

//������ �����Ű���� (ElectronicRun�� ��ǰ��ü)
public class ElectronicController1 {
	
	//������ڻ� ������������
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
	public void insert(Desktop d) {
		// Desktop d = new Desktop("�Ｚ ~ ��ž~ 12000 ~ ������) ���������� �ۼ��Ǿ�����
		desk = d;
	}
	//�޼ҵ���� ���Ƶ� �Ű������� �ٸ��⿡ ��������> �����ε�
	public void insert(NoteBook n) {
		note = n;
	}
	
	public void insert(Tablet t) {
		tab = t;
	}
	
	// �ʵ�ΰ� �����̺��̱⿡ �����ִ� �޼ҵ常�����
	public Desktop selectDesktop() {
		return desk;  // desk�� �ڷ����� Desktop
	}
	public NoteBook selectNoteBook() {
		return note;
	}
	public Tablet selectTablet() {
		return tab;
	}
	//���ó���� Ŭ�����̱⶧����  setter getter�� ��������ʴ´�
	//������, �̸��� �ٸ��� ���� ������ �Ȱ��� setter-> �Է¿� getter-> ��¿�






}
