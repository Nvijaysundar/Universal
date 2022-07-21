package maccess;
import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter int value:");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Enter st value:");
		String st = sc.nextLine();
		System.out.println("a :"+a);
		System.out.println("st: "+st);
		sc.close();
	}
}
