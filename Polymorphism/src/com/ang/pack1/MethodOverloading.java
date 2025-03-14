package com.ang.pack1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		mo.longin(653476, "password",6545);

	}

	public void longin(String s, String p) {
	    System.out.println("login successfull using username and password");
		
	}
	
	public void longin(int s, String p) {
	    System.out.println("login successfull using phonenumber and password");
		
	}
	public void longin(int s, String p, int t) {
	    System.out.println("login successfull using phonenumber/ pin and password");
		
	}
}
