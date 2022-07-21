package test;
public class Subclass {
  public int a,b;
  String name;
  float x;
		  public Subclass(int a1, String name1, float x1)
		  {
			  a = a1;
			  name =name1;
			  x =x1;
		  }
  public void get()
  {
	  System.out.println("A:"+a);
	  System.out.println("B:"+b);
	  System.out.println("name:"+name);
	  System.out.println("x:"+x);
	  
  }
}
