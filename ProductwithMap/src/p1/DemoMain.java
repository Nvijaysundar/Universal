package p1;
import java.util.*;
import p2.Product;
public class DemoMain {
	public static void main(String[] args) {
		Map m = null;
		System.out.println("1.Hashmap\n2.Linked\n3.Tree\n4.HasTable\n");
		System.out.println("ENter you Choice");
		Scanner sc = new Scanner(System.in);
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			m = new HashMap<String,Product>();
			break;
		case 2:
			m = new LinkedHashMap<String, Product>();
			break;
		case 3:
			m = new TreeMap<String, Product>();
			break;
		case 4:
			m = new Hashtable<String, Product>();
			break;
			default:
				System.out.println("Invalid INput");
		}
		m.put(new String("A121"), new Product("Mouse",50,450.50F));
		m.put(new String("A122"), new Product("CDDR",20,400F));
		m.put(new String("A121"), new Product("FDDR",10,650F));	
		m.forEach((k,v) ->
		{
			System.out.println(k.toString()+" "+v.toString());
		});
		Set<String> s = m.keySet();
		s.forEach((K)->
		{
			System.out.println(K.toString());
		});
		Collection<Product> c = m.values();
		c.forEach( (V)->
		{
			System.out.println(V.toString());
		});
	}
		

}
