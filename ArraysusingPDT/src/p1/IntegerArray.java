package p1;
import java.util.*;
public class IntegerArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer a[] = new Integer[sc.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Using old for loop");
		for(int i=0;i<a.length;i++)
		{
			int temp =a[i];
			System.out.println(i+":"+temp);
		}
		System.out.println("Using Extended For Loop(java5)");
		for(Integer ob : a)
		{
			System.out.println(ob.toString());
		}
		System.out.println("using spliterator (java8)");
		Spliterator<Integer>  sp = Arrays.spliterator(a);
		sp.forEachRemaining((k)->
		{
			System.out.println(k.toString());
		});
		sc.close();
		}

}
