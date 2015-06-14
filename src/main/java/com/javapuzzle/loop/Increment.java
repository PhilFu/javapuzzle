package com.javapuzzle.loop;

public class Increment {

	public static void main(String[] args) {
		// int tmp = j;
		// j = j + 1;
		// j = tmp;
		int j = 0;
		for (int i = 0; i < 100; i++)
			j = j++;
		System.out.println(j);
	}

}
