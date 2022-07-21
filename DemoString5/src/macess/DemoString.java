package macess;		
import java.util.Scanner;
public class DemoString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter string1: ");
		String s1 = sc.nextLine().trim().toUpperCase();
		System.out.println("ENter string2: ");
		String s2 = sc.nextLine().trim().toUpperCase();
		System.out.println("==equals()====");
		boolean k = s1.equalsIgnoreCase(s2);
		if(k)
			System.out.println("String are same");
		else
			System.out.println("String are not equal");
		System.out.println("===CompareTo()===");
		int z = s1.compareToIgnoreCase(s2);
		if(z==0)
			System.out.println("Sring are same");
		else
			System.out.println("String are not same");
		sc.close();
	}

}
