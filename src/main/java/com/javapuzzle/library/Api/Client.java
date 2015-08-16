package com.javapuzzle.library.Api;

import com.javapuzzle.library.library.Api;

public class Client {

	public static void main(String[] args) {
		// Api.member is PackagePrivate, which is not a public class, so you
		// could not call its hashCode() method here
		System.out.println(Api.member.hashCode());
	}

}
