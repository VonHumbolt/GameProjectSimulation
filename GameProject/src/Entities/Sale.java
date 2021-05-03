package Entities;

import Abstract.Entity;

public class Sale implements Entity {
	private int id;
	private String saleName;
	private double price;
	
	public Sale(int id, String saleName, double price) {
		this.id = id;
		this.saleName = saleName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSaleName() {
		return saleName;
	}

	public void setSaleName(String saleName) {
		this.saleName = saleName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
