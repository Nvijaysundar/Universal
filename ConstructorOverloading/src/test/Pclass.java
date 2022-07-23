package test;

public class Pclass {
		public Pclass(int x)
		{
			System.out.println("Pconstrctor X:"+x);
		}
		public Pclass(int x, int y)
		{
			this(x);
			System.out.println("Pconstrctor X:"+x);
			System.out.println("Pconstrctor Y:"+y);
		}
}
