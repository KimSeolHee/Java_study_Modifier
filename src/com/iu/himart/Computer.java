package com.iu.himart;

public class Computer extends Product {
	
	public Computer() {
		this.cpu="M2";
		this.setBrand("MacMini");
		this.setPoint(20);
	}
	private String cpu;

	
	public String getCpu() {
		return cpu;
	}


	public void setCpu(String cpu) {
		this.cpu = cpu;
	}


	public void info() {
		super.info();
		System.out.println(this.getCpu());
	}
}
