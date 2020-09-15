/* welcome to Employee Wage Computation */
import java.util.*;
public class EmpWageComputation
{
	//constant variables
	public static final int wagePerHour=20;
        public static final int fullDayHour=8;
	public static final int partTimeHour=fullDayHour/2;

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
		//calculates daily wage of full time employee
		int fullTimeEmployeeDailyWage=wagePerHour*fullDayHour;
		//calculates daily wage of part time employee
		int partTimeEmployeeDailyWage=wagePerHour*partTimeHour;
		System.out.println("daily wage of full time employee is : "+fullTimeEmployeeDailyWage);
		System.out.println("daily wage of part time employee is : "+partTimeEmployeeDailyWage);
	}




}

