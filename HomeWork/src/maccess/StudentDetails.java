package maccess;
import test.*;
import java.util.*;
public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		String name = sc.nextLine();
		System.out.println("Enter Branch");
		String Branch = sc.nextLine().toUpperCase();
		CheckBranch cb = new CheckBranch();
		boolean BV = cb.verify(Branch);
		if(BV)
		{
			System.out.println("Enter Roll no: ");
			String RollNO = sc.nextLine();
			if(RollNO.length() == 10)
			{
				ValidateRollwithbranch v = new ValidateRollwithbranch();
				boolean b = v.validate(Branch,RollNO.substring(6,8) );
				if(b)
				{
					System.out.println("Enter 6 sub marks");
					int i=1,totM =0;
					boolean p =false;
					while(i<=6)
					{
						System.out.println("Enter marks of Sub "+ i++);
						int sub = sc.nextInt();
						if(sub<0 || sub>100)
						{
							System.out.println("Invalid MArks...");
							continue;													
						}
						else
						{
							if(sub>0 && sub<40)
								p =true;
							totM += sub;				
						}						
					}
					float per = (float) (totM/6.0);
					StudentRes  Sr = new StudentRes();
					String result = Sr.genratingResult(per, p);
					System.out.println("Name: "+ name);
					System.out.println("Branch:"+ Branch );
					System.out.println("RollNO :"+ RollNO );
					System.out.println("PERCENTAGE: "+per);
					System.out.println("Result: "+ result);
				}
				else
					System.out.println("Roll no mismatch.");
			}
			else
				System.out.println("Invalid RollNo");
		}
		else
		System.out.println("Invalid BRanch");
		sc.close();
	}

}
