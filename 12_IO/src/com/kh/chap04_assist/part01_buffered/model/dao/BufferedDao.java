package com.kh.chap04_assist.part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
	// BufferedReader/BufferedWriter
	
	// ���α׷� --> ���� (���)
	public void fileSaver() {
		
		// 1. ��ݽ�Ʈ��( FileWriter ) ��ü ���� ����
		//FileWriter fw = new FileWriter("c_buffer.txt");
		// 2. �� ��ݽ�Ʈ���� ������ ������Ʈ���� �������ֱ�
		//BufferedWriter bw = new BufferedWriter(fw); //� ��ݽ�Ʈ����ü�� ����ų������ �Է�
		
		// 1+2. ���� ���� �ѹ��� ó������
		/*
		BufferedWriter bw = null; 
		try {
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			bw.write("�ȳ��ϼ���\n");
			bw.write("�ݰ����ϴ�");
			bw.newLine(); // ���� == \n
			bw.write("����������");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		//try ~ with ~ resource ���� (jdk7�������͸� ����)
		/*
		 * try (��Ʈ�� ��ü ���� ���� ; ��Ʈ�� ��ü ���� ����) {
		 * 
		 *  } catch (����Ŭ������ e) {
		 *  
		 *  }
		 *  
		 *  try() �ȿ� �ۼ��� ��Ʈ�� ��ü�� �� ���Ǹ� �˾Ƽ� �ݳ���
		 *   
		 * 
		 */
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_Buffer.txt"))){
				
			bw.write("�ȳ��ϼ��� \n");
			bw.write("�ݰ����ϴ�");
			bw.newLine();
			bw.write("����������");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	// ���α׷� <-- ���� (�Է�)
	public void fileRead() {
		
		//BufferedReader FileReader
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
			
			/*
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			*/
			
			String value = null;
			while((value=br.readLine()) != null ) {
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}

}
