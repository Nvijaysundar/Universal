package macccess;
import test.*;
public class Demoinheritance2 {

	public static void main(String[] args) {
		
		CClass.m1();
		CClass.m2();
		
		CClass ob = new CClass();
		
		ob.m2();
		ob.m1();

	}

}
