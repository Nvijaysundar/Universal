package p2;

public class Result {
	float per;
	
	public String getresult() {
	if(per>40)
		return "PASS";
	else
		return "Fail";
	}	
}
