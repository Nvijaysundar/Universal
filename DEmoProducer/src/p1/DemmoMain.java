package p1;
import p2.*;
public class DemmoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producer p = new Producer();
		Consumer C = new Consumer(p);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(C);
		
		t2.start();
		t1.start();
		

	}

}
