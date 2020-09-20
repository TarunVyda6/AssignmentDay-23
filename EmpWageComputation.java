	/* welcome to Employee Wage Computation */
import java.util.*;

public class EmpWageComputation
{

        public static final int isFullTime=1;
        public static final int isPartTime=0;
        private int numOfCompany=0;
        private CompanyEmpWage[] companyEmpWageArray;

        public EmpWageComputation()
        {
                companyEmpWageArray=new CompanyEmpWage[5];
        }
        private void addCompanyEmpWage(String company,int wagePerHour, int numberOfWorkingDays,int numberOfWorkingHours)
        {
                companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company,wagePerHour, numberOfWorkingDays,numberOfWorkingHours);
                numOfCompany++;
        }
        private void computeEmpWage()
        {
                for(int i=0;i<numOfCompany;i++)
                {
                        companyEmpWageArray[i].setTotalEmpWage(this.wageCalculation(companyEmpWageArray[i]));
                        System.out.println(companyEmpWageArray[i]);
                }
        }




        public static void main(String[] args)
        {
                EmpWageComputation allCompanies=new EmpWageComputation();
                allCompanies.addCompanyEmpWage("MICROSOFT",20,20,100);
                allCompanies.addCompanyEmpWage("GOOGLE",40,40,100);
                allCompanies.computeEmpWage();
        }
        public int wageCalculation(CompanyEmpWage companyEmpWage)
        {
                int workingHr=0;
                Random random=new Random();
                int employeeType=random.nextInt(3);
                int totalWorkingHrs=0;
                for(int day=1;day<=companyEmpWage.numberOfWorkingDays && totalWorkingHrs<=companyEmpWage.numberOfWorkingHours;day++)
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
                }
                return totalWorkingHrs * companyEmpWage.wagePerHour;
        }

}

class CompanyEmpWage
{

        public final int wagePerHour;
        public final int numberOfWorkingDays;
        public final int numberOfWorkingHours;
        public final String company;
        public int totalEmpWage;

         public CompanyEmpWage(String company,int wagePerHour, int numberOfWorkingDays,int numberOfWorkingHours)
        {
                this.company=company;
                this.wagePerHour=wagePerHour;
                this.numberOfWorkingDays=numberOfWorkingDays;
                this.numberOfWorkingHours=numberOfWorkingHours;
        }
        public void setTotalEmpWage(int totalEmpWage)
        {
                this.totalEmpWage=totalEmpWage;
        }
        @Override
         public String toString()
        {
                return "total emp wage for "+company+" is:"+totalEmpWage;
        }
}
