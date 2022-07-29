package p2;

public enum EnumC {
	Alto("baseModel"),Scorpio("Highend"),Desire("Mid level");//elements
	int a = 20;
	public String Model;
	private EnumC(String price)
	{
		this.Model =price;
	}
	public String getModel()
	{
		return Model;
	}
}
