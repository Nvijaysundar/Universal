package test;

public class Pclass {
	public static int i=0;
	public static void m1()
	{
		System.out.println("Static method, i: "+i);
	}
	
	 static 
	{
		System.out.println("Static block of parent");
	}
}
