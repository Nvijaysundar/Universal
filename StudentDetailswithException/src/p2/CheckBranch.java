package p2;

@SuppressWarnings("serial")
public class CheckBranch extends Exception {
	public CheckBranch(String msg)
	{
		super(msg);
	}
	public void verify(String br) throws CheckBranch
	{
		try
		{
			switch(br)
			{
			case "CSE":
			break;
			case "ECE":
			break;
			case "EEE":
				break;
			case "MECH":
				break;
			case "CIVIL":
				break;
			default: 
				CheckBranch ob =  new CheckBranch("Invalid Branch");
				throw ob;
			}
		}
			catch(CheckBranch ob)
			{
				throw ob; //rethrowing
			}
		
	}
}
