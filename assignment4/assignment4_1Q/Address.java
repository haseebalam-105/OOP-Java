public class Address
{
	private int streetNumber;
	private String city;
	private String country;
	
//Constructor:

	public Address(int streetNumber , String city , String country)
	{
		setStreetNumber(streetNumber);
		setCity(city);
		setCountry(country);
	}

//Setters methods:
	
	public void setStreetNumber(int streetNumber)
	{
		if(streetNumber<0)
		{
			this.streetNumber = 1;
		}
		else
		{
			this.streetNumber = streetNumber;
		}
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	
//Getters Methods:

	public int getStreetNumber()
	{
		return streetNumber;
	}
	public String getCity()
	{
		return city;
	}
	public String getCountry()
	{
		return country;
	}
	
}