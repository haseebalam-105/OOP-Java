public class partTimeEmployee extends Employee
{
    private final double hourlyPay = 2000;
    private int days;

    public partTimeEmployee(String name, int id, int days)
    {
        super(name, id);
        this.days = days;
    }

    @Override
    public double calculatePay()
    {
        return hourlyPay* days;
    }

    @Override
    public String getPaySlip() {
        return super.getPaySlip() +
                " Hourly Pay : " + hourlyPay +
                " Salary of " + days +" days : " + calculatePay();
    }
}
