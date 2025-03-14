package Encapsulation;

public class CreateBox {

	public static void main(String[] args) {
		
		common cm = new common();
		int b = cm.setWidth(10);
		int l = cm.setLength(20);
		int h = cm.setHeight(15);
		cm.setBoxDimension(l, b, h);
		

	}

}
