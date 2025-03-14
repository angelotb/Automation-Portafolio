package com.ang.trycatch;

public class TryCatchDemo {

	public static void main(String[] args) {
		
		try {
		int i = 10;
		System.out.println("before division");
		System.out.println(i/5);
		
		}
	catch(Throwable t) {
		System.out.println(t.getMessage());
		System.out.println(t.getCause());
		t.getStackTrace();
		
		.
	}
		
		System.out.println("After division");

	
	}
}
