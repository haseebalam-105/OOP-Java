public class PermanentFaculty extends Faculty
{
    private double salary;

    public PermanentFaculty(int id, String name, double salary)
    {
        super(id, name);
        setSalary(salary);
    }

    @Override
    public double calculateSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return "\n" + "-------------------"+ "\n"
                +"Information of Permanent Faculty " +"\n"
                +super.toString()
                + "salary : " + calculateSalary();
    }

    public void setSalary(double salary)
    {
        if(salary>0)
        {
            this.salary = salary;
        }
        else
        {
            System.out.println("Invalid salary !");
        }
    }
}
