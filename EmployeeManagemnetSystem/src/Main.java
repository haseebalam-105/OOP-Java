import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Payable> list = new ArrayList<>();

        list.add(new FullTimeEmployee("Haseeb",1001,300000));
        list.add(new partTimeEmployee("Zohaib",1002,20));
        list.add(new ContractBase("Ali",1003,3000));

        for(Payable p : list)
        {
            System.out.println(p.getPaySlip());
        }

    }
}