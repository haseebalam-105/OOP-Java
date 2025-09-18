import java.util.Scanner;

public class EmployeeTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		Address address = new Address(69 , "Lahore" , "Pakistan");
		
		Employee e1 = new Employee(123 , address);
		Employee e2 = new Employee(456, address);
		
		System.out.print("Enter the name of Employee: ");
		String name1 = input.nextLine();
		
		e1.setName(name1);
		e1.displayInfo();
		
		
		System.out.printf("%nEnter the name of Employee: ");
		String name2 = input.nextLine();
		
		System.out.println(" ");
		System.out.println("Employee-2 Information");
		e2.setName(name2);
		e2.displayInfo();
		
	}
}