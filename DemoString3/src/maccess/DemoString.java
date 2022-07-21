package maccess;

import java.util.Scanner;

public class DemoString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String sub1 = st.substring(5);
		//Retrieve data from 5 index to end
		System.out.println("sub1:" + sub1.toString());
		String sub2 = st.substring(2,8);
		// Retrieve data from 2 index to 7 index
		System.out.println("sub2:" + sub2.toString());
		
		
		
	}

}
