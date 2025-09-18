public class Account
{
    private Integer accountId;
    private InternetPlanType planeType;
    private Double dataUsage;
    private double totalAmountDue;

    public Account(Integer accountId, InternetPlanType planeType, Double dataUsage, double totalAmountDue)
    {
       setAccountId(accountId);
       setPlaneType(planeType);
       setDataUsage(dataUsage);
       setTotalAmountDue(totalAmountDue);
    }

    public double calculateBill()
    {
        double price = planeType.getPrice();
        double dataLimit = planeType.getDataLimit();

        if(dataUsage > dataLimit)
        {
            double extraData = dataUsage - dataLimit;
            totalAmountDue = price + (extraData * 200);
        }
        else {
            totalAmountDue = price;
        }
        return totalAmountDue;
    }

    public void updatePlan(InternetPlanType plane)
    {
        planeType = plane;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public InternetPlanType getPlaneType() {
        return planeType;
    }

    public void setPlaneType(InternetPlanType planeType) {
        this.planeType = planeType;
    }

    public Double getDataUsage() {
        return dataUsage;
    }

    public void setDataUsage(Double dataUsage) {
        this.dataUsage = dataUsage;
    }

    public double getTotalAmountDue() {
        return totalAmountDue;
    }

    public void setTotalAmountDue(double totalAmountDue) {
        this.totalAmountDue = totalAmountDue;
    }
}
