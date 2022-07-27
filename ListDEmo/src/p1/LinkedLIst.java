package p1;
import java.util.*;
public class LinkedLIst {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	Stack<Integer> li = new Stack<Integer>();
		int n= sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			li.push(i);
		}
		System.out.println(li.toString());
		li.pop();
		System.out.println(li.toString());
		System.out.println(li.get(10));
		
		System.out.println(li.search(20));
	}

}
