package p2;
import p2.EnumC;
public class DemoMain {

	public static void main(String[] args) {
		
	EnumC c[] =EnumC.values();
	System.out.println("==DIsplay==");
	for(EnumC k : c)
	{
		System.out.println("Name:" +k.toString() +" Cost " +k.getModel());
	}
	}
}
