package com.gmail.oastro36;

public class Lion {
	private String name;
	private String kind;

	public Lion(String name, String kind) {
		super();
		this.name = name;
		this.kind = kind;
	}

	public Lion() {
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
	public String toString() {
		return "Loin [name=" + name + ", kind=" + kind + "]";
	}
}
