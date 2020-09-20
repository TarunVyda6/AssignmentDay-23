/* welcome to Employee Wage Computation */
import java.util.*;

public class EmpWageComputation
{

	 public static final int isFullTime=1;
        public static final int isPartTime=0;
        private final int wagePerHour;
        private final int numberOfWorkingDays;
        private final int numberOfWorkingHours;
        private final String company;
	private int totalSalary;
	public EmpWageComputation(String company,int wagePerHour, int numberOfWorkingDays, int numberOfWorkingHours)
        {
                this.company=company;
                this.wagePerHour=wagePerHour;
                this.numberOfWorkingDays=numberOfWorkingDays;
                this.numberOfWorkingHours=numberOfWorkingHours;
        }

	public static void main(String[] args)
	{
		EmpWageComputation microSoft=new EmpWageComputation("MICROSOFT",20,20,100);
		microSoft.wageCalculation();
		System.out.println(microSoft);
		EmpWageComputation google=new EmpWageComputation("GOOGLE",45,20,100);
		google.wageCalculation();
		System.out.println(google);
	}
	public void wageCalculation()
	{
		int workingHr=0;
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
                       this.totalSalary+=dailyWage;
                }
	}
	public String toString()
	{
		return "total emp wage for "+company+" is:"+totalSalary;
	}


}


