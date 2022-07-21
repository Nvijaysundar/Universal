package repeatedquesstion;
import java.util.*;
public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count =0,sum=0,temp;
		temp=num;
		do 
		{
			num/=10;
			count++;
		}while(num!=0);
		num=temp;
		do
		{
			sum+=Math.pow(num%10,count);
			num/=10;
		}while(num!=0);
		if(sum == temp)
			System.out.println("Arm Strong number");
		else
			System.out.println("Not");
		sc.close();
	}
	
	{
		
		
		
	}

}
