package maccess;
import java.util.Scanner;
public class OperatorsMethods {
		static int a=20,b=96;
		void set(int x,int y)
		{
			a =x;
			b =y;
		}
		void add()
		{
			System.out.println(a+b);
		}
		static void sub()
		{
			System.out.println(a-b);
		}
		static void mul()
		{
			System.out.println(a*b);
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OperatorsMethods Op = new OperatorsMethods();
		int x= sc.nextInt();
		int y= sc.nextInt();
		Op.set(x,y);
		System.out.println("1.Add\n2.Sub\n3.mul");
		System.out.println("Enter Choice");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			Op.add();
			break;
		case 2:
			OperatorsMethods.sub();
			break;
		case 3:
			OperatorsMethods.mul();
			break;
		default:
			System.out.println("Invalid INput");
		}
		sc.close();
	}

}
