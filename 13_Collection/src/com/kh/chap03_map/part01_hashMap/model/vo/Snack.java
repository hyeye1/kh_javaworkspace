package com.kh.chap03_map.part01_hashMap.model.vo;

public class Snack {
	
	private String flavor;
	private int calories;
	
	public Snack() {}

	public Snack(String flavor, int calories) {
		super();
		this.flavor = flavor;
		this.calories = calories;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calories=" + calories + "]";
	}
	
	
}
