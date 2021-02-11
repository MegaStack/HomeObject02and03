package com.gmail.oastro36;

public class Cat implements Cloneable{
	private String name;
	private String kind;

	public Cat(String name, String kind) {
		super();
		this.name = name;
		this.kind = kind;
	}

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	@Override
	public Cat clone() throws CloneNotSupportedException {
		return (Cat)super.clone();
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", kind=" + kind + "]";
	}
	
}
