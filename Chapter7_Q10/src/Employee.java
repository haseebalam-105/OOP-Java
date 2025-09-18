public class Employee extends Person
{
    private double grossSales;
    private static final double commissionRate = 0.09;
    private static final double basicSalary = 200;

    public Employee(int id, String name, double grossSales)
    {
        super(id, name);
        setGrossSales(grossSales);
    }

    public void setGrossSales(double grossSales)
    {
        if(grossSales >= 0)
        {
            this.grossSales = grossSales;
        }
        else
        {
            System.out.println("Your gross Sales less than zero");
        }
    }

    public double calculateSalary()

    {
        return (grossSales * commissionRate) + basicSalary;
    }

    @Override
    public String toString()
    {
        return
                "Id : " + getId() +
                "\nName : " + getName() +
                "\ngrossSales : " + grossSales + " $ " +
                "\nTotal Salary : " + calculateSalary() + " $ " ;
    }
}
