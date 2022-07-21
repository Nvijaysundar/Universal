package macess;

import java.util.Scanner;

public class DemoString4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Roll_no = sc.nextLine();
		if(Roll_no.length() == 10)
		{
			String year = Roll_no.substring(0,2);
			System.out.println("Year: 20"+ year.toString());
			String Collcode = Roll_no.substring(2, 6);
			System.out.println("COllege code: "+ Collcode.toString());
			String Branch = Roll_no.substring(6, 8);
			switch(Branch)
			{
			case "01":
				System.out.println("BRanch: CIVIL");
				break;
			case "02":
				System.out.println("BRanch: EEE");
				break;
			case "03":
				System.out.println("BRanch: MECH");
				break;
			case "04":
				System.out.println("BRanch: ECE");
				break;
			case "05":
				System.out.println("BRanch: CSE");
				break;
			}
			String series = Roll_no.substring(8);
			System.out.println("Sries: "+series.toString());
		}
		else
		{
			System.out.println("Invalid Roll");
		}
		sc.close();

	}

}
