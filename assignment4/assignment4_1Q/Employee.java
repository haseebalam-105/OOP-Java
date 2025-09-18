public class Employee
{
	private int employeeId;
	private String employeeName;
	private Address employeeAddress;
	
//Constructors:

	public Employee(int employeeId , Address employeeAddress)
	{
		setId(employeeId);
		setAddress(employeeAddress);
	}

//Setter Methods:
	
	public void setName(String employeeName)
	{
		this.employeeName = employeeName;
	}
	
	public void setId(int employeeId)
	{
		this.employeeId = employeeId;
	}
	
	public void setAddress(Address employeeAddress)
	{
		this.employeeAddress = employeeAddress;
	}
	
	
	public void displayInfo()
	{
		System.out.println("Employee Id : " + employeeId);
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Street No : " + employeeAddress.getStreetNumber());
		System.out.println("City : " + employeeAddress.getCity());
		System.out.println("Country : " + employeeAddress.getCountry());
	}
}