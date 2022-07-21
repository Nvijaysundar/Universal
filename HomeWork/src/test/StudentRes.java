package test;
public class StudentRes {

		public String genratingResult(float per, boolean p)
		{
			if(p)
			{
				return "Fail";
			}
			else if(per>=70 && per<=100)
			{
				return "Distinction";
			}
			else if(per>=60 && per<70)
				return "First class";
			else if(per>=50 && per<60)
				return "Second class";
			else if(per>=40  && per<50)
				return "Third Class";
			else
			{
				return "Fail";
			}
				
			
		}
}
