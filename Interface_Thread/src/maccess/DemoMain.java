package maccess;
import test.*;
public class DemoMain {

	public static void main(String[] args) {
		Display1 D1 = new Display1();
		Display2 d2 = new Display2();
		Display3 d3 = new Display3();
		Thread t1 = new Thread(D1);
		Thread t2 = new Thread(d2);
		Thread t3 = new Thread(d3);
		t1.start();
		t2.start();
		t3.start();
	}

}
