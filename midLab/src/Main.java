import java.util.ArrayList;

public class Main
{
    ArrayList<Customer> list;

    public Main()
    {
        list = new ArrayList<>();
    }

    public void addCustomer(Customer customer)
    {
        list.add(customer);
    }

    public void removeCustomer(int id)
    {
        for(Customer c : list)
        {
            if(c.getId() == id )
            {
                list.remove(id);
            }
            else {
                System.out.println("Invalid index id");
            }
        }
    }

    public void updatePlan(int id , InternetPlanType plan)
    {
        for(Customer c : list)
        {
            if(c.getId() == id)
            {
                c.getInternetAccount().updatePlan(plan);
            }
        }
    }

    public void generateBill(int id)
    {
        for(Customer c : list)
        {
            if(c.getId() == id)
            {
                System.out.println(c.getId());
                System.out.println("Total Bill of name " + c.getName() + " is : " +c.getInternetAccount().calculateBill());

            }
        }


    }
    public static void main(String[] args)
    {

        System.out.println("Welcome to our Internet House ...");

        InternetServiceProvider p1 = new InternetServiceProvider("PTCL","Pakistan" );
        p1.display();

        Main m = new Main();

        Account account1 = new Account(1001 , InternetPlanType.BASIC , 600.0 , 0);
        Account account2 = new Account(1002 , InternetPlanType.UNLIMITED , 500.0 , 0);
        Account account3 = new Account(1003 , InternetPlanType.UNLIMITED , 800.0 , 0);

        Customer c1 = new Customer(1 ,"Haseeb" ,"Lahore" , account1);
        Customer c2 =new Customer(2,"hassan" , "Karachi" ,account2);
        Customer c3 =new Customer(3,"Ali" , "Skp" ,account3);

        m.addCustomer(c1);
        m.addCustomer(c2);
        m.addCustomer(c3);

        m.generateBill(1);
        m.generateBill(2);
        m.generateBill(3);

        m.removeCustomer(2);

        m.generateBill(1);
        m.generateBill(2);
        m.generateBill(3);

        m.updatePlan(1,InternetPlanType.MEDIUM);

        m.generateBill(1);
        m.generateBill(2);
        m.generateBill(3);

    }

}