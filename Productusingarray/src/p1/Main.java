package p1;
import p2.Product;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product p[] = new Product[Integer.parseInt(sc.nextLine())];
		for(int i=0;i<p.length;i++)
		{
			System.out.println("Enter Pcode");
			String Pcode = sc.nextLine();
			System.out.println("Enter Pname");
			String Pname = sc.nextLine();
			System.out.println("Enter Pqty");
			int Pqty = Integer.parseInt(sc.nextLine());
			System.out.println("Enter Pprice");
			float Pprice = Float.parseFloat(sc.nextLine());
			p[i] = new Product(Pcode, Pname, Pqty, Pprice);
		}
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i].toString());
		}
		System.out.println("ENhaced for loop");
		for(Product ob : p)
		{
			System.out.println(ob.toString());
		}
		System.out.println("spliterator");
		Spliterator<Product> sp = Arrays.spliterator(p);
		sp.forEachRemaining( (k) ->
		{
			System.out.println(k.toString());
		});
		
		
	}

}
