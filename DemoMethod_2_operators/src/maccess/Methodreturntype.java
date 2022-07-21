package maccess;
import java.util.Scanner;
public class Methodreturntype {
	static float z;
	int b;
	void set (float x, int y)
	{
		z = x;
		b =y;
	}
	float get()
	{
		return z + b;
	}	
	public static void main(String[] args) {
		Scanner sc  = new Scanner (System.in);
		float a = sc.nextFloat();
		int c = sc.nextInt();
		Methodreturntype m = new Methodreturntype();
		m.set(a, c);
		float res= m.get();
		System.out.println("Sum:"+res);
		sc.close();

	}
}
