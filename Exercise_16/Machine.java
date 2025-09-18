import java.util.Scanner;
public class Machine
{
	private String firstName;
	private String lastName;
	private int days;
	private int months;
	private int years;
	
	int day;
	int month;
	int year;
	
	Scanner input = new Scanner(System.in);
	
	public Machine(String firstName,String lastName,int days,int months,int years)
	{
		setFirstName(firstName);
		setLastName(lastName);
		setDay(days);
		setMonth(months);
		setYear(years);
	}


	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	public String getLastName()
	{
		return lastName;
	}
	
	public void setDay(int days)
	{
		this.days=days;
	}
	public int getDay()
	{
		return days;
	}
	
	public void setMonth(int months)
	{
		this.months=months;
	}
	public int getMonth()
	{
		return months;
	}
	
	public void setYear(int years)
	{
		this.years=years;
	}
	public int getYear()
	{
		return years;
	}
	
	public void Date()
	{
		System.out.println("Enter the today date with day , month and year");
		day = input.nextInt();
		month = input.nextInt();
		year = input.nextInt();
		
		System.out.printf("Day: %d Month: %d Year: %d %n",day,month,year);
	}
		
	public int Age()
	{
		int age = year-years;
		return age;
	}
	
	public double MaxHeartRate()
	{
		if(Age()<0)
		{
			System.out.println("Invalid Age! Try again");
			return 0;
		}
		else
		{
			double heartRate = 220 - Age();
			return heartRate;
		}
	}
	
	public double RangeHeart50()
	{
		double rangeHeart = (50.0/100.0)* MaxHeartRate();
		return rangeHeart;
	}
	
	public double RangeHeart85()
	{
		double rangeHeart = ((85.0/100.0)* MaxHeartRate());
		return rangeHeart;
	}
	
 }