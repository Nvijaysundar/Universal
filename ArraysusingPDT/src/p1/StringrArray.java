package p1;
import java.util.*;
public class StringrArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a[] = new String[Integer.parseInt(sc.nextLine())];
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextLine();
		}
		System.out.println("Using old for loop");
		for(int i=0;i<a.length;i++)
		{
			String temp =a[i].toString();
			System.out.println(i+":"+temp);
		}
		System.out.println("Using Extended For Loop(java5)");
		for(String ob : a)
		{
			System.out.println(ob.toString());
		}
		System.out.println("using spliterator (java8)");
		Spliterator<String>  sp = Arrays.spliterator(a);
		sp.forEachRemaining((k)->
		{
			System.out.println(k.toString());
		});
		sc.close();
		}

}
