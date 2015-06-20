package com.javapuzzle.exception;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Reluctant {

	// this variable was initialized before constructor,
	// then the constructor will initialize its variable too..
	private Reluctant internalInstanceReluctant = new Reluctant();

	public Reluctant() throws Exception {
		throw new Exception("I'm not coming out");
	}

	public static void main(String[] args) {
		try {
			new Reluctant();
			System.out.println("Surprise!");
		} catch (Exception e) {
			System.out.println("I told you so");
		}
	}

	// inputStream/outputStream close also need catch exception
	static void copy(String src, String dest) throws IOException {
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			inputStream = new FileInputStream(src);
			outputStream = new FileOutputStream(dest);
			byte[] buf = new byte[1024];
			int n;
			while ((n = inputStream.read(buf)) >= 0) {
				outputStream.write(buf, 0, n);
			}
		} catch (Exception e) {
			closeIgnoringException(inputStream);
			closeIgnoringException(outputStream);
		}
	}

	private static void closeIgnoringException(Closeable closeable) {
		if (closeable != null) {
			try {
				closeable.close();
			} catch (Exception e) {
				closeable = null;
			}
		}
	}
}
