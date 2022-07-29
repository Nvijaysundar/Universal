package p1;
import java.util.*;
public class DemoMAin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Float> Q = new PriorityQueue<Float>();
		Q.offer(123.6F);
		Q.add(111.56f);
		Q.add(1.5f);
		Q.offer(456.789F);
		System.out.println(Q.toString());
		Spliterator<Float> sp = Q.spliterator();
		sp.forEachRemaining(  (K) ->
		{
			System.out.println(K.toString()+" ");
		});
		Q.poll();
		System.out.println(Q.toString());
		System.out.println(Q.peek());

	}

}
