package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;


public class RunWithPoly {
	public static void main(String[] args) {
		
		RunWithPolyController rc = new RunWithPolyController();
		
		rc.insert(new Ship("��", 2.4, "��Ʈ",4),0);
		rc.insert(new Airplane("����", 22.4, "������",2,2),0);
		rc.insert(new Car("������", 3.4, "������ī",4),0);

		
		
		
	}

			
}
