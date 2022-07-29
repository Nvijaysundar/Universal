package p1;
import java.util.*;
public class DemoMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try
		{	
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		//int re = num/0; //Arithmetic Exception
		//System.out.println(re);
		Integer a[] = new Integer[num];
		System.out.println("Enter ayyay elements:");
		for(int i=0;i<num+1;i++)
		{
			a[i]= new Integer(sc.nextInt());
		}
		
		System.out.println("Displaying elements");
		for(int i=0;i<num;i++)
		{
			System.out.print(a[i].toString());
		}
		}
		catch(InputMismatchException|ArithmeticException|ArrayIndexOutOfBoundsException ob  )
		{
			ob.printStackTrace();
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
		finally
		{
			System.out.println("Program completed");
			sc.close();
		}
		
		

	}

}
