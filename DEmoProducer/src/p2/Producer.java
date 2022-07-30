package p2;

public class Producer implements Runnable {
	public StringBuffer sb=null;
	public Producer()//0-argument Constructor 
	{
		sb = new StringBuffer();
	}
    public void run() {
    	try {
    		synchronized(sb) {
    			for(int i=1;i<=10;i++) {
    				sb.append(i+":");
    				System.out.println("Producer appeding data..");
    				Thread.sleep(1000);
    			}//end of loop
    			sb.notify();//sending msg_to_Waiting thread
    		}//end of lock
    	}catch(Exception e) {e.printStackTrace();}
 

}
}
