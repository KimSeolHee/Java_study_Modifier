package com.iu.himart;

public class Phon extends Product {

	private String company;
	
	public Phon() {
		this.setCompany("Samsung");
		this.setBrand("Flip");
		this.setPrice(5000000);
		this.setPoint(50);
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public void info() {
		super.info();
		System.out.println("Company : " + this.getCompany());
	}
}
