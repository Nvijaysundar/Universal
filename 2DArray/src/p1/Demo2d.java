package p1;
import java.util.*;
public class Demo2d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum =0;
		Integer arr[][] = new Integer[sc.nextInt()][sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
			arr[i][j] = sc.nextInt();	
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			sum=0;
			for(int j=0;j<arr[i].length;j++)
			{
				sum+= arr[i][j];
			}
			System.out.println("Sum of"+i+":"+sum);
		}
		
		for(int i =0 ;i<arr.length ;i++)
		{
			Arrays.sort(arr[i]);
		}
		Spliterator<Integer[]> sp = Arrays.spliterator(arr);
		sp.forEachRemaining( (K)->{
			for(int j=0;j<K.length;j++)
				System.out.print(K[j]+" ");
			System.out.println();
		});
		
		for(int i =0;i<arr.length;i++)
		{
			System.out.println("max of "+i+":"+ arr[i][arr[i].length-1]);
		}
	}

}
