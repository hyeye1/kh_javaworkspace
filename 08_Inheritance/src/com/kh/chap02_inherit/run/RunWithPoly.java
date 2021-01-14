package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;


public class RunWithPoly {
	public static void main(String[] args) {
		
		RunWithPolyController rc = new RunWithPolyController();
		
		rc.insert(new Ship("¹è", 2.4, "¿äÆ®",4),0);
		rc.insert(new Airplane("º¸À×", 22.4, "¿©°´±â",2,2),0);
		rc.insert(new Car("Æ÷¸£½¦", 3.4, "½ºÆ÷Ã÷Ä«",4),0);

		
		
		
	}

			
}
