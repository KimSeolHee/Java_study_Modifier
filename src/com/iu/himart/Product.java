package com.iu.himart;

public abstract class Product {

	private String brand;
	private int price;
	private int point;
	
	public Product() {}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

//	public abstract void info();
	public void info() {
		System.out.println(this.getBrand());
		System.out.println(this.getPrice());
		System.out.println(this.getPoint());
	}

}
