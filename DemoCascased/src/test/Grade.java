package test;
import java.util.Scanner;
class Grade{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1= sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int s4 =sc.nextInt();
		int s5 = sc.nextInt();
		int s6 = sc.nextInt();
		float per = (float) ((s1+s2+s3+s4+s5+s6)/6.0);
		if(per>=40&& per<=100)
		{
			System.out.println("PASS");
			if(per>90)
				System.out.println("Grade - O");
			else if(per>80)
				System.out.println("Grade - S");
			else if(per>70)
				System.out.println("Grade -A");
			else if(per>60)
				System.out.println("Grade -B");
			else if(per>50)
				System.out.println("Grade -C");
			else 
				System.out.println("Grade -D");
		}
		else if(per>=0 && per<40)
		{
			System.out.println("Fail");
		}
		else
			System.out.println("Invalid Percentage");
		
		sc.close();
			

	}

}
