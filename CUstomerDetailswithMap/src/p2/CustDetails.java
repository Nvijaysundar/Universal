package p2;

public class CustDetails {
		String Aname,Type;
		static int bal;
		public CustDetails(String Aname, String Type, int bal)
		{
			this.Aname = Aname;
			this.Type = Type;
			CustDetails.bal = bal;
		}
		public String toString()
		{
			return Aname +"\t"+Type+ "\t" + CustDetails.bal;
		}
		
}
