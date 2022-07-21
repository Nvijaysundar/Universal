package maceess;

import java.util.Scanner;

public class StringClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		System.out.println("Display using to string ");
		System.out.println(string.toString());
		System.out.println("Using INdex Value");
		for(int i= 0;i<string.length();i++)
		{
			char ch = string.charAt(i);
			System.out.print(ch);
		}
		System.out.println("Reversing of string");
		for(int i= string.length()-1; i>=0 ;i--)
		{
			char ch = string.charAt(i);
			System.out.print(ch);
		}
	
	
	
	
	}

}
