package test;
public class Display1 implements Runnable {
	public void run() {
		for(int i=100 ;i<=104;i++)
		{
			System.out.println("Task-1 : "+i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

}
