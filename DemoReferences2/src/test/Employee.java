package test;

public class Employee {
	public String name,id;
	public Address ob;
	public Employee(Address ad) {
		ob =ad;
	}
	public void getDetails()
	{
		System.out.println("Name: "+name);
		System.out.println("Id:"+id);
		System.out.println("Hno:"+ob.Hno);
		System.out.println("Sname:"+ob.Sname);
		System.out.println("City:"+ob.City);	
		System.out.println("Pincode:"+ob.pincode);
		}
	
}
