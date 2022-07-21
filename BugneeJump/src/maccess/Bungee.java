package maccess;
import java.util.*;
public class Bungee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		if(age>=17 && age<=55)
		{
			System.out.println("Age Statisfied\nEnter Height: ");
			float ht = sc.nextFloat();
			if(ht>=4.7)
			{
				System.out.println("Height Verified\nEnter Weight: ");
				int wt = sc.nextInt();
				if(wt>=48&& wt<=150)
				{
					if(wt>=90)
						System.out.println("Add Extra Ropes");
					System.out.println("Eligible");
				}
				else
					System.out.println("Not Elgible, Reson: weight Limit");
				
			}
			else
				System.out.println("Not Elgible, Reson: Height Limit");
		}
		else
			System.out.println("Not Elgible, Reson: Age Limit");
		sc.close();
	}
}
