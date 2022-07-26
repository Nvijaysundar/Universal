package p2;
public class Product {
	String Pcode,Pname;
	int Pqty;
	Float Pprice;
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
}
