package maccess;
import test.*;
import java.util.*;
public class Demomain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Address a = new Address();
		System.out.println("Enter Hno");
		a.Hno =sc.nextLine();
		System.out.println("Enter Sname");
		a.Sname =sc.nextLine();
		System.out.println("Enter City");
		a.City =sc.nextLine();
		System.out.println("Enter Pincode");
		a.pincode =Integer.parseInt(sc.nextLine());
		
		Employee e =new Employee(a);
		
		System.out.println("Enter Name");
		e.name =sc.nextLine();
		System.out.println("Enter ID");
		e.id =sc.nextLine();
		
		Display d = new Display();
		d.dis(e);
	
		sc.close();
	}

}
