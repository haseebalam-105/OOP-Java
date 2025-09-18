public class CommisionEmployee
{
    private String firstName;
    private String lastName;
    private double grossSales;
    private double commissionRate;

    public CommisionEmployee(String firstName, String lastName, double grossSales, double commissionRate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }


    public double getGrossSales()
    {
        return grossSales;
    }

    public void setGrossSales(double grossSales)
    {
        if(grossSales>0)
        {
            this.grossSales =grossSales;
        }
        else
        {
            System.out.println("Your gross Sale is less than zero");
        }
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate)
    {
        if(commissionRate>0 || commissionRate<1)
        {
            this.commissionRate = commissionRate;
        }
        else
        {
            System.out.println("Your commission Rate is invalid !");
        }
    }

    public double earnings()
    {
        return commissionRate * grossSales;
    }

    @Override
    public String toString()
    {
        return "Information of Employee : " + "\n" +
                "Name : " + firstName +" " + lastName + "\n" +
                "grossSales : " + grossSales + "\n" +
                "commissionRate : " + commissionRate +
                "\n";
    }
}
