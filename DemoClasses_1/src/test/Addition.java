package test;
public class Addition {
	public int a,d=1500;
	public static int b,c=1000;
	
	public void set(int a,int b)
	{
		this.a=a;
		Addition.b=b;
	}
	public int get()
	{
		return a+b;
	}
}
