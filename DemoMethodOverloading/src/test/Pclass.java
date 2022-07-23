package test;

public class Pclass extends Cclass {
	public void m(int x,int y,int z, int k)
	{
		this.m(x,y,z);
		System.out.println("Pclass method with 4 parameters");
		System.out.println("X:"+x);
		System.out.println("y:"+y);
		System.out.println("z"+z);
		System.out.println("k:"+k);
		
	}
	public void m(int x,int y,int z)
	{	super.m(x,y);
		System.out.println("Pclass method with 3 parameters");
		System.out.println("X:"+x);
		System.out.println("y:"+y);
		System.out.println("z"+z);
	}
}
