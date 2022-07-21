package maccess;
import test.*;
public class DemoMain {
	public static void main(String[] args) {
		StaticBlock.m1();
		NoNStaticBlock N = new NoNStaticBlock();
		NoNStaticBlock N1 = new NoNStaticBlock();
		NoNStaticBlock N12 = new NoNStaticBlock();
				NoNStaticBlock.m1();
				N.m2();
	}

}
