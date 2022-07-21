package maccess;
public class DemoInstance {
	int a= 15,b=20,c;
	public static void main(String[] args) {
		DemoInstance di = new DemoInstance();
		 di.c= di.a+di.b;
		 System.out.println("the sum of a&b is: "+ di.c);
		
	}

}
