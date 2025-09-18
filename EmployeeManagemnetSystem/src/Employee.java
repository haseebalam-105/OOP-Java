public abstract class Employee implements Payable
{
    protected String name;
    protected int id;
    protected double baseSalary;

    public Employee(String name, int id, double baseSalary)
    {
        this(name,id);
        this.baseSalary = baseSalary;
    }

    public Employee(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculatePay();

    @Override
    public String getPaySlip()
    {
        return "Name : "+ getName() +
                " Id : "+ getId() ;
    }
}
