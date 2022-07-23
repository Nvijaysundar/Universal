package test;

public class Cclass{
	public void m(int x)
	{
		System.out.println("Cclass methodwith  one parameter");
		System.out.println("X:"+x);
	}
	public void m(int x,int y)
	{
		this.m(x);
		System.out.println("Cclass method with two parameter");
		System.out.println("X:"+x);
		System.out.println("X:"+y);
	}
	
}
