public class Student {
    private int id;
    private String name;
    private double gpa;
    private Address address;

    public Student(int id, String name, double gpa,Address address) {
        setId(id);
        setName(name);
        setGpa(gpa);
        setAddress(address);
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public String toFileString() {
        return String.format("%-10d %-20s %-20.2f %-20s %-20s", id, name, gpa,address.getCity(),address.getCountry());

    }
}
