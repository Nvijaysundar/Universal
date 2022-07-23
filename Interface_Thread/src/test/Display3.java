package test;

public class Display3 implements Runnable {

	@Override
	public void run() {
		for(int i=300 ;i<=304;i++)
		{
			System.out.println("Task-3 : "+i);
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
