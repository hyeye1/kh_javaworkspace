package com.kh.chap02_abstractAndInterface.par01_basic.run;

import com.kh.chap02_abstractAndInterface.par01_basic.model.vo.Basketball;
import com.kh.chap02_abstractAndInterface.par01_basic.model.vo.Football;
import com.kh.chap02_abstractAndInterface.par01_basic.model.vo.Sports;

public class BasicRun {

	public static void main(String[] args) {

		//Sports s = new Sports();
		// �߻� Ŭ������ ���� �Ұ�! (��? �̿ϼ��� Ŭ�����̱� ������)
		
		//Sports s; �� ��ü������ �ȵɻ����� ���۷��� �����δ� ��밡��
		/*1.*/Sports s = new Football(); // �������� �����ؼ� �ڽİ�ü�� �޾��ִ� �뵵�� ���
		
		/*2.*/Sports[] arr = new Sports[2];
		arr[0] = new Basketball();
		arr[1] = new Football();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].rule();
		}
		/*
		 * �߻�Ŭ���� (�̿ϼ�Ŭ����) abstract class
		 * �߻�޼ҵ尡 �����ϴ� ���� �ݵ�� �߻�Ŭ������ ����
		 * (�Ϲ��ʵ�+�Ϲݸ޼ҵ�+[�߻�޼ҵ�])
		 * 
		 * ��, �߻�޼ҵ尡 ���� ��� �߻�Ŭ������ �� �� ����
		 * ����?
		 * => ���� ��ü������ ���� �� ������ �����ΰ� ������ (������)
		 * => �� Ŭ������ ��ü������ �Ұ��ϰԲ� �ϰ��� �Ҷ� (�����)
		 * 
		 * - ��ü ���� �Ұ�
		 * ��, ���۷��� �����δ� ��밡��(���������밡��)
		 * 
		 * �߻�޼ҵ�
		 * - �̿ϼ��� �޼ҵ�� ����ΰ�(){} �����Ǿ��������� �޼ҵ�
		 * - �ڽ�Ŭ�������� �������̵��� ���� �ϼ���(������ �������̵� �ؾߵ�)
		 * => �������̵� �������� ��� �����߻�
		 * => �޼ҵ� ����� ���ϼ� Ȯ������
		 * => ǥ��ȭ�� Ʋ�� ������ ����
		 */
		
	}

}
