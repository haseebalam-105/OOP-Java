public class Student extends Person
{
    private String program;
    private int year;
    private double fee;

    public Student(String name , Address address , String program , int year , double fee)
    {
        super(name,address);
        setProgram(program);
        setYear(year);
        setFee(fee);
    }

    public void displayStudent()
    {
        System.out.println ("Student Information... : ");
        System.out.printf ("Name : %s %n" , getName());
        System.out.printf ("City : %s %n" , getAddress().getCity());
        System.out.printf ("Country : %s %n" , getAddress().getCountry());
        System.out.printf ("Program : %s %n" , getProgram());
        System.out.printf ("Year : %d %n" , getYear());
        System.out.printf ("Fee : %.2f %n" , getFee());
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year)
    {
        if(year > 2000 || year <= 2024)
        {
            this.year = year;
        }
        else
        {
            System.out.println("Invalid year ! ");
        }

    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee)
    {
        if(fee > 0)
        {
            this.fee = fee;
        }
        else
        {
            System.out.println("Invalid fee !");
        }
    }
}
