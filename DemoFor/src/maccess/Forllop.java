package maccess;
import java.util.*;
public class Forllop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char x ='A';
		for(int i=1;i<=n;i++)
		{
			
			for(int sp =1;sp<=n-i ;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				if(i>=j)
					System.out.print(x++ + " ");
				if(x > 'Z')
					x ='A';
			}
		System.out.println();
	}
		n--;
		for(int i=1;i<=n;i++)
		{
			
			for(int sp =1;sp<=i ;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				if(i<=j)
					System.out.print(x++ + " ");
				if(x > 'Z' && !(x>'a'))
					x ='a';
			}
		System.out.println();
	}
		sc.close();
	}
}
