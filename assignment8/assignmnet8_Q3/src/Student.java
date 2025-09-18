public class Student extends Person
{
    private String progran;
    private int year;
    private double fee;

    public Student(String name, String address, String progran, int year, double fee)
    {
        super(name, address);
        this.progran = progran;
        this.year = year;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Program : " + progran + "\n"
                +"Year : " + year + "\n"
                +"Fee : " +fee + "\n";
    }

    public String getProgran() {
        return progran;
    }

    public void setProgran(String progran) {
        this.progran = progran;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year)
    {
        if(year > 0 || year <2024)
        {
            this.year = year;
        }
        else {
            System.out.println("Invalid year!");
        }
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee)
    {
        if(fee>0)
        {
            this.fee = fee;
        }
        else{
            System.out.println("Invalid fee! ");
        }
    }
}
