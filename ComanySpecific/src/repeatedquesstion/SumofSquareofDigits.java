package repeatedquesstion;
import java.util.Scanner;
public class SumofSquareofDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int num = sc.nextInt();
		do
		{
			sum+=Math.pow(num%10, 2);
			num/=10;
		}while(num!=0);
		System.out.println("Sum: "+sum);
		sc.close();
	}
}
