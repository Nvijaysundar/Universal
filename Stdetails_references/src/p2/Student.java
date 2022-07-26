package p2;
import java.util.*;
public class Student {
	String name,Branch,Rollno;
	Address Ad;
	Contact C;
	Result R;
	
	public Student(Address Ad,Contact C,Result R)
	{
		this.Ad = Ad;
		this.C=C;
		this.R=R;
	}
	public void getDisplay()
	{
		StringJoiner Add = new StringJoiner("-");
		Add.add(Ad.hno).add(Ad.sname).add(Ad.city).add(String.valueOf(Ad.pincode));
		System.out.println("Name :"+ name );
		System.out.println("Branch:" +Branch);
		System.out.println("RollNo:"+Rollno);
		System.out.println("Mail Id: "+ C.mailid );
		System.out.println("Phno : "+C.phno);
		System.out.println("Address : "+ Add.toString());
		System.out.println("Result: "+ R.getresult() );
		
		
	}
}
