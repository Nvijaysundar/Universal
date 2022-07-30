package p2;

public class Printer {
		public synchronized static void print(int n,String name)
		{
			for(int i=0;i<n;i++) {
				System.out.println(i+" "+name);
				try {
					Thread.sleep(1000);
				}
				catch(Exception ob)
				{
					ob.printStackTrace();	
				}
			}
		}
}
