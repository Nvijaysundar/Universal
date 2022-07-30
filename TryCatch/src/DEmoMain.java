import java.util.*;
public class DEmoMain {
	static int a,b;
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	try {
	a = sc.nextInt();
	b = sc.nextInt();
	System.out.println(a/b);
	}
	catch(ArithmeticException ob)
	{
		System.out.println(a/b);
		System.out.println(ob);
	}
	catch(InputMismatchException ob)
	{
		System.out.println(ob);
	}
	catch(ArrayIndexOutOfBoundsException ob)
	{
		System.out.println(ob);
	}
	finally {
	System.out.println("Progam completed");
	}
	}

}
