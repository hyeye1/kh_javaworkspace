package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {

		HashSet<String> hs1 = new HashSet<String>();
		//set�� list�� ���� �θ�Ŭ������ ��ӹް��ֱ⶧���� ���� �޼ҵ尡 ���� �ִ�.
		
		//1. add();
		hs1.add("�ݰ����ϴ�.");
		hs1.add(new String("�ݰ����ϴ�."));
		hs1.add(new String("������"));
		hs1.add(new String("�ȳ��ϼ���."));
		hs1.add(new String("������"));
		
		System.out.println(hs1); //���� �߰��� ������� ���������ʰ�, �ߺ��� �����ʹ� ���������ʴ´�.
		
		HashSet hs2 = new HashSet();
		
		hs2.add(new Student("����", 40, 100));
		hs2.add(new Student("�躹��", 26, 40));
		hs2.add(new Student("ȫ�浿", 24, 60));
		hs2.add(new Student("����", 40, 100)); // ù��°�� �ٸ� �ּҰ��� �����޾ұ⿡ ���� ��ü�� �����ʴ´�.
		
		System.out.println(hs2); // ������� ���� x, �ߺ����� o => ��? ���ϰ�ü�� �Ǵܵ�������

		// HashSet�� ��ü�� ���� �� ���������� equals()�� �� + hashCode()���� ��ġ�ϴ����� ��
		// equals()�� ����� true�̰� hashCode()���� ��ġ�ϸ� => ���� ��ü�� �Ǵ�(�ߺ�����Ұ�)
		
		// ObjectŬ������ �ִ� equals() : �� ��ü�� "�ּҰ��� ������ ��"�ؼ� ��ġ�ϸ� true/ ��ġ���������� false��ȯ
		// ObjectŬ������ �ִ� hashCode() : ��ü�� "�ּҰ��� ������� �ؼ�" �ؽ��ڵ� �� ���� ��ȯ
		
		// ��ü�� �� �ʵ尪�� ��ġ�ϸ� ������ ��ü�� �Ǵ��� �Ǽ� �ߺ������� �Ұ��ϰԲ� �ϰ�ʹ�?
		
		// Student Ŭ������ equals() �������̵�: �� "�ʵ尪"�� ��ġ�ϸ� true/ �ϳ��� ��ġ���������� false ��ȯ ������
		// Student Ŭ������ hashCode() �������̵�: �� "�ʵ尪" ��������ؼ� �ؽ��ڵ� ������ ��ȯ ������
		
		// Set => ������ ��ü�� ����Ǿ����� => index ������� => �ݺ��� Ȱ��Ұ�
		
		// �׷� ����ִ� ��ü�� ���������� �����ϰ����Ҷ�?
		
		// 1. for�� ��밡��(��, for each��(���� for��)���θ� ���� !! ��?
		//for(Student s : hs2) {
		//System.out.println(s);
	    //}
		
		//2. ArrayList�� ����� �� ArrayList�ݺ��� ����
		/*
		 //ArrayList<Student> list = new ArrayList<>(); // �󸮽�Ʈ�� ������
		 * list.addAll(hs2); // ����Ʈ�� hs2�� ����ִ� ��ü�� ��°�� �߰�
		 * 
		 */
		
		ArrayList<Student> list = new ArrayList<>(hs2);
		System.out.println("======================");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//3. Iterator �ݺ��ڸ� �̿��� ���
		// hs2 �� ����ִ� ��ü���� Iterator(�ݺ���)�� ��� ����
		Iterator<Student> it = hs2.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
