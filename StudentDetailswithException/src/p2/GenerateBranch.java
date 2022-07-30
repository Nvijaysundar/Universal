package p2;

public class GenerateBranch {
		public String GenerateB(String BrCode)
		{
			return switch(BrCode)
					{
			case "05":
				yield "CSE";
			case "04":
				yield "ECE";
			case "03":
				yield"MECH";
				default:
					yield "null";
					};
		}
}
