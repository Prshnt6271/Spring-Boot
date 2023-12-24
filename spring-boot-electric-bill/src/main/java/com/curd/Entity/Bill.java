package com.curd.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bill {
	@Id
	private int id;
	private String name;
	private int cr;
	private int pr;
	private int units;
	private double sc;
	private double total_bill;
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bill(int id, String name, int cr, int pr, int units, double sc, double total_bill) {
		super();
		this.id = id;
		this.name = name;
		this.cr = cr;
		this.pr = pr;
		this.units = units;
		this.sc = sc;
		this.total_bill = total_bill;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCr() {
		return cr;
	}
	public void setCr(int cr) {
		this.cr = cr;
	}
	public int getPr() {
		return pr;
	}
	public void setPr(int pr) {
		this.pr = pr;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public double getSc() {
		return sc;
	}
	public void setSc(double sc) {
		this.sc = sc;
	}
	public double getTotal_bill() {
		return total_bill;
	}
	public void setTotal_bill(double total_bill) {
		this.total_bill = total_bill;
	}
	@Override
	public String toString() {
		return "Bill [id=" + id + ", name=" + name + ", cr=" + cr + ", pr=" + pr + ", units=" + units + ", sc=" + sc
				+ ", total_bill=" + total_bill + "]";
	}
	

}
