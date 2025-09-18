public class VisitingFaculty extends Faculty
{
    private double salaryPerHour;
    private double hours;

    public VisitingFaculty(int id, String name, double salaryPerHour, double hours)
    {
        super(id, name);
        setSalaryPerHour(salaryPerHour);
        setHours(hours);
    }

    @Override
    public double calculateSalary()
    {
        return salaryPerHour * hours;
    }

    @Override
    public String toString()
    {
        return "\n" +
                "-------------------------------" +
                "Information of Visiting Faculty " + "\n"
                +super.toString()
                + "Salary per hour : " + salaryPerHour + "\n"
                + "Hours : " + hours + "\n"
                + "Salary : " + calculateSalary();
    }

    public void setSalaryPerHour(double salaryPerHour)
    {
        if(salaryPerHour>0)
        {
            this.salaryPerHour = salaryPerHour;
        }
        else
        {
            System.out.println("Invalid salary per hour");
        }
    }

    public void setHours(double hours)
    {
        if(hours >0)
        {
            this.hours = hours;
        }
        else
        {
            System.out.println("Invalid hours....hours must be in positive integers");
        }
    }
}
