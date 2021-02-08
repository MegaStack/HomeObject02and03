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
		return "BlackList [blackList=" + Arrays.toString(blackList) + "]";
	}
}
