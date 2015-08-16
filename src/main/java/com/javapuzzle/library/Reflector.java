package com.javapuzzle.library;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * it.getClass() is an instance, this instance is java.util.HashMap.KeyIterator
 * KeyIterator is a private class in HashMap class. So it could not be access
 * from here, because you could only access the public class/method in your code.
 * 
 * Iterator.class is a public class, so we could access it here.
 * 
 * Remember to use Interface to get method, and use instance to reflect. as line 28&29
 * 
 * @author DeBen
 *
 */
public class Reflector {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<String>();
		s.add("foo");
		Iterator it = s.iterator();

		Method method = Iterator.class.getMethod("hasNext");
		System.out.println(method.invoke(it));

		Method m = it.getClass().getMethod("hasNext");
		System.out.println(m.invoke(it));
	}
}
