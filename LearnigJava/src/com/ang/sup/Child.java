package com.ang.sup;

public class Child extends parent{
	
	public Child() {
		super(6);
		
	}
	
	String empName = "abby";
	int empoNo = 478765;
	

	public static void main(String[] args) {
		   Child c = new Child();
		   c.getData();

	}
	public void getData() {
		
		super.getData();
		/*System.out.println(empName);
		System.out.println(empoNo);*/
	}

}
