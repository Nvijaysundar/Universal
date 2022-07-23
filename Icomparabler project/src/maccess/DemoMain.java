package maccess;
import java.util.*;
import test.*;
public class DemoMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("ENter choice:\n1.Greater\n2.Smaller");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			Greater G = new Greater();
			System.out.println("Res:"+G.compareTo(x, y));
			break;
		case 2:
			Smaller s = new Smaller();
			System.out.println("Res:" +s.compareTo(x, y));
			break;
		}
	}

}
