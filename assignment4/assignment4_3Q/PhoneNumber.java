public class PhoneNumber
{
	private int countryCode;
	private int cityCode;
	private int lineNumber;
	
	public PhoneNumber(int countryCode,int cityCode,int lineNumber)
	{
		setCountryCode(countryCode);
		setCityCode(cityCode);
		setLineNumber(lineNumber);
	}
	
//Setters Methods:

	public void setCountryCode(int countryCode)
	{
		this.countryCode = countryCode;
	}
	public void setCityCode(int cityCode)
	{
		this.cityCode = cityCode;
	}
	public void setLineNumber(int lineNumber)
	{
		this.lineNumber = lineNumber;
	}
	
//Getters Methods
	public int getCountryCode()
	{
		return countryCode;
	}
	public int getCityCode()
	{
		return cityCode;
	}
	public int getLineNumber()
	{
		return lineNumber;
	}
	
}