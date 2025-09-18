public class Date
{
	private int date;
	private int month;
	private int year;
	
	public Date(int Date,int Month,int Year)
	{
		setDate(Date);
		setMonth(Month);
		setYear(Year);
	}
	
	public void setDate(int DATE)
	{
		this.date = DATE;
	}
	public void setMonth(int MONTH)
	{
		this.month = MONTH;
	}
	public void setYear(int YEAR)
	{
		this.year = YEAR;
	}
	
	public int getDate()
	{
		return date;
	}
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
	
	public void displayDate()
	{
		System.out.println("                   D  / M / Y                ");
		System.out.printf(" Today date is :  %d / %d / %d %n" ,date,month,year);
	}

}