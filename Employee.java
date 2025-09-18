
class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

}


public class Employee
{
    public static void main(String[] args)
    {
        Employee1 haseeb = new Employee1();
        haseeb.setName("Haseeb Alam");
        System.out.println(haseeb.getName());
        haseeb.salary =25;
        System.out.println(haseeb.getSalary());


    }
}
