public class Address
{
	private String streetAddress;
	private String town;
	private String city;
	private String country;
	private PhoneNumber phoneNumber;
	
	public Address(String streetAddress,String town,String city,String country,PhoneNumber phoneNumber)
	{
		setStreetAddress(streetAddress);
		setTown(town);
		setCity(city);
		setCountry(country);
		setPhoneNumber(phoneNumber);
	}
	
//Setters Methods:

	public void setStreetAddress(String streetAddress)
	{
		this.streetAddress=streetAddress;
	}
	public void setTown(String town)
	{
		this.town = town;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	
	public void setPhoneNumber(PhoneNumber phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
//Getters Methods:

	public String getStreetAddress()
	{
		return streetAddress;
	}
	public String getTown()
	{
		return town;
	}
	public String getCity()
	{
		return city;
	}
	public String getCountry()
	{
		return country;
	}
	public PhoneNumber getPhoneNumber()
	{
		return phoneNumber;
	}
}