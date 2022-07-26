package p2;
public class Subclass1 {
	 int a =10;
	 static int b=10;
	 public void m1()
	 {
		 System.out.println("M1 method-outer");
		 System.out.println("A:"+a);
		 System.out.println("B:"+b);
		 //creating a subclass
		 class Subclass2
		 {
			 public void m2()
			 {
				 System.out.println("M2 method-inner -m1");
				 System.out.println("A:"+a);
				 System.out.println("B:"+b);
			 }
			 public static void m22()
			 {
				 System.out.println("M22 method-inner -m1");
				 //System.out.println("A:"+a);
				 System.out.println("B:"+b);
			 }
			
		 }
		 Subclass2 ob = new Subclass2();
		 ob.m2();
		 Subclass2.m22();
	 }
	public static void m11()
	 {
		 System.out.println("M1 method-outer");
		 //System.out.println("A:"+a);
		 System.out.println("B:"+b);
		 //creating a subclass
		 class Subclass3
		 {
			 public void m3()
			 {
				 System.out.println("M3 method-inner -m1");
				 //System.out.println("A:"+a);
				 System.out.println("B:"+b);
			 }
			 public static void m33()
			 {
				 System.out.println("M22 method-inner -m1");
				 //System.out.println("A:"+a);
				 System.out.println("B:"+b);
			 }
			
		 }
		 Subclass3 ob1 = new Subclass3();
		 ob1.m3();
		 Subclass3.m33();
	 
	 }
}
