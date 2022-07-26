package test;
public abstract class Aclass {
	int y;
		public Aclass(int y)
		{
			this.y = y;
		}
	public abstract void m1();
	public void m2(int x)
	{
		System.out.println("X:"+x);
		System.out.println("y:"+y);
	}
	{
		System.out.println("non Static block");
	}
}
