package com.javapuzzle.character;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class LinePrinter {

	public static void main(String[] args) {
		// Note : \u000A is Unicode representation of linefeed (LF)
		
		// Above comment is equal to:
		// Note : 
		   is Unicode representation of linefeed (LF)
		char c = 0x000A;
		System.out.println(c);
	}
}
