public class Employee
{
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee(String firstName,String lastName,double monthlySalary)
	{
		setFirstName(firstName);
		setLastName(lastName);
		setMonthlySalary(monthlySalary);
	}
	
	public void setFirstName(String firstName)
	{
		if (firstName ==null || firstName.isEmpty())
		{
			System.out.println("Enter the correct name of the Employee");
			return;
		}
		else
		{
			this.firstName = firstName;
		}
	}
	
	public void setLastName(String lastName)
	{
		if (lastName ==null || lastName.isEmpty())
		{
			System.out.println("Enter the correct name of the Employee");
			return;
		}
		else
		{
			this.lastName = lastName;
		}
	}
	
	public void setMonthlySalary(double monthlySalary)
	{
		if (monthlySalary < 0)
		{
			System.out.println("Enter the correct monthly Salary of the Employee");
			return;
		}
		else
		{
			this.monthlySalary = monthlySalary;
		}
	}
	
	public double yearlySalary()
	{
		double yearlySalary = monthlySalary * 12;
		return yearlySalary;
	}
	public double yearlyTotalSalary()
	{
		double yearlySalary = yearlySalary();
		double bonusSalary = ((yearlySalary * 10)/100) + yearlySalary;
		return bonusSalary;
	}
	
	public void displaySalary()
	{
		System.out.println("First name of the Employee is :  " + firstName);
		System.out.println("Last name of the Employee is :  " + lastName);
		System.out.println("Yearly Salary of the Employee is :  " + yearlySalary());
		System.out.println("Yearly Salary with bonus of the Employee is :  " + yearlyTotalSalary());
	}
	
}