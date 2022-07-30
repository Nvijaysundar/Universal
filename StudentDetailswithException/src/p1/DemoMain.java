package p1;
import p2.*;
import java.util.*;
@SuppressWarnings("serial")
public class DemoMain extends Exception {

		public DemoMain(String msg)
		{
			super(msg);
		}
		
	public static void main(String[] args) throws CheckBranch, DemoMain {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> Al = new ArrayList<Student>();
		try
		{
			int n = Integer.parseInt(sc.nextLine());
			for(int i=0;i<n;i++)
			{
				Student St = new Student();
				System.out.println("Enter Sudent Name");
				St.name = sc.nextLine();
				System.out.println("Enter Branch");
				St.Branch = sc.nextLine();
				CheckBranch c = new CheckBranch("Invalid Branch");
				c.verify(St.Branch);
				System.out.println("Enter RollNo");
				St.Rollno = sc.nextLine();
				GenerateBranch G = new GenerateBranch();
				String res=G.GenerateB(St.Rollno.substring(6,8));
				
				if(res==null)
				{
					DemoMain ob = new DemoMain("Invalid Rollno");
					throw ob;
				}
				boolean fail = false;
				for(int j=1;j<=4;j++)
				{
					
					
					try {
						System.out.println("ENter sub"+j);
					 int sub = Integer.parseInt(sc.nextLine());
					 if(sub<0 || sub>100)
					 {
						 DemoMain ob = new DemoMain("Invalid Marks");
						 throw ob;
					 }
					 if(sub<50)
					 {
						 fail = true;
					 }
					 St.totmarks += sub;
					}
					catch(DemoMain ob)
					{
						System.out.println(ob);
					}
				}
				St.per = (float) (St.totmarks/4.0);
				GeneratingResult gr = new GeneratingResult(); 
				St.Result  = gr.GenerateR(St.per,fail);
				Al.add(St);
			}
			Spliterator<Student> sp = Al.spliterator();
			sp.forEachRemaining( (K)-> {
				System.out.println(K.toString());
			});
		}
		catch(CheckBranch| DemoMain ob)
		{
			System.out.println(ob);
			ob.printStackTrace();
		}
		finally
		{
			sc.close();
		}
		
		
	}

}
