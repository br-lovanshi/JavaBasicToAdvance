package com.oops;

public class Encaptulation {

	private int roll;
	private String name;
	private float marks;
	
	public Encaptulation() {
		// TODO Auto-generated constructor stub
	}

	public Encaptulation(int roll, String name, float marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Encaptulation [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
  
}
