package com.gmail.oastro36;

public class Human {
	private String name;
	private String lastName;
	private String sureName;

	public Human(String name, String lastName, String sureName) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.sureName = sureName;
	}

	public Human() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSureName() {
		return sureName;
	}

	public void setSureName(String sureName) {
		this.sureName = sureName;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", lastName=" + lastName + ", sureName=" + sureName + "]";
	}
}
