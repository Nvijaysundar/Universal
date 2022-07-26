package p1;
public class DemoMain {
	public static void main(String[] args) {
		Itest ob = (int x)->
		{
			System.out.println("Lambda exp");
			System.out.println("X:"+x);
		};
		ob.m1(123);
	}
}
