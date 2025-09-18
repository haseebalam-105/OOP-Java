public class EmployeeTest
{
	public static void main(String[] args)
	{
		
// Make the objects of Class Date:
		
		Date date1 = new Date(06,06,2004);
		Date date2 = new Date(15,9,2023);
		
		Employee employee1 = new Employee("Haseeb","Alam",date1,date2);
		
		employee1.displayInfo();
	}
}