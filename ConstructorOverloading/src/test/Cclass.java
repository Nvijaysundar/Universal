package test;

public class Cclass extends Pclass {

	public Cclass(int x,int y,int z)
	{
		super(x,y);
		System.out.println("Cconstrctor X:"+x);
		System.out.println("Cconstrctor Y:"+y);
		System.out.println("Cconstrctor z:"+z);
	}
	public Cclass(int x, int y,int z,int k)
	{
		this(x,y,z);
		System.out.println("Cconstrctor X:"+x);
		System.out.println("Cconstrctor Y:"+y);
		System.out.println("Cconstrctor z:"+z);
		System.out.println("Cconstrctor k:"+k);
	}
}
