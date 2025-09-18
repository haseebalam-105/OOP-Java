public class Staff extends Person
{
    private String university;
    private double pay;

    public Staff(String name, String address, String university, double pay)
    {
        super(name, address);
        setUniversity(university);
        setPay(pay);
    }

    @Override
    public String toString()
    {
        return super.toString()
                + "University : " + university + "\n"
                + "Pay : " +pay + "\n";
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay)
    {
        if(pay>0)
        {
            this.pay = pay;
        }
        else{
            System.out.println("Invalid pay !");
        }
    }
}
