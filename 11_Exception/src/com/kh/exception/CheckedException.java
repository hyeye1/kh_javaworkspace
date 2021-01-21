package com.kh.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {
	
	/*
	 * CheckedException�� �ݵ�� ����ó���� ������ϴ� ���ܵ�
	 * ������� ���ܰ� �߻����� ���� �Ұ��� ������ �̸� ����ó�� ������ �ۼ��ص־��Ѵ�
	 * �ַ� �ܺ� �Ű�ü�� ������� �� �� �߻�
	 * 
	 */
	public void method1() throws IOException {
		/*
		try {
			method2();
		} catch (IOException e) {
			System.out.println("���ܹ߻�!");
		}
		*/
		method2();
	}
	
	public void method2()  throws IOException{
		
		// Ű����� �� �Է¹޴� ��� BufferedReader
		// Scanner���� BufferedReador�� ����
		// ��, ���ڿ��θ� �����ϴ�.
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.print("�ƹ� ���ڿ��� �Է����ּ��� : ");
		 try {
			 String str = br.readLine(); // �� �޼ҵ� ����� IOException�� �߻��� ���� ����!
			 							 // ������ ������ �˷��� ! => �ݵ�� ����ó��(���ܹ߻��� ������ ���� ����) �ؾߵ�!
			 System.out.println(str);
		 }catch(IOException e) {
			 System.out.println("���ܹ߻�!!");
		 }
		 
		 // 2. throw : ���ѱ�� ��� (�����ϴ� ���)
		 //				���� ���⼭ ���� ����ó���� ���� �ʰ� �� �޼ҵ带 ȣ���� ������ ����ó���� ���ѱ�ڴ�!!
	
		 System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
	
	/*
	 * 
	 * 							���ܹ߻� ����				����ó��
	 * RuntimeException			��Ÿ�� ����(�����Ͽ���x)		����		=> ������ �ɹ���(���ǹ�/����ó��) unCheckedException
	 * RuntimeException�� 		������ ���� 					�ʼ�		=> �ݵ�� ����ó��				CheckedException
	 * 
	 */
}
