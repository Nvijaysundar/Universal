package p1;
import p2.IArithematic;
import java.util.*;
public class DemoMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add\n2.Sub\n3.Mul\n4.DivEnter choice");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			IArithematic ad = (int x, int y)->
				 {	
					return x+y;
				};
				System.out.println(ad.process(sc.nextInt(),sc.nextInt()));
			break;
		case 2:
			IArithematic ad1 = (int x, int y)->
			 {	
				return x-y;
			};
			System.out.println(ad1.process(sc.nextInt(),sc.nextInt()));
			break;
		case 3:
			IArithematic ad2 = (int x, int y)->
			 {	
				return x*y;
			};
			System.out.println(ad2.process(sc.nextInt(),sc.nextInt()));
			break;
		case 4:
			IArithematic ad4 = new IArithematic() {
				@Override
				public double process(int x, int y) {
					return x/y;
				}
			};
			System.out.println(ad4.process(sc.nextInt(),sc.nextInt()));
			break;
			
		default:
			System.out.println("Invalid Selection..");
		}
		sc.close();

	}

}
