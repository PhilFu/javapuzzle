package com.javapuzzle.library;

import java.util.IdentityHashMap;
import java.util.Map;

/**
 * Don't use IdentityHashMap, it is not a common use map
 * It compare key's reference, but not value
 * 
 * @author DeBen
 *
 */
public class NameGame {

	public static void main(String[] args) {
		Map<String, String> map = new IdentityHashMap<String, String>();
		map.put("Mickey", "Mouse");
		map.put("Mickey", "Mantle");
		System.out.println(map.size());
	}

}
