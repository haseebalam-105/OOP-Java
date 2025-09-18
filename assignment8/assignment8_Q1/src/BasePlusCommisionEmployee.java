public class BasePlusCommisionEmployee extends CommisionEmployee
{
    private double baseSalary;

    public BasePlusCommisionEmployee(String firstName, String lastName, double grossSales, double commissionRate, double baseSalary)
    {
        super(firstName, lastName, grossSales, commissionRate);
        this.baseSalary = baseSalary;

    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary)
    {
        if(baseSalary>500)
        {
            this.baseSalary = baseSalary;
        }
        else
        {
            System.out.println("Salary is lee than 500 ");
        }
    }

    @Override
    public double earnings()
    {
        return getCommissionRate() * getGrossSales() * baseSalary;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Base Salary : "+ baseSalary;
    }
}
