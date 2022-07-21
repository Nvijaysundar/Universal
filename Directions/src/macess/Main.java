package macess;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n, sum=0;
		while(true)
		{
			n = sc.nextInt();
			if(n ==1 || n ==-1)
				sum+=n;
			else  if(n==0)
			{
				sc.close();
				break;
			}
			else
			{
				System.out.println("INvalid INput");
				System.exit(0);
			}
		}
		switch(sum%4)
		{
		case 0:
			System.out.println("EAST");
			break;
		case 1:
		case -3:
			System.out.println("North");
			break;
		case 2:
		case -2:
			System.out.println("WEST");
			break;
		case 3:
		case -1:
			System.out.println("South");
			
		}
		
		

	}

}
