package maccess;

public class Product {
	public String code,Name;
	public float price;
	public int qty;
	public void getProduct()
	{
		System.out.println("Code:"+code);
		System.out.println("Name:" +Name);
		System.out.println("Price:"+price);
		System.out.println("Quantity:" + qty);
	}

}
