package p2;
public interface Pclass {
	public void m1();
	default void m3()
	{
		System.out.println("=M3 method -Pclass");
	}
}
