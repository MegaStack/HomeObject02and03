package com.gmail.oastro36;

public class Dog implements Cloneable{
	private String name;
	private String kind;

	public Dog(String name, String kind) {
		super();
		this.name = name;
		this.kind = kind;
	}

	public Dog() {
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
	public Dog clone() throws CloneNotSupportedException {
		return (Dog)super.clone();
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", kind=" + kind + "]";
	}
	
}
