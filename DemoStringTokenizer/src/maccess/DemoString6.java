package maccess;
import java.util.Scanner;
import java.util.StringTokenizer;
public class DemoString6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringTokenizer STT = new StringTokenizer(s);
		while(STT.hasMoreTokens())
		{
			String rd = STT.nextToken();
			StringBuffer sb = new StringBuffer(rd);
			System.out.println(sb.reverse()+ " ");
		}
		
		sc.close();
		//JAVA PROGRAM
		//AVAJ MARGORP

	}

}
