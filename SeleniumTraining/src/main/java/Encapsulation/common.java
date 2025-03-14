package Encapsulation;

public class common {

	private int length;
	private int width;
	private int height;
	
	public void setBoxDimension(int l,int b, int h )
	{
		System.out.println("Box created with dimensions "+l+" "+b+" "+h+" "); 
	}
	public int setLength(int l)
	{
		length=l;
		return length;
	}
	
	public int setWidth(int w)
	{
		width=w;
		return width;
	}
	public int setHeight(int h)
	{
		height=h;
		return height;
	}
	public int getLenght()
	{
		
		return length;
	}
	public int getWidth()
	{
		
		return width;
	}
	public int getHeight()
	{
		
		return height;
	}
}

