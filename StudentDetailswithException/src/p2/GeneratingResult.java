package p2;

public class GeneratingResult {
	public String GenerateR(float per, boolean b)
	{
		if(b)
			return "fail";
		else if(per> 80 &&  per<=100)
			return "Distintion";
		else if(per>50 && per<=80)
			return "Second Class";
		else
			return "Fail";
	}
}
