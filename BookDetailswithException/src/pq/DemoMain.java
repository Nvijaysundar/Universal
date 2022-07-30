package pq;
import p2.Book;
import java.util.*;
public class DemoMain extends Exception {
	public DemoMain(String msg)
	{
		super(msg);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try
		{
			ArrayList<Book> AL = new ArrayList<Book>();
			System.out.println("ENter No of books:");
			int n = Integer.parseInt(sc.nextLine());
			for(int i = 1;i<=n ;i++)
			{
				Book B = new Book();
				System.out.println("Enter Code:");
				B.Code = sc.nextLine();
				System.out.println("ENter Name");
				B.name = sc.nextLine();
				System.out.println("ENter Author");
				B.Author = sc.nextLine();
				System.out.println("Enter Price");
				B.price = Float.parseFloat(sc.nextLine());
				if(B.price<0)
				{
					DemoMain ob = new DemoMain("Invalid PRice");
					throw ob;
				}
				System.out.println("Enter Qty");
				B.qty = Integer.parseInt(sc.nextLine());
				if(B.qty<0)
				{
					DemoMain ob = new DemoMain("Invalid Quantity");
					throw ob;
				}
				AL.add(B);
			}
			Spliterator<Book> sp = AL.spliterator();
			sp.forEachRemaining( (k) -> {
				System.out.println(k.toString());
			});
		}
		catch(DemoMain ob)
		{
			System.out.println(ob.getMessage());
		}
	}
}
