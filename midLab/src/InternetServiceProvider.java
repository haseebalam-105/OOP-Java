import java.util.EnumSet;

public class InternetServiceProvider
{
    private String ispName;
    private String  ispAddress;
    private InternetPlanType planType;

    public InternetServiceProvider(String ispName, String ispAddress)
    {
        setIspName(ispName);
        setIspAddress(ispAddress);
    }

    InternetPlanType[]  types = InternetPlanType.values();

    public void display()
    {
        System.out.println("Internet service Provider Name : " + ispName);
        System.out.println("Internet service Provider Address : " + ispAddress);
        for (InternetPlanType p : types)
        {
            System.out.println("Internet service Provider Plan Types : " + p);
        }

    }

    public String getIspName()
    {
        return ispName;
    }

    public void setIspName(String ispName)
    {
        this.ispName = ispName;
    }

    public String getIspAddress() {
        return ispAddress;
    }

    public void setIspAddress(String ispAddress) {
        this.ispAddress = ispAddress;
    }

    public InternetPlanType getPlanType() {
        return planType;
    }

    public void setPlanType(InternetPlanType planType) {
        this.planType = planType;
    }
}
