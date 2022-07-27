package p1;
import java.util.Arrays;
import java.util.Spliterator;
public class JaggedARrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a1[] = {11,12,13};
		Integer a2[] = {1,2,3,4};
		Integer a[][] = {a1,a2};
		Spliterator<Integer[]> sp = Arrays.spliterator(a);
		sp.forEachRemaining((k)->
		{
			for(int j=0;j<k.length;j++)
				System.out.print(k[j]+" ");
			System.out.println();
		});
	}

}
