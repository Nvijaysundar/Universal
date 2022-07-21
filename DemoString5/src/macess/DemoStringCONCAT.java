package macess;

public class DemoStringCONCAT {
	public static void main(String[] args) {
		String st1 = "java";
		String st2 = "PROGRAM";
		String st3 = "java";
		st1 = st1.concat(st2);
		System.out.println(st1);
		System.out.println(st3+st2+st1);
	}
}
