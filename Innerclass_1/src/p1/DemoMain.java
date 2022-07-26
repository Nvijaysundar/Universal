package p1;
import p2.Subclass1;
public class DemoMain {
	public static void main(String[] args) {
		Subclass1 ob = new Subclass1();
		ob.m1();
		Subclass1.Subclass2 ob2 = new Subclass1.Subclass2();
		ob2.m2();
		Subclass1.Subclass2.m3();
	}

}
