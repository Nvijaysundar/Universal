package test;
public class StaticBlock {
	static int a=10;
	int b=15;
	static
	{
		System.out.println("Static Block Statments");
		System.out.println("A:"+a);
	}
	public static void m1()
	{
		System.out.println("static m1 Methosd");
		System.out.println("A:"+a);
		
	}
}
