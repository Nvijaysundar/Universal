package repeatedquesstion;
import java.util.Scanner;
public class Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		int num = sc.nextInt();
		do
		{
			num/=10;
			count++;
		}while(num!=0);
		System.out.println("Count: "+count);	
		sc.close();
		}
}
