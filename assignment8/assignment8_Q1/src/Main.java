import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first name of Employee : ");
        String firstName = sc.nextLine();

        System.out.print("Enter the last name of Employee : ");
        String lastName = sc.nextLine();

        System.out.print("Enter the gross Sales of Employee : ");
        double grossSalary  = sc.nextDouble();

        System.out.print("Enter the commission Rate of Employee : ");
        double commissionRate = sc.nextDouble();

        System.out.print("Enter the base Salary of Employee : ");
        double baseSalary = sc.nextDouble();

//Creating reference of base class and assigning it to the child class object

        CommisionEmployee employee1 = new BasePlusCommisionEmployee(firstName,lastName,grossSalary,commissionRate,baseSalary);

        System.out.println(employee1.toString());
        System.out.println("Earnings of the Employee " + employee1.earnings());

    }
}
