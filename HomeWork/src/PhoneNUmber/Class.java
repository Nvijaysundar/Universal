package PhoneNUmber;

import java.util.Scanner;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ph = sc.nextLine().toUpperCase();
		String ResPh  = ph.replaceAll("[ABC]", "2").replaceAll("[DEF]", "3").replaceAll("[GHI]","4").replaceAll("[JKL]", "5").replaceAll("[MNO]","6").replaceAll("[PQRS]","7").replaceAll("[TUV]","8").replaceAll("[WXYZ]","9");
		System.out.println("Phone number"+ ResPh);
		
	}

}
