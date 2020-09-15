/* welcome to Employee Wage Computation */
import java.util.*;
public class EmpWageComputation
{
	public static void main(String[] args)
	{

		Random random=new Random();
		//creates a random value of 0 or 1
		int attendence=random.nextInt(2);
		// if employee is present then attendence will be 1
		// if employee is absent then attendence will be 0
		if(attendence==1)
		{
			System.out.println("employee is present");
		}
		else
		{
			System.out.println("employee is absent");
		}
	}




}

