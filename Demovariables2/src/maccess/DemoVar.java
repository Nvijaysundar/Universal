package maccess;
public class DemoVar {
	static float num1=16,num2= 17,num3;
	float x= 99,y=10,z;
	public static void main(String[] args) {
		DemoVar.num3 = DemoVar.num1*DemoVar.num2;
		System.out.println("Mul: "+DemoVar.num3);
		DemoVar D = new DemoVar();
		D.z = D.x % D.y;
		System.out.println("Rem= "+D.z);
	}	
}
