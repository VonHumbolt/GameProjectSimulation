package Entities;

import Abstract.Entity;

public class Campagin implements Entity {
	private int id;
	private String campaginName;
	private double discount;
	
	public Campagin(int id, String campaginName, double discount) {
		this.id = id;
		this.campaginName = campaginName;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaginName() {
		return campaginName;
	}

	public void setCampaginName(String campaginName) {
		this.campaginName = campaginName;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
