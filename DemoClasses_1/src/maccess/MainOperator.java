package maccess;
import java.util.Scanner;
import test.*;
public class MainOperator {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		int b= sc.nextInt();
		while(true)
		{
		System.out.println("1.Add\n2.sub\n3.mul\n4.Exit\nenter choice");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			Addition Ad = new Addition();
			//Ad.set(a,b);
			//System.out.println("Addition:"+Ad.get());
			Ad.d+=100;
			System.out.println("D:"+Ad.d);
			Addition.c +=50;
			System.out.println("C:"+Addition.c);
			break;
		case 2:
			Subtraction Sb = new Subtraction();
			Sb.set(a, b);
			System.out.println("Sub:"+Sb.get());
			break;
		case 3:
			Multiplication M = new Multiplication();
			M.set(a, b);
			System.out.println("Mul:"+M.get());
			break;
		case 4:
			sc.close();
			System.exit(0);
			default:
				System.out.println("Invalid");
		}
	}
	
	

	}

}
