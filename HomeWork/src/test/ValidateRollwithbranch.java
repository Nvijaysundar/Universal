package test;

public class ValidateRollwithbranch {
	public boolean z =false;
	public String branch =  null;
	public boolean validate(String br,String Branchcode) //19NF1A0213
	{     // branch by student, branch code
		switch(Branchcode)
		{
		case "01":
			branch = "CIVIL";
			break;
		case "02":
			branch = "EEE";
			break;
		case "03":
			branch = "MECH";
			break;
		case "04":
			branch ="ECE";
			break;
		case "05":
			branch = "CSE";
			break;		
		}
		if(branch != null)
		{
			if(branch.equals(br))
			{
				z=true;
			}
		}
			
		return z;
	}

}
