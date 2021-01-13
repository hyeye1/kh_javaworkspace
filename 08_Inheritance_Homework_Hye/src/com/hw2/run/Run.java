package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		// ũ�Ⱑ 2�� Circle, Rectangle ���� ��ü �迭 �Ҵ�
		// ���� ��� �����͸� �����Ͽ� ���� �ʱ�ȭ
		
		Circle[] arrC = new Circle[2];
		Rectangle[] arrR = new Rectangle[2];
		
		arrC[0] = new Circle(1, 2, 3); 
		arrC[1] = new Circle(3, 3, 4);
		
		arrR[0] = new Rectangle(-1, -2, 5, 2);
		arrR[1] = new Rectangle(-2, 5, 2, 8);
		
		
		// �� ������ draw �޼ҵ� ���� --> ���� for�� �̿��ؼ�     ==> ���� ����??
		
		System.out.println("===== circle =====");
		for(int i=0; i<arrC.length; i++) {
			arrC[i].draw();
		}
		
		System.out.println("===== rectangle =====");
		for(int i=0; i<arrR.length; i++) {
			arrR[i].draw();
		}
	}

}
