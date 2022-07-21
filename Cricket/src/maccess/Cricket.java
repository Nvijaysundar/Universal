package maccess;
import java.util.*;
public class Cricket {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int ta_b = sc.nextInt();
	int ta_r = sc.nextInt();
	int tb_r= sc.nextInt();
	int tb_b = sc.nextInt();
	float ta_o = (float)((ta_b/6) + ((ta_b%6)*0.1));
	float tb_o = (float)((tb_b/6) + ((tb_b%6)*0.1));
	System.out.println("overs:"+ta_o);
	System.out.println("overs:"+tb_o);
	float tb_Rr  = (float)(tb_r/tb_o);
	float ta_Rr  = (float)(ta_r/ta_o);
	System.out.println("TB RR"+tb_Rr);
	System.out.println("TA RR"+ta_Rr);
	if(tb_Rr>=ta_Rr)
		System.out.println("Eligible to win");
	else
		System.out.println("Not");
	sc.close();
	
	}

}
