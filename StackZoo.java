package com.gmail.oastro36;

public class StackZoo {
	private Object[] zoo = new Object[10];
	private Class[] blackList;
	private int index = 0;

	public StackZoo(Class[] blackList) {
		super();
		this.blackList = blackList;
	}

	public StackZoo() {
		super();
	}

	public void addObj(Object obj) {
		if (check(obj)) {
			if (index < zoo.length) {
				zoo[index] = obj;
				index += 1;
				return;
			} else {
				System.out.println("The zoo is full.");
				return;
			}
		} else {
			System.out.println("Object " + obj.getClass().getSimpleName() + " is in black list.");
		}
	}

	private boolean check(Object obj) {
		for (int i = 0; i < blackList.length; i++) {
			if (blackList[i] == obj.getClass()) {
				return false;
			}
		}
		return true;
	}
	
	public Object getObjectWithoutDel() {
		Object objBuffer = zoo[index - 1];
		return objBuffer;
	}
	
	public Object getObjectWithDel() {
		Object objBuffer = zoo[index - 1];
		zoo[index - 1] = null;
		return objBuffer;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(System.lineSeparator());
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

//public Object getObjectWithoutDel() {
//	Class classBuffer = (zoo[index]).getClass();
//	Object objClone = (Object)(zoo[index]).clone();
//	return objClone;
//}
