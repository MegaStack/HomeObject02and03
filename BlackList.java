package com.gmail.oastro36;

import java.util.Arrays;

public class BlackList {
	private Object[] blackList;

	public BlackList(Object[] blackList) {
		super();
		this.blackList = blackList;
	}

	public BlackList() {
		super();
	}

	public Object[] getBlackList() {
		return blackList;
	}

	@Override
	public String toString() {
		return "BlackList [blackList=" + Arrays.toString(blackList) + "]";
	}
}
