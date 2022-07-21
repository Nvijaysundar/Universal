package test;

public class Multiplication {
	public int a,x=1000;
	public static int b,y=1500;
	public void set(int a,int b)
	{
		this.a=a;
		Multiplication.b = b;
	}
	public int get()
	{
		return a*b;
	}
}
