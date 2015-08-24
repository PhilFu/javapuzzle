package com.javapuzzle.library;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CopyDog {

	static public Object deepCopy(Object object) throws Exception {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		new ObjectOutputStream(bos).writeObject(object);

		ByteArrayInputStream bin = new ByteArrayInputStream(bos.toByteArray());
		return new ObjectInputStream(bin).readObject();
	}

	public static void main(String[] args) throws Exception {
		Dog newDog = (Dog) deepCopy(Dog.INSTANCE);

		System.out.println(newDog == Dog.INSTANCE);
		System.out.println(newDog);
	}

}
