package test;
public class NoNStaticBlock {
	static int a=10;
	int b=15;
	//non static block
	{
		System.out.println("Non Static Block Statments");
		System.out.println("A:"+a);
		System.out.println("B:"+b);
	}
	public static void m1()//static method
	{
		System.out.println("static m1 Methosd");
		System.out.println("A:"+a);
		
	}
	public void m2() // non static method
	{
		System.out.println("Non static m2 Methosd");
		System.out.println("A:"+a);
		System.out.println("B:"+b);
	}
}
