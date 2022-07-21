package PhoneNUmber;
import java.util.Scanner;
public class VCNS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vc=0,cc=0,nc=0,syc=0,sum=0;
		String st = sc.nextLine();
		System.out.println("length:"+st.length());
		for(int i =0;i<st.length();i++)
		{
			char ch = st.charAt(i);	
			if((ch >='A' && ch <='Z') || (ch>='a'&& ch<='z'))
			{
				switch(ch)
				{
				case 'a':
				case 'A':
				case 'e':
				case 'E':
				case 'i':
				case 'I':
				case 79:
				case  111:
				case 'U':
				case 'u':
					vc++;
					break;
					default:
						cc++;
				}
			}
			else if(ch>=48 && ch<=57)
			{
				nc++;
				String res = String.valueOf(ch);//converting char into string
				int a = Integer.parseInt(res);//converting string into int
				sum+= a;
			}
			else
			{
				syc++;
			}
		}
		System.out.println(vc + ": VC");
		System.out.println("CC"+ cc);
		System.out.println("NC: "+ nc);
		System.out.println("SYC: "+ syc);
		System.out.println("Sum :"+sum);
		sc.close();
		
	}

}
