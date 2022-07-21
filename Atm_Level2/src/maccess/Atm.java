package maccess;
import test.*;
import java.util.Scanner;
public class Atm {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int pin_chances=3;
		while(true)
		{
			System.out.println("Enter Pin: ");
			int pin = s.nextInt();
			if (pin == 1111 ||  pin ==2222 ||pin  ==3333 )
			{
				System.out.println("Pin Verified");
				{
					System.out.println("1.Balance\n2.Deposit\n3.Withdarw\n4.Exit");
					System.out.println("Enter Choice:");
					int ch = s.nextInt();
					switch(ch)
					{
					case 1:
						System.out.println("Available Balance: "+ Balance.balance);
						break;
					case 2:
						Deposit D = new Deposit();
						D.Dep();
						break;
					case 3:
						Withdraw W = new Withdraw();
						W.Withd();
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
	}

}
