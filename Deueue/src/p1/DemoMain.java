package p1;
import java.util.*;
public class DemoMain {
	public static void main(String[] args) {
		ArrayDeque<Double> AD =  new ArrayDeque<Double>();
		AD.addFirst(456.6);
		AD.addFirst(789.6);
		AD.addLast(741.5);
		AD.addLast(741.5);
		System.out.println(AD.toString());
		AD.removeFirst();
		//AD.removeLast();
		AD.removeFirstOccurrence(741.5);
		System.out.println(AD.toString());
	}

}
