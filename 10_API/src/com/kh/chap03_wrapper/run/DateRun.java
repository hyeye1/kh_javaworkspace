package com.kh.chap03_wrapper.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {
	
	public static void main(String[] args) {
		/*
		 * Java.util.Date;
		 * 
		 * ��¥�� �ð��� ���� ������ ���� �� �ִ� Ŭ����
		 * �ڹٰ�����â�⿡ ���ϰԸ��� �ϼ����� �������� Ŭ����
		 * �ٱ������� ���⵵ ���������ʴ�.
		 * 
		 */
		// �⺻�����ڸ� ���� date��ü ����=> ���� ��¥ �� �ð��� �������(�ý��۳�¥)
		Date today = new Date();
		System.out.println("�⺻������: " +  today);
		
		//���� ���ϴ� ��¥ (2020�� 6�� 19��)
		//1) �Ű����������ڸ� ����
		Date date1 = new Date(2020, 06, 19); //deprecated: ���� ��
		//  ���������� ���� ������ �⵵  +1900 => �����ϰ��� �ϴ� ���� -1900
		// 			   ���� ������ �� +1 => �� -1
		Date date2 = new Date(2020-1900, 6-1, 19, 19, 15, 30);
		System.out.println("�Ű����������� : " + date2);
		
		// " 2020 �� 06�� 19�� 19�� 15�� 30��"
		// �� �Ը���� ������ ������ ���ڿ��� �ް����Ҷ�
		// java.text.SimpleDateFormat 
		
		//1. ������ �����ϸ鼭 SimpleDateFormat ��ü����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		
		//2. sdf��ü���� �����ϴ� format�޼ҵ� ȣ��� date ��ü ���� => ���������� String ���ƿ�
		// sdf.format(Date��ü) : String
		String formatDate = sdf.format(date2);
		System.out.println(formatDate);
		
	}
	
	
}
