package p1;
import p2.*;
public class DemoMain {

	public static void main(String[] args) {
		
		User1 u = new User1();
		User2 u1 = new User2();
		
		Thread t1 = new Thread(u);
		Thread t2 = new Thread(u1);
		
		t2.start();
		t1.start();
		
		

	}

}
