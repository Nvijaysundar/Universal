package p2;

public class Subclass1 {
		public int a=10;
		public static int b =15;
		public void m1()
		{
			System.out.println("NSM- Oterclass");
			System.out.println("A:"+a);
			System.out.println("B:"+b);	
		}
		public class Subclass2
		{
			public void m2()
			{
				System.out.println("Instance method -inner ");
				System.out.println("A:"+a);
				System.out.println("B:"+b);	
			}
			public static void m3()
			{
				System.out.println("Static M - Inner");
				//System.out.println("A:"+a);
				System.out.println("B:"+b);
			}
		}
}
