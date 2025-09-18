public class Date
{
	private int day;
	private int month;
	private int year;
	Date d3;
	Date d4;
	
//Constructors 
	public Date()
	{
		this.day = 7;
		this.month = 10;
		this.year = 2020;
	}
	
	public Date(int day,int month,int year)
	{
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	
	
//Setters for the day,month and year

	public void setDay(int day)
	{
		if(day>30)
		{
			this.day = 1;
		}
		else
		{
			this.day = day;
		}
	}
	public void setMonth(int month)
	{
		if(month>12)
		{
			this.day = 1;
		}
		else
		{
			this.month = month;
		}
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	
//Getters for the day , month and year

	public int getDay()
	{
		return day;
	}
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}

	public void display()
	{
		System.out.printf("day: %d month: %d year: %d %n" , day , month , year);
	}
	
}