package p2;
import java.util.Scanner;
public class Read {
	public void setdata(Scanner s,Student St)
	{
		System.out.println("Enter name:");
		St.name = s.nextLine();
		System.out.println("Enter Branch");
		St.Branch= s.nextLine();
		System.out.println("Enter RollNO");
		St.Rollno = s.nextLine();
		System.out.println("Enter Mailid:");
		St.C.mailid = s.nextLine();
		System.out.println("ENter Phno");
		St.C.phno = Long.parseLong(s.nextLine());
		System.out.println("Enter hno");
		St.Ad.hno = s.nextLine();
		System.out.println("Enter Sname");
		St.Ad.sname = s.nextLine();
		System.out.println("Enter city");
		St.Ad.city = s.nextLine();
		System.out.println("Enter pincode");
		St.Ad.pincode = Integer.parseInt(s.nextLine());
		System.out.println("Enter percentage");
		St.R.per = s.nextFloat();
	}
}
