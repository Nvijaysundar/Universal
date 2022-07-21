package maccess;
import java.util.Scanner;
public class DemoifElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float per = sc.nextFloat();
		if(per>=0 && per<=100)
		{
			if(per>=40 )
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
		}
		else
			System.out.println("Invalid Input");
		
		System.out.println("Execution Completed");
	}

}
