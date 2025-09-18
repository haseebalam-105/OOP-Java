import java.util.Scanner;
public class TestEmployee
{
	public static void main(String[] args)
	{
		String firstName;
		String lastName;
		double monthlySalary;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("    **Welcome to the office portal** ");
		System.out.println(" ");
		
		System.out.println("Enter the first name of the Employee ");
		firstName =input.nextLine();
		
		System.out.println("Enter the last name of the Employee ");
		lastName = input.nextLine();
		
		System.out.println("Enter the monthly salary of the Employee ");
		monthlySalary = input.nextInt();
		
		Employee employee1 = new Employee(firstName,lastName,monthlySalary);
		Employee employee2 = new Employee(firstName,lastName,monthlySalary);
		
		employee1.displaySalary();
		employee2.displaySalary();
		
	}
}