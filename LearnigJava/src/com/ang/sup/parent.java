package com.ang.sup;

public class parent {
	
	public parent (){
		System.out.println("parent constructor");
		
	}
	public parent (int i){
		System.out.println("parametized constructor");
		
	}
	
	String empName = "Tom";
	int empoNo = 45633;
	
	public void getData() {
		
		System.out.println(empName);
		System.out.println(empoNo);
	}

}
