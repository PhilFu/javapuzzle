package com.javapuzzle.library;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class SuspiciousSort {

	public static void main(String[] args) {
		Random rnd = new Random();
		Integer[] arr = new Integer[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt();
		}

		Comparator<Integer> cmp = new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				return i2 - i1;
			}
		};

		Arrays.sort(arr, cmp);
		System.out.println(order(arr));

		// don't use minus as a comparator, compare them directly
		int x = -2000000000;
		int y = 2000000000;
		System.out.println(x - y);
		System.out.println((x - y) < 0);
		System.out.println(x > y);
	}

	enum Order {
		ASCENDING, DESCENDING, CONSTATNT, UNORDERED
	};

	static Order order(Integer[] a) {
		boolean ascending = false;
		boolean descending = false;

		for (int i = 1; i < a.length; i++) {
			ascending |= (a[i] > a[i - 1]);
			descending |= (a[i] < a[i - 1]);
		}

		if (ascending && !descending) {
			return Order.ASCENDING;
		}

		if (descending && !ascending) {
			return Order.DESCENDING;
		}
		if (!ascending)
			return Order.CONSTATNT;
		return Order.UNORDERED;
	}
}
