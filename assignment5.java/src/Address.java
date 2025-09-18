public class Address
{
    private int streetNo;
    private String city;
    private String country;

    public Address(int streetNo, String city, String country) {
        setStreetNo(streetNo);
        setCity(city);
        setCountry(country);
    }

    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
