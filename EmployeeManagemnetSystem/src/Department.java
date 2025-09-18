import java.util.ArrayList;

public class Department
{
    private String departmentName;
    private ArrayList<Employee> list;

    public Department(String departmentName)
    {
        this.departmentName = departmentName;
        this.list = new ArrayList<>();
    }

    public void addEmployee(Employee e)
    {
        list.add(e);
    }

    public void display()
    {
        System.out.println("Employees informations ");
        for(Employee e : list)
        {
            System.out.println(e.getPaySlip());
        }
    }
}
