package p2;

public class Deposit implements Transaction {
	
	@Override
	public void process(int amount) {
		if(amount%100==0 && amount>99)
		{
			if(amount<Balance.bal)
			{
				Balance.bal+=amount;
				Transaction.b.getbalance();
			}
			else
			{
				System.out.println("Insufficient amount");
			}
		}
		else
		{
			System.out.println("Invalid Amount....");
		}
		
	

	}

}
