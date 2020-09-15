/* welcome to Employee Wage Computation */
import java.util.*;
public class EmpWageComputation
{
	//constant variables
	public static final int wagePerHour=20;
	public static final int isFullTime=1;
	public static final int isPartTime=0;
	public static final int numberOfWorkingDays=20;
	public static void main(String[] args)
	{
		int workingHr=0;

		Random random=new Random();
		int employeeType=random.nextInt(3);
		switch(employeeType)
		{
                	case isFullTime:
                        		System.out.println("employee is present and he is a full time employee");
                        		workingHr=8;
                        		break;
                	case isPartTime:
                        		System.out.println("employee is present and he is a part time employee");
		                        workingHr=4;
		                        break;
		     	default:
		                        System.out.println("employee is absent");
		                        workingHr=0;
                }
		//calculates daily wage of employee
		int dailyWage=wagePerHour*workingHr;
		//calculates monthly wage of employee
		int monthlyWage=dailyWage*numberOfWorkingDays;
		System.out.println("his daily wage is : "+monthlyWage);
	}




}

