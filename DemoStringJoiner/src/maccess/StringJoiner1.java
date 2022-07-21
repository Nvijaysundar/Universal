package maccess;
import java.util.StringJoiner;
public class StringJoiner1 {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("/");
		sj.add("12");
		sj.add("07");
		sj.add("2022");
		System.out.println(sj.toString());
		StringJoiner sj2 = new StringJoiner("-");
		sj2.add("universal college");
		sj2.add("perecharla");
		sj2.add("guntur");
		System.out.println(sj2.toString());
		sj.merge(sj2);
		System.out.println(sj.toString());
		sj2.merge(sj);
		System.out.println(sj2.toString());
		StringJoiner sj3 = new StringJoiner("#");
		sj3.setEmptyValue("String is empty");
		System.out.println(sj3.toString());
		sj3.add("java");
		System.out.println(sj3.toString());
	}

}
