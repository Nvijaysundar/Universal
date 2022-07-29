package p2;

public class Single {
	private Single() {};
		private static Single ob = null;
		public static Single getReferece()
		{
			if(ob == null)
				ob = new Single();
			return ob;
		}
		public void display()
		{
			System.out.println("Display method from Signletonclass");
		}
}
