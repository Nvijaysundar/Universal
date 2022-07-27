package p1;
import p2.Product;
import java.util.*;
public class DemoMain {
	public static void main(String[] args) {	
		Object ob[] = new Object[3];	
		ob[0] = new Integer(123);
		ob[1] = new String("JAVA");
		ob[2] = new Product("A121","Mouse",50,456);
		Spliterator<Object>  sp = Arrays.spliterator(ob);
		sp.forEachRemaining(	(Z)->
		{
			System.out.println(Z.toString());
		});
		

	}

}
