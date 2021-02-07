package com.gmail.oastro36;

import java.util.Arrays;

public class StackZoo {
	private Object[] zoo;
	private Object[] blackList;

	public StackZoo(Object [] blackList) {
		super();
		this.zoo = new Object[10];
		this.blackList = blackList;
	}

	public void addObj(Object obj) {
		for (int i = 0; i < zoo.length; i++) {
			if (zoo[i] == null) {
				if (check(zoo[i])) {
					zoo[i] = obj;
					return;
				}
				System.out.println("Object is in black list.");
				return;
			}
		}
		System.out.println("The zoo is full.");
	}

	private boolean check(Object obj) {
		for (int i = 0; i < blackList.length; i++) {
			if (blackList[i].getClass() == obj.getClass()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < zoo.length; i++) {
			if (zoo[i] != null) {
				sb.append((i + 1) + ") " + zoo[i].toString());
				sb.append(System.lineSeparator());
			} else {
				sb.append((i + 1) + ") empty");
				sb.append(System.lineSeparator());

			}
		}

		return sb.toString();
	}
}
