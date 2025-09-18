public class Faculty
{
    private int id;
    private String name;

    public Faculty(int id, String name)
    {
        setId(id);
        setName(name);
    }

    public double calculateSalary()
    {
        return 0;
    }

    @Override
    public String toString()
    {
        return "id : " + id +"\n"
                + "name : " + name + "\n";
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
}
