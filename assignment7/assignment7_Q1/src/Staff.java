public class Staff extends Person
{
    private double pay;

    public Staff(String name,Address address,double pay)
    {
        super(name,address);
        setPay(pay);
    }

    public void displayStaff()
    {
        System.out.println ("Staff Information... : ");
        System.out.printf ("Name : %s %n" , getName());
        System.out.printf ("City : %s %n" , getAddress().getCity());
        System.out.printf ("Country : %s %n" , getAddress().getCountry());
        System.out.printf ("Pay : %.2f %n" , getPay());
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
}
