package com.javapuzzle.library;

import java.util.HashMap;
import java.util.Map;

/**
 * No constructor, constructor could have return type.
 * 
 * @author DeBen
 *
 */

public class MoreNames {

	private Map<String, String> map = new HashMap<String, String>();

	public void MoreNames() {
		map.put("Mickey", "Mouse");
		map.put("Mickey", "Mantle");
	}

	public int size() {
		return map.size();
	}

	public static void main(String[] args) {
		MoreNames moreNames = new MoreNames();
		System.out.println(moreNames.size());
	}

}
