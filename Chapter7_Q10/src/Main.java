import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Employees : ");
        int num = sc.nextInt();

        Employee[] e1 = new Employee[num];

        for (int i=0 ; i<num ; i++)
        {
            System.out.print("Enter the id of Employee : ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter the name of Employee : ");
            String name = sc.nextLine();

            System.out.print("Enter the Gross amount of the week : ");
            double grossSales = sc.nextDouble();

            e1[i] = new Employee(id , name , grossSales);

        }

        int i = 0;
        for(Employee employee : e1)
        {
            System.out.println("\n");
            System.out.println("Employee " + (++i) + " Information : ");
            System.out.println(employee.toString());

        }
    }
}