package com.curd.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Students")
public class Student {
	
	@Id
	private int id;
	private String name;
	private int hibarnate;
	private int spring;
	private int SpringBoot;
	private int total;
	private double percentage;
	private String grade;
	private String result;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, int hibarnate, int spring, int springBoot, int total, double percentage,
			String grade, String result) {
		super();
		this.id = id;
		this.name = name;
		this.hibarnate = hibarnate;
		this.spring = spring;
		SpringBoot = springBoot;
		this.total = total;
		this.percentage = percentage;
		this.grade = grade;
		this.result = result;
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
	public int getHibarnate() {
		return hibarnate;
	}
	public void setHibarnate(int hibarnate) {
		this.hibarnate = hibarnate;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	public int getSpringBoot() {
		return SpringBoot;
	}
	public void setSpringBoot(int springBoot) {
		SpringBoot = springBoot;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", hibarnate=" + hibarnate + ", spring=" + spring
				+ ", SpringBoot=" + SpringBoot + ", total=" + total + ", percentage=" + percentage + ", grade=" + grade
				+ ", result=" + result + "]";
	}
	
	
	

}
