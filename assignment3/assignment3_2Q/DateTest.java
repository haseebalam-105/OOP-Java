import java.util.Scanner;

public class DateTest
{
	public static void main(String[] args)
	{
		int day;
		int month;
		int year;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the day:");
		day = input.nextInt();
		
		System.out.print("Enter the month:");
		month = input.nextInt();
		
		System.out.print("Enter the year:");
		year = input.nextInt();
		
		Date d1 = new Date();
		Date d2 = new Date(day,month,year);
		
		Date d3 = new Date(d2.getDay(),d2.getMonth(),d2.getYear());
		Date d4 = new Date(d3.getDay(),d3.getMonth(),d3.getYear());
		
		System.out.println(" ");
		
		System.out.println("For the Date 1:");
		d1.display();
		System.out.println(" ");
		
		System.out.println("For the Date 2:");
		d2.display();
		System.out.println(" ");
		
		System.out.println("For the Date 3:");
		d3.display();
		System.out.println(" ");
		
		System.out.println("For the Date 4:");
		d4.display();
		System.out.println(" ");
		
		
		
		System.out.print("Enter the month:");
		int month1 = input.nextInt();
		d3.setMonth(month1);
		
		System.out.println(" ");
		System.out.println("For the Date 1:");
		d1.display();
		System.out.println(" ");
		
		System.out.println("For the Date 2:");
		d2.display();
		System.out.println(" ");
		
		System.out.println("For the Date 3:");
		d3.display();
		System.out.println(" ");
		
		System.out.println("For the Date 4:");
		d4.display();
	}
}