package p1;
import java.util.*;
public class DEmoMain {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(123);
		a.add(121);
		a.add(165);
		a.add(150);
		a.add(150);
			System.out.println(a.toString());
		a.add(2, 10);
		System.out.println(a.toString());
		a.remove(2);
		System.out.println(a.toString());
		System.out.println(a.lastIndexOf(a));
		System.out.println(a.get(3));
		System.out.println(a.indexOf(150));
		a.set(3, 450);
		System.out.println(a.toString());
	}
}
