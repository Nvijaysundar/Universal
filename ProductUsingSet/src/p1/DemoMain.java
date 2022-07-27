package p1;
import p2.Product;
import java.util.*;
public class DemoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Product> s = null;
		System.out.println("1.Hash\n2.Linked\n3.Tree\nEnter choice");
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			s = new HashSet<Product>();
			break;
		case 2:
			s = new LinkedHashSet<Product>();
			break;
		case 3:
			s = new TreeSet<Product>();
			break;
		default:
			System.out.println("Invali		d Choice...");
		}
		for(int i=0;i<3 ;i++)
		{
			System.out.println("ENter Pcode");
			String Pcode = sc.nextLine();
			System.out.println("ENter PName");
			String PName = sc.nextLine();
			System.out.println("ENter PQty");
			int PQty = Integer.parseInt(sc.nextLine());
			System.out.println("ENter Pprice");
			float Pprice = Float.parseFloat(sc.nextLine());
			s.add(new Product(Pcode, PName, PQty, Pprice));
		}
			Spliterator< Product> sp = s.spliterator();
			sp.forEachRemaining(  (K)->
			{
				System.out.println(K.toString());
			});
	}

}
