package maccess;
import java.util.Scanner;
public class DemWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n,sum=0;
		int i=1;
		while(i++<=6)
		{
			n =sc.nextInt();
			sum+=n;
		}
		System.out.println(sum);
		sc.close();
	}
}
