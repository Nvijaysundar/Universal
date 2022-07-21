package maccess;
import test.Subclass;
import java.util.Scanner;
public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		String name = sc.nextLine();
		float x = sc.nextFloat();
		//CONSTRUCTOR CALL
		Subclass s = new Subclass(a, name, x);
		s.b =10;
		//METHOD CALLS
		s.get();
		s.get();
		s.get();
		sc.close();
		
	}

}
