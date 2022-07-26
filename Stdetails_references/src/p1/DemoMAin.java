package p1;
import p2.*;
import java.util.*;
public class DemoMAin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	Address ad = new Address();
	Contact C = new Contact();
	Result R = new Result();
	Student s = new Student(ad, C, R);
	Read rd = new Read();
	rd.setdata(sc, s);
	Display D = new Display();
	D.Dis(s);
	}

}
