package com.popquiz;

public class Vehicle {

	protected int price = 0;
	protected String color = null;
	
	
	public Vehicle(int price, String color) {
	
		this.price = price;
		this.color = color;
	}


	public Vehicle() {
	
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
	
}
