package maccess;
import java.util.Scanner;
public class Percentage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1= sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int s4 =sc.nextInt();
		int s5 = sc.nextInt();
		int s6 = sc.nextInt();
		float per = (float) ((s1+s2+s3+s4+s5+s6)/6.0);
		System.out.println("Percentage: "+per);
		System.out.println(sc instanceof Scanner);
		sc.close();
	}
}
