package com.javapuzzle.classpuzzle.hack;

import com.javapuzzle.classpuzzle.click.CodeTalk;

/**
 * ClickIt.printMessage() just have the same method name as CodeTalk
 * it cann't override CodeTalk.printMessage(), because that method is
 * not public or protected. 
 * 
 * @author DeBen
 *
 */
public class TypeIt {
	private static class ClickIt extends CodeTalk {

		void printMessage() {
			System.out.println("Hack");
		}
	}
	
	public static void main(String[] args) {
		ClickIt clickIt = new ClickIt();
		clickIt.doIt();
	}
}
