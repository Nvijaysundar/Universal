package p2;
public class Product implements Comparable{
	String Pcode,Pname;
	int Pqty;
	float Pprice;
	public Product(String Pcode,String Pname,int Pqty,float Pprice)
	{
		this.Pcode=Pcode;
		this.Pname =Pname;
		this.Pqty = Pqty;
		this.Pprice = Pprice;
	}
	public String toString()
	{
		return Pcode+"\t"+Pname+"\t"+Pqty+"\t"+Pprice;
	}
	
	public int compareTo(Object o) {
		Product P = (Product)o;
		int z=Pcode.compareTo(P.Pcode);
		if(z==0)
			return 0;
		else if (z>0)
			return 1;
		else
			return -1;
	}
}
