package test;
import java.util.*;
public class Deposit {
		Balance B = new Balance();
		Scanner s = new Scanner(System.in);
		public Deposit()
		{
			//
		}
	public void Dep()
	{
		System.out.println("Enter Amount to be deposited in 100 multiples:");
		int amount = s.nextInt();
		if(amount%100 ==0 && amount >99)
		{
			Balance.balance+=amount;
			System.out.println("Available Balance: "+ Balance.balance);				}
		else
		{
			System.out.println("Invalid Amount");
			
		}
	}
	

}
