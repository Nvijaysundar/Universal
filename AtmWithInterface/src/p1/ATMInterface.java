package p1;
import p2.*;
import java.util.Scanner;

public class ATMInterface {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int pin_chances=3,amount;
		while(true)
		{
			System.out.println("Enter Pin: ");
			int pin = s.nextInt();
			if (pin == 1111 ||  pin ==2222 ||pin  ==3333 )
			{
				System.out.println("Pin Verified");
				while(true)
				{
					System.out.println("1.Balance\n2.Deposit\n3.Withdarw\n4.Exit");
					System.out.println("Enter Choice:");
					int ch = s.nextInt();
					switch(ch)
					{
					case 1:
						Balance B = new Balance();
						B.getbalance();
						break;
					case 2:
						Deposit D = new Deposit();
						System.out.println("ENter amount to be deposited in 100 multiples:");
						amount = s.nextInt();
						D.process(amount);
						break;
					case 3:
						Withdraw W = new Withdraw();
						System.out.println("ENter amount to be withdraw in 100 multiples:");
						amount = s.nextInt();
						W.process(amount);
						break;
					case 4:
						System.out.println("THankYou!!!");
								
						System.exit(0);
					default:
						System.out.println("Invalid Choice.....");
					}
				}
			}
			else {
				System.out.println("Invalid Pin");
				System.out.println("Left OVer CHances:"+--pin_chances);
			}
			if(pin_chances==0)
			{
				System.out.println("THankYou!!!");
				s.close();
				System.exit(0);
			}
		}
	
		// TODO Auto-generated method stub

	}

}
