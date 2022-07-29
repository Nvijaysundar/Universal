package p2;
public class Product {
	String Pname;
	int Pqty;
	Float Pprice;
	public Product(String Pname,int Pqty,float Pprice)
	{
		this.Pname =Pname;
		this.Pqty = Pqty;
		this.Pprice = Pprice;
	}
	public String toString()
	{
		return "\t"+Pname+"\t"+Pqty+"\t"+Pprice;
	}
}
