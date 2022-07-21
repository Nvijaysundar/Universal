package macess;

public class DemoStringiseqalto {
	public static void main(String[] args) {
		String st1 = "java";
		String st2 = "java";
		String st3 = new String("Java");
		String st4 = new String("Java");
		System.out.println("==Using is equal to operator");
		if(st1==st2)
			System.out.println("String are same");
		else
			System.out.println("String are not same");
		
		if(st3==st4)
			System.out.println("String are same");
		else
			System.out.println("String are not same");
	}
}
