package test;
public class Iclass extends Pclass implements Itest1,Itest2{
	public void m2(int x) {
		System.out.println("m2 X: "+x);
	}
	public void m1(int x) {
		System.out.println("m1 X: "+x);
	}
	public void m3(int x, int y) {
		System.out.println("m3 X: "+x);
		System.out.println("m3 y: "+y);
	}

}
