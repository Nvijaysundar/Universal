public class Employee {
	public static void main(String[] args) {
		
		float hra,da,tsal,bsal = 155;
		hra = (float) ((bsal * 93)/100.0);
		da = (float) ((bsal *63)/100.0);
		tsal = bsal+hra+da;
		System.out.println("Hra:"+hra+"\nda:"+da);
		System.out.println("Total Salary: "+tsal);
		
	}
}
