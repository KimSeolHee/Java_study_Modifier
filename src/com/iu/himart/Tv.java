package com.iu.himart;

public class Tv extends Product {
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public Tv() {
		this.size=100;
		this.setBrand("LG");
		this.setPrice(8000000);
		this.setPoint(50);	
	}
	
	public void info() {
		System.out.println(this.getPrice());
		System.out.println(this.size);
	}
	
}
