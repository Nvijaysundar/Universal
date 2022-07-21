package test;
import java.util.Scanner;
public class Withdraw {
	Balance B = new Balance();
	Scanner sc = new Scanner(System.in);
	public void Withd()
	{
		System.out.println("Enter Amount to be Withdraw in 100 multiples:");
		int amount = sc.nextInt();
		if(amount%100 ==0 && amount >99)
		{
			if(amount<=Balance.balance)
			{
				Balance.balance-=amount;
				System.out.println("Available Balance: "+ Balance.balance);
			}
			else
			{
				System.out.println("Insufficient Amount");
			}
		}
		else
		{
			System.out.println("Invalid Amount");
		}
	}
	

}
