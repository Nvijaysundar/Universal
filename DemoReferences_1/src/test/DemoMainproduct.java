package test;
import maccess.*;
import java.util.Scanner;
public class DemoMainproduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product pd = new Product();
		System.out.println("ENter Code:");
		pd.code = sc.nextLine();
		System.out.println("ENter Name:");
		pd.Name = sc.nextLine();
		System.out.println("ENter price:");
		pd.price = sc.nextFloat();
		System.out.println("ENter quantity:");
		pd.qty = sc.nextInt();
		Display D = new Display();
		D.dis(pd);
		sc.close();
	}

}
