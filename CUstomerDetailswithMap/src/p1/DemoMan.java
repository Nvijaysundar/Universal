package p1;
import java.util.*;
import p2.CustDetails;
public class DemoMan {
	public static void main(String[] args) {
		HashMap<Long, CustDetails> h = new HashMap<Long, CustDetails>();
		h.put(7987465465L, new CustDetails("XYZ","Saving", 15000));
		h.put(7897645213L, new CustDetails("ABC","Current", 90000));
		h.put(7987655465L, new CustDetails("MNO","Saving", 25000));
		h.forEach( (k,v) -> {
			System.out.println(k.toString() + v.toString());
		});
	}

}
