package test;
public class Display2 implements Runnable {
	@Override
	public void run() {
		for(int i=200 ;i<=204;i++)
		{
			System.out.println("Task-2 : "+i);
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
