package com.ang.constructor;

public class ConstructorExamples {
	// No return type
	// same name as the class name


	public  ConstructorExamples() {
       System.out.println("no argument constructor");
		
	}
	public  ConstructorExamples(int i) {
	       System.out.println("integert constructor");
			
		}
	public  ConstructorExamples(int i, int y) {
	       System.out.println(" 2 integer constructor");
			
		}
	public  ConstructorExamples(String s) {
	       System.out.println("String constructor");
			
		}
	public static void main(String[] args) {
		
		 ConstructorExamples ce = new  ConstructorExamples(6);
      
	}

}
