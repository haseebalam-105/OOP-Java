public class Employee
{
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date hiringDate;
	
	public Employee(String firstName,String lastName,Date birthDate,Date hiringDate)
	{
		setFirstName(firstName);
		setLastName(lastName);
		setBirthDate(birthDate);
		sethiringDate(hiringDate);
	}
	
//Setters Methods:

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
		
	public void setBirthDate(Date birthDate)
	{
		this.birthDate = birthDate;
	}
	public void sethiringDate(Date hiringDate)
	{
		this.hiringDate = hiringDate;
	}
	
//Getters Methods
	
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	
//Getter for Birthday and hiringDate of data type "Date":
 
	public Date getBirthDate()
	{
		return birthDate;
	}
	public Date getHiringDate()
	{
		return hiringDate;
	}
	
//Display Method:
 
	public void displayInfo()
	{
		System.out.println(" ");
		System.out.println("....................");
		System.out.print ("Name: " + getFirstName() + " ");
		System.out.println (getLastName());
		System.out.print ("DOB: " + birthDate.getDay());
		System.out.print ("/ " + birthDate.getMonth());
		System.out.print ("/ " + birthDate.getYear());
		
		System.out.println(" ");
		System.out.print("Hiring Date: " + hiringDate.getDay());
		System.out.print("/ " + hiringDate.getMonth());
		System.out.print("/ " + hiringDate.getYear());
	}
	
}
	