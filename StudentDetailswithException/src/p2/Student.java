package p2;
import java.util.*;
public class Student {
	public String name, Rollno,Branch,Result;
	public int totmarks;
	public float per;
	public String toString()
	{
		StringJoiner sj = new StringJoiner("-");
		sj.add(name).add(Rollno).add(Branch).add(Result).add(String.valueOf(totmarks)).add(String.valueOf(per));
		return sj.toString();
	}
}
