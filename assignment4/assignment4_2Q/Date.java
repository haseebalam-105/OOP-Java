public class Date
{
	private int day;
	private int month;
	private int year;
	
	public Date(int day,int month,int year)
	{
		setDay(day);
		setMonth(month);
		setYear(year);
	}

//Setters Methods:
	
	public void setDay(int day)
	{
		if(day>30 || day<0)
		{
			System.out.println("Day is invalid !");
		}
		else
		{
			this.day = day;
		}
	}
	public void setMonth(int month)
	{
		if(month>12 || month<0)
		{
			System.out.println("Month is invalid !");
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
	
//Getter Methods:
 
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

}