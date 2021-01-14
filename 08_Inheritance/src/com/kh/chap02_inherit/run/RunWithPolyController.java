package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Vehicle;

public class RunWithPolyController {
	
	private Vehicle[] v = new Vehicle[3];
	
	public void insert(Vehicle any, int index) {
		v[index] = any;
	}
	
	public Vehicle select(int index) {
		return v[index];
	} 
	
	
	

}
