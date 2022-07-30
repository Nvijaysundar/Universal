package p2;

public class Consumer implements Runnable {

	public Producer prod=null;
	   public Consumer(Producer prod)
	   {
		   this.prod=prod;
	   }
	@Override
	public void run() {
		
		try {
			   synchronized(prod.sb) {
				   System.out.println
				   ("Consumer Activated..and Blocked");
				   prod.sb.wait();//Blocked
				   System.out.println("====Display using Consumer===");
				   System.out.println(prod.sb.toString());
			   }//end of lock
		   }
		catch(Exception e) 
		{e.printStackTrace();}
	   }

	}


