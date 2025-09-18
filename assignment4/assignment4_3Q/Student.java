import java.util.Scanner;
public class Student
{
	private String name;
	private String email;
	private int cnic;
	private Course course1;
	private Address postalAddress;
	private PhoneNumber contactNumber;
	
	Scanner input = new Scanner(System.in);
	
	
//Instance block
	{
		System.out.print("Enter the Email of the Student: ");
		email = input.nextLine();
	}
		
	public Student(String name ,int cnic , Address postalAddress,Course course1)
	{
		setName(name);
		setCNIC(cnic);
		setPostalAddress(postalAddress);
		setCourseCode(course1);
	}

//Setters Methods:
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setCNIC(int cnic)
	{
		this.cnic = cnic;
	}
	public void setPostalAddress(Address postalAddress)
	{
		this.postalAddress = postalAddress;
	}
	public void setCourseCode(Course course1)
	{
		this.course1 = course1;
	}
	
	
//Getters Methods:

	public String getName()
	{
		return name;
	}
	public int getCNIC()
	{
		return cnic;
	}
	public Address getPostalAddress()
	{
		return postalAddress;
	}
	

	
	
	public void display()
	{
		System.out.printf("Name: %s %n",name);
		System.out.printf("CNIC: %d %n",cnic);
		System.out.printf("Email: %s %n",email);
		
		System.out.printf("Street Address: %s %n",postalAddress.getStreetAddress());
		System.out.printf("Town Address: %s %n",postalAddress.getTown());
		System.out.printf("City Address: %s %n",postalAddress.getCity());
		System.out.printf("Country Address: %s %n",postalAddress.getCountry());
		
		System.out.printf("Country Code : %d %n",postalAddress.getPhoneNumber().getCountryCode());
		System.out.printf("City Code: %d %n",postalAddress.getPhoneNumber().getCityCode());
		System.out.printf("Line Number: %d %n",postalAddress.getPhoneNumber().getLineNumber());
		
		System.out.println("1 Course Code:  "+ course1.getCourseCode());
		System.out.println("2 Course Title:  "+ course1.getCourseTitle());
		
	}
	
	
}