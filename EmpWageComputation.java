/* welcome to Employee Wage Computation */
import java.util.*;
public class EmpWageComputation
{
	//constant variables
	public static final int wagePerHour=20;
	public static final int isFullTime=1;
	public static final int isPartTime=0;
	public static final int numberOfWorkingDays=20;
	public static final int numberOfWorkingHours=100;
	public static void main(String[] args)
	{
		WageCalculation();
	}

	public static void WageCalculation()
	{
		int workingHr=0;
                int totalSalary=0;
                Random random=new Random();
                int employeeType=random.nextInt(3);
                int totalWorkingHrs=0;
                for(int day=1;day<=numberOfWorkingDays && totalWorkingHrs<=numberOfWorkingHours;day++)
                {
                        switch(employeeType)
                        {
                                case isFullTime:
                                                workingHr=8;
                                                break;
                                case isPartTime:
                                                workingHr=4;
                                                break;
                                default:
                                                workingHr=0;
                        }
                        if(totalWorkingHrs==96||totalWorkingHrs==94)
                        {
                                if (workingHr==8)
                                {
                                        break;
                                }
                        }
                        else if(totalWorkingHrs==98)
                        {
                                break;
                        }
                        totalWorkingHrs+=workingHr;
                        int dailyWage=wagePerHour*workingHr;
                        totalSalary+=dailyWage;
                }
                System.out.println("current month wage of employee is : "+totalSalary);

	}



}


