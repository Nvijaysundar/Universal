package test;

public class CClass extends Pclass {
	public static int y=10;
	
	public static void m2()
	{
		System.out.println("Static methodof C, y: "+y);
		
	}
	static
	{
		System.out.println("Static block of subclass");
	}
}
