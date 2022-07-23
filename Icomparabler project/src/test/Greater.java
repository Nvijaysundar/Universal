package test;

public class Greater implements Icomparable {

	@Override
	public int compareTo(int x, int y) {
		if(x>=y)
			return x;
		else
			return y;
	}

}
