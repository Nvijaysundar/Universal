package maccess;
public class DemoStringBuffer {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();//Con call
		System.out.println("Capacity:"+ sb.capacity());
		System.out.println("length:"+ sb.length());
		sb.append("Java");
		System.out.println("sb: "+ sb.toString());
		System.out.println("Capacity:"+ sb.capacity());
		System.out.println("length:"+ sb.length());
		sb.append("language");
		System.out.println("sb: "+ sb.toString());
		System.out.println("Capacity:"+ sb.capacity());
		System.out.println("length:"+ sb.length());
		sb.append("1995");
		System.out.println("sb: "+ sb.toString());
		System.out.println("Capacity:"+ sb.capacity());
		System.out.println("length:"+ sb.length());
		sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		System.out.println("sb: "+ sb.toString());
		System.out.println("Capacity:"+ sb.capacity());
		System.out.println("length:"+ sb.length());
		sb.insert(12,"BYE");
		System.out.println("sb: "+ sb.toString());
		System.out.println("Capacity:"+ sb.capacity());
		System.out.println("length:"+ sb.length());
		sb.delete(12,15);
		System.out.println("sb: "+ sb.toString());
		System.out.println("Capacity:"+ sb.capacity());
		System.out.println("length:"+ sb.length());
		sb.reverse();
		System.out.println("sb: "+ sb.toString());
		System.out.println("Capacity:"+ sb.capacity());
		System.out.println("length:"+ sb.length());
		
	}

}
