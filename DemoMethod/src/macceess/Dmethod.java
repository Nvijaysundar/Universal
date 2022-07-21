package macceess;
public class Dmethod {
	int a =10;
	static int b=20;
	 static void add()
	{
		System.out.println("Static Add method");
		//System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
	}
		
	public static void main(String[] args) {
		Dmethod.add();
		//System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
		
		
	}

}
