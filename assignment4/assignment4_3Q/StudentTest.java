import java.util.Scanner;

public class StudentTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

//Student Information:
	
		System.out.print("Enter the name of student: ");
		String name = input.nextLine();
		System.out.print("Enter the cnic of student: ");
		int cnic = input.nextInt();
		input.nextLine();

//Address Information:

		System.out.print("Enter the street Address of student: ");
		String streetAddress = input.nextLine();
		System.out.print("Enter the town of student: ");
		String town = input.nextLine();
		System.out.print("Enter the city of student: ");
		String city = input.nextLine();
		System.out.print("Enter the country of student: ");
		String country = input.nextLine();

//Number Information:

		System.out.print("Enter the country code of student: ");
		int countryCode = input.nextInt();
		System.out.print("Enter the city code of student: ");
		int cityCode = input.nextInt();
		System.out.print("Enter the Line Number of student: ");
		int lineNumber = input.nextInt();
		
//Course Information:
		
		System.out.print("Enter the course code of student: ");
		int courseCode = input.nextInt();
		input.nextLine();
		System.out.print("Enter the course Title of student: ");
		String courseTitle = input.nextLine();
		
//Objects

		Course course1 = new Course(courseCode,courseTitle);
		
		PhoneNumber phoneNumber = new PhoneNumber(countryCode,cityCode,lineNumber);
		
		Address postalAddress = new Address(streetAddress,town,city,country,phoneNumber);
		
		Student s1 = new Student(name,cnic,postalAddress,course1);
		
		s1.display();
		
		Student s2 = new Student("Iqra" , 22222 , postalAddress,course1);
		postalAddress.setTown(" Peshawar");
		s2.display();
	}
}