public class Customer
{
    private Integer id;
    private String name;
    private String address;
    private Account internetAccount;

    public Customer(int id, String name, String address, Account internetAccount)
    {
        setId(id);
        setName(name);
        setAddress(address);
        setInternetAccount(internetAccount);
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        if(id>0)
        {
            this.id = id;
        }
        else{
            System.out.println("Invalid Id");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        if(name.matches("[a-zA-Z]+")) {
            this.name = name;
        }
        else {
            System.out.println("Invalid Name !");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address)
    {
        if(address.matches("[a-zA-Z]+")) {
            this.address = address;
        }
        else {
            System.out.println("Invalid Address !");
        }
    }

    public Account getInternetAccount() {
        return internetAccount;
    }

    public void setInternetAccount(Account internetAccount)
    {
        this.internetAccount = internetAccount;
    }
}
