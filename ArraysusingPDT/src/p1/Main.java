package p1;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int arr[] = new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Max: "+arr[arr.length-1]);
		System.out.println("Low:"+arr[0]);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+ ":" + arr[i]);
		}

	}

}
