package maccess;
import test.*;
public class Subclass extends Parent {

		public int b=10;
		public void m1()
		{
			System.out.println("Subcalss b: "+b);
		}
		{
			System.out.println("Non static block of subclass");
		}
	public static void main(String[] args) {
		
		Subclass ob = new Subclass();
		ob.m2();
		ob.m1();
		

	}

}
