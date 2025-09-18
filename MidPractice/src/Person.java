public class Person
{
    private Integer id = null;
    private String name = null;
    private String address = null;

    public Person(Integer id, String name, String address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return
                "id : " + id +"\n"+
                "name :" + name + "\n" +
                "address : " + address + "\n" ;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id)
    {
        if(id>0)
        {
            this.id = id;
        }
        else{
            System.out.println("Invalid Id!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        if(name.matches("[a-zA-z]+"))
        {
            this.name = name;
        }
        else{
            System.out.println("Invalid name");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
