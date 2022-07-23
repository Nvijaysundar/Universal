package test;

public class Cclass extends Pclass {
	public static void m(int z,int b)
	{
		System.out.println("Static method C: b:"+b);
		System.out.println("Static method C: Z:"+z);
	}
	public static void m(int z,int b,int y)
	{
		System.out.println("Static method C: b:"+b);
		System.out.println("Static method C: Z:"+z);
		System.out.println("Static method C: y:"+y);
	}
	public void access(int a,int b,int c)
	{
	this.m(a, b, c);
	this.m(c, b);
	super.m(a);
	}
	
}
