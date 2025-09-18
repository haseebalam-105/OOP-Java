public class FullTimeEmployee extends Employee
{
    public FullTimeEmployee(String name, int id, double baseSalary)
    {
        super(name, id, baseSalary);
    }

    @Override
    public double calculatePay() {
        double increament = (double) (getBaseSalary() * 0.25);
        return getBaseSalary() + increament;
    }

    @Override
    public String getPaySlip() {
        return super.getPaySlip()+
                " Base Salary : " + getBaseSalary()+
                " Total Salary after increament : " + calculatePay();
    }
}
