package com.iu.himart;

public class Client {
	
	private int money;
	private int point;
	
	public Client() {
		this.money = 30000000;
		this.setPoint(10);
	}
	
	//제품을 삿을때 잔액이랑 포인트 출력
	
	public void buy(Product product) {
		this.money = this.money - product.getPrice();
		this.point = this.point + product.getPoint();
		System.out.println("잔액은 : " + this.money);
		System.out.println("Point : " + this.point);
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	

}
