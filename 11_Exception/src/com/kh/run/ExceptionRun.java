package com.kh.run;

import java.io.IOException;

import com.kh.exception.CheckedException;
import com.kh.exception.UnCheckedException;

public class ExceptionRun {

	public static void main(String[] args) throws IOException {
		
		/*
		 * ���� ����
		 - �ý��� ���� : ��ǻ���� ���۵����� �߻��ϴ� ���� => �ҽ��ڵ�� �ذ�ȵ�(�ɰ��� ����)
		 - ������ ���� : �ҽ��ڵ���� ������ ���� => ���ʿ� �����ٷ� �˷��� ( ���? �Ź� �������� ����ǰ� �ֱ� ������)
		 									  => ���ʿ� �ذ����� ������ ���α׷� ���� ��ü�� �����ʴ´�. 
		 - ��Ÿ�� ���� : �ڵ� �����δ� ������ ������, ���α׷� ����� �߻��ϴ� ����
		 				=> ������� �Ǽ��� ���� �ְ�, �����ڰ� ���������� ��츦 ����� ó���س��� ���� ������ ���� �ִ�.
		 - �� ���� : �ڵ�� ���������� ���������� �ʰ� ������������ ���� ������ ���� .. �ٸ� ���α׷� �ǵ��� ���� �ʴ� ��
		 
		 �츮�� �ý��� ������ ������ �����Ͽ���, ��Ÿ�ӿ���, �������� ���� ���� �� �ɰ��� �͵��� ������ �۾��� �Ѵ�
		 �̷��͵��� "����" ����Ѵ� => exception
		 
		 �̷��� ���ܵ��� "�߻�" ���� ���� ����ؼ�
		 "�߻����� ��� ������ ������� ����" �� �δ� ��" ����ó��" ����Ѵ�
		 
		 *����ó�� ���
		 1. try~catch ���� �̿�
		 2. throws �� �̿� (���ѱ�� == ����)
		 3. try~with~resource
		  
		 */
		
		UnCheckedException uc = new UnCheckedException();
		//uc.method1();
		//uc.method2();
		//uc.method3();
		
		CheckedException c = new CheckedException();
		/*
		try {
			c.method1();
		} catch (IOException e ) {
			
		}
		*/
		c.method1();
	}

}
