package maccess;
import java.util.Scanner;
public class Atm {
	int balance = 15000;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Atm a = new Atm();
		int amount;
		System.out.println("Enter Pin: ");
		int pin = s.nextInt();
		if (pin == 1111 ||  pin ==2222 ||pin  ==3333 )
		{
			System.out.println("Pin Verified");
			System.out.println("1.Balance\n2.Deposit\n3.Withdarw\n4.Exit");
			System.out.println("Enter Choice:");
			int ch = s.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Available Balance: "+ a.balance);
				break;
			case 2:
				System.out.println("Enter Amount to be deposited in 100 multiples:");
				amount = s.nextInt();
				if(amount%100 ==0 && amount >99)
				{
					a.balance+=amount;
					System.out.println("Available Balance: "+ a.balance);
					System.out.println("THankYou!!!");				}
				else
				{
					System.out.println("Invalid Amount");
					System.out.println("THankYou!!!");
				}
				break;
			case 3:
				System.out.println("Enter Amount to be Withdraw in 100 multiples:");
				amount = s.nextInt();
				if(amount%100 ==0 && amount >99)
				{
					if(amount<=a.balance)
					{
						a.balance-=amount;
						System.out.println("Available Balance: "+ a.balance);
						System.out.println("THankYou!!!");
					}
					else
					{
						System.out.println("Insufficient Amount");
						System.out.println("THankYou!!!");
					}
				}
				else
				{
					System.out.println("Invalid Amount");
					System.out.println("THankYou!!!");
				}
				break;
			case 4:
				System.out.println("THankYou!!!");
				System.exit(0);
			default:
				System.out.println("Invalid Choice.....");
				System.out.println("THankYou!!!");
			}
		}
		else {
			System.out.println("Invalid Pin");
			System.out.println("THankYou!!!");
		}
		s.close();
	}

}
