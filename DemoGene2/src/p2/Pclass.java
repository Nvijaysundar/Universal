package p2;

public interface Pclass {
	public void m1(int x);
	default void m2()
	{
		System.out.println("M2 mthods");
	}
}
