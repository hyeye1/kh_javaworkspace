package com.kh.chap01_poly.part02_electronic.model.vo;

public class Desktop extends Electronic {
	public String SPU = "intel";
	private String graphic; 
	
	public Desktop() {}
	
	public Desktop(String brand, String name, int price, String graphic) {
		super(brand, name, price);
		this.graphic = graphic;
	}
	
	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}
	public String getGraphic() {
		return graphic;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", graphic: " + graphic;
	}
	

}
