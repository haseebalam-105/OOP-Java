

public class Student
{
    private int id;
    private String name;
    private Address[] addresses ;

    public Student(int id , String name , Address[] addresses) {
        setId(id);
        setName(name);
        setAddresses(addresses);
    }

    public Address[] getAddresses() {
        return addresses;
    }

    public void setAddresses(Address[] addresses) {
        this.addresses = addresses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayinfo()
    {
        System.out.println("Id : " + id);
        System.out.println("name : " + name);

        for(Address address1 : addresses)
        {
            System.out.println("StreetNo : " + address1.getStreetNo());
            System.out.println("City : " + address1.getCity());
            System.out.println("Country : " + address1.getCountry());
        }

    }
}
