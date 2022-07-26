package p1;
import p2.Pclass;
public class DemoMain {
	public static void main(String[] args) {	
		Pclass ob = new Pclass()
		{
			public void m1()
			{
				System.out.println("m1 -child");
			}
			public void m2()
			{
				System.out.println("m2 -child");
			}
		};
		ob.m1();
		ob.m3();
		//ob.m2();
	}

}
