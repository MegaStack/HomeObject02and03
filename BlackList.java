package com.gmail.oastro36;

import java.util.Arrays;

public class BlackList {
	private Class[] blackList;

	public BlackList(Class[] blackList) {
		super();
		this.blackList = blackList;
	}

	public BlackList() {
		super();
	}

	public Class[] getBlackList() {
		return blackList;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Black list:" + System.lineSeparator());
		for (int i = 0; i < blackList.length; i++) {
			Class class1 = blackList[i];
			sb.append(class1.getSimpleName());
			sb.append(System.lineSeparator());
		}
		
		return sb.toString();
	}
}
