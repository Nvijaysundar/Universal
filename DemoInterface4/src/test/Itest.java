package test;

public interface Itest {
		default void m1(int x)
		{
			//Default concrete method
			System.out.println("X in Default: "+x);
		}
		public abstract void m2(int y);

}
